package Singleton;

public class SimplestSingleton {

    private static SimplestSingleton currentInstance = null;

    private SimplestSingleton() {}

    public static SimplestSingleton getInstance() {
        if (currentInstance == null) {
            currentInstance = new SimplestSingleton();
        }
        return currentInstance;
    }
}

//① 构造函数必须是私有，保证无法从外部创建
//② 成员变量必须是私有，保证无法从外部访问
//③ 使用getInstance()函数来获取该类的实例