package com.dp.creational.abstractfactory2;

public class ApacheFactory extends AbstractFactory {
    public DistributedSystem getHive() {
        return new ApacheHive();
    }

    public DistributedSystem getSpark() {
        return new ApacheSpark();
    }

    public DistributedSystem getFlink() {
        return new ApacheFlink();
    }

    public String getFlink(String type){
        return "This is a simple session";
    }
}
