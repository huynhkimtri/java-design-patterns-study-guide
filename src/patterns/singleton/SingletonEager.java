package patterns.singleton;

/**
 * So, this is our singleton class which makes sure that only one object of the class gets created
 * and even if there are several requests,
 * only the same instantiated object will be returned.
 * <p>
 * Problem:
 * the object would get created as soon as the class gets loaded into the JVM.
 * If the object is never requested, there would be an object useless inside the memory.
 */
public class SingletonEager {

    // provide a global variable that makes an object accessible
    // only one copy of the static variables of a class,
    public static SingletonEager sc = new SingletonEager();

    // To stop the class to get instantiated outside the class,
    // let’s make the constructor of the class as private.
    private SingletonEager() {
        // By keeping the constructor private, no other class can instantiate this class.
    }

    // providing a direct access to a class member is not a good idea
    // -> provide a method through which the sc variable will get access, not directly
    public static SingletonEager getInstance() {
        return sc;
    }
}
