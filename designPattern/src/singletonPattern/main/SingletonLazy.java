package singletonPattern.main;

/**
 * @Author: leo019527
 * @Date: 2019/12/27 22:23
 */
public class SingletonLazy {
    private static SingletonLazy instance = null;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(instance==null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
