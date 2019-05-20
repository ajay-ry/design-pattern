package com.dp.creational.abstractfactory2;

public abstract class Hive implements DistributedSystem{
    public Hive(){
        System.out.println("Hive is a fault tolerant sql engine on top of Hadoop framework");
    }
}
