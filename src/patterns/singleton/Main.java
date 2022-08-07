package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        Singleton singleton = Singleton.getInstance();
//        Singleton s2 = singleton.clone();
    }
}