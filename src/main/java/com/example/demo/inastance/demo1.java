package com.example.demo.inastance;

public class demo1 {
    private static demo1 instance=new demo1();

    private demo1() {
    }
    public static demo1 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        getInstance();
    }
}
