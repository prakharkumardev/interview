package dev.harsh.architect.designPatternJava.creational.singleton;

public class SingletonEarlyInitilization{
    private static SingletonEarlyInitilization instance = new SingletonEarlyInitilization();
    private SingletonEarlyInitilization(){
    }
    public static SingletonEarlyInitilization getInstance(){
        return instance;
    }
}

