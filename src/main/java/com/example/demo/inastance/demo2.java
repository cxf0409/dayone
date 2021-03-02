package com.example.demo.inastance;

public class demo2 {
    private static demo2 instance;
    private demo2(){}
    public static demo2 getInstance(){
        if(instance==null){
            instance=new demo2();
        }
        return instance;
    }

}
