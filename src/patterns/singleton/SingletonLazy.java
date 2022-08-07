package patterns.singleton;

public class SingletonLazy {

    private static SingletonLazy sc = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        // we check if the static variable sc is null
        if (sc == null) {
            // then instantiate the object and return it
            sc = new SingletonLazy();
        }
        return sc;
    }
}
