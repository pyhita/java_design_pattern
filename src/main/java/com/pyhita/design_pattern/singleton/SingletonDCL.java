package com.pyhita.design_pattern.singleton;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */

/**
 * 双重检查锁：饿汉式单例
 */
public class SingletonDCL {
    private static volatile SingletonDCL INSTANCE;

    private SingletonDCL() {}

    public static SingletonDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDCL();
                }
            }
        }
        return INSTANCE;
    }
}
