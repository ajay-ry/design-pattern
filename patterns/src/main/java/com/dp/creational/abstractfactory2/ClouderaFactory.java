package com.dp.creational.abstractfactory2;

public class ClouderaFactory extends AbstractFactory {
    public DistributedSystem getHive() {
        return new ClouderaHive();
    }

    public DistributedSystem getSpark() {
        return new ClouderaSpark();
    }

    public DistributedSystem getFlink() {
        return null;
    }
}
