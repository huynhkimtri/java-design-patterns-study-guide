package patterns.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    public static final long serialVersionUID = 1L;

    private static Singleton sc = new Singleton();

    private Singleton() {
        if (sc != null) {
            throw new IllegalStateException("Already created!");
        }
    }

    public static Singleton getInstance() {
        return sc;
    }

    private Object readResolve() {
        return sc;
    }

    private Object writeResolver() {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, cannot be clonned");
    }

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = Singleton.class.getClassLoader();
        }
        return (classLoader.loadClass(classname));
    }


}
