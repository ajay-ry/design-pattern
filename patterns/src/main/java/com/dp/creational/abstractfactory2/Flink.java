package com.dp.creational.abstractfactory2;

public abstract class Flink implements DistributedSystem {
    public void getSession() {
        System.out.println("This is flink...");
    }
}
