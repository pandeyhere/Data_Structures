package DesignPatterns;

public class Singleton {

    private Singleton() {
    }

    private static Singleton single_instance = null;

    public static synchronized Singleton getInstance() {
        if (single_instance == null) {
            synchronized (Singleton.class) {
                if (single_instance == null) {
                    single_instance = new Singleton();
                }
            }
        }
        return single_instance;
    }

}
