package week8;

public class Singleton {

    private volatile static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {//it prevents more than one thread create the class
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
