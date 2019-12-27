package singletonPattern.main;

/**
 * @Author: leo019527
 * @Date: 2019/12/27 22:26
 */
public class SingletonLazySecurity {
    private static SingletonLazySecurity instance = null;

    private SingletonLazySecurity(){}

    public synchronized static SingletonLazySecurity getInstance(){
        if(instance==null){
            instance = new SingletonLazySecurity();
        }
        return instance;
    }
}
