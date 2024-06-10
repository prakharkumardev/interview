package dev.harsh.architect.designpattern;
public class Singleton {
    private static Singleton INSTANCE = null;
    private Singleton(){

    }
    public static Singleton getInstance() throws Exception{

        if(INSTANCE == null){
            synchronized (Singleton.class){
                if(INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

}
