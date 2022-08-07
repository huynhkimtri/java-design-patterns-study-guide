package patterns.singleton;

public class SingletonLazyMultithreaded {

    private static SingletonLazyMultithreaded sc = null;

    public SingletonLazyMultithreaded() {
    }

    public static synchronized SingletonLazyMultithreaded getInstance() {
        if (sc == null) {
            sc = new SingletonLazyMultithreaded();
        }
        return sc;
    }
}
