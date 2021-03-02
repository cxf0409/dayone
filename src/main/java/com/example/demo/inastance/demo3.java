package com.example.demo.inastance;

import org.junit.Test;
import org.springframework.http.converter.json.GsonBuilderUtils;

/**
 * 单例模式懒汉式加锁
 */
public class demo3 {
    private static demo3 instance;
    private demo3(){};
    public static synchronized demo3 getInstance(){
        if (instance==null){
            instance = new demo3();
        }
        return instance;
    }

//    public demo3(){};
//
//    @Test
//    public void run(){
//        System.out.println("ssss");
//    }

}
