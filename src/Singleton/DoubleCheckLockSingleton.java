package Singleton;

public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton currentInstance = null;

    private DoubleCheckLockSingleton() {

    }

    public static DoubleCheckLockSingleton getInstance() {
        if (currentInstance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (currentInstance == null) {
                    currentInstance = new DoubleCheckLockSingleton();
                }
            }
        }
        return currentInstance;
    }
}

// only synchronize codes for generating the instance and use volatile to forbid JVM sorts again

/*
    under norm case, "currentInstance = new CurrentInstance()" includes 3 steps:
        1) distribute memory space for currentInstance;
        2) initialize currentInstance;
        3) make currentInstance indicating the distributed memory space;

    JVM具有指令重排的性质，所以有时候生成实例并不是按照1->2->3的顺序，而是可能按照1->3->2的顺序
    在单线程下这一性质不会有任何影响，但多线程会出现获得还没有初始化的实例：

    一个线程按1->3->2顺序创建实例，在前两步完成后currentInstance有了内存空间，也将currentIn
    -stance指向了分配的内存空间。此时若另一个线程获取该实例，currentInstance将不为null，但它
    却还没有初始化。

*/