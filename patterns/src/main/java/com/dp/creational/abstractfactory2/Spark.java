package com.dp.creational.abstractfactory2;

public abstract class Spark  implements DistributedSystem{
    public Spark(){
        System.out.println("Spark is a fault tolerant & in memory processing distributed system");
    }
}
