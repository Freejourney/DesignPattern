package Singleton;

public class CostSingleton {

    private static CostSingleton currentInstance = new CostSingleton();

    private CostSingleton() {

    }

    public static CostSingleton getInstance() {
        return currentInstance;
    }
}

// directly make instance to private member instance

// this way can effectively avoid conflicts of multi-threads case, but increases unnecessary costs early
