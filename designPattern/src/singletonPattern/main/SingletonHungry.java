package singletonPattern.main;

/**
 * @Author: leo019527
 * @Date: 2019/12/27 22:20
 * 饿汉模式:在类加载的时候就对实例进行创建，实例在整个程序周期都存在。
 * 好处是只在类加载的时候创建一次实例，不会存在多个线程创建多个实例的情况，避免了多线程同步的问题
 * 缺点是即使这个单例没有用到也会被创建，而且在类加载之后就被创建，内存就被浪费了
 * 无法做到延迟创建对象。但是我们很多时候都希望对象可以尽可能地延迟加载，从而减小负载
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance(){
        return instance;
    }
}
