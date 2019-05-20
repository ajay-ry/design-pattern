package com.dp.creational.abstractfactory2;

public class HortonworkFactory extends AbstractFactory {
    public DistributedSystem getHive() {
        return new HortonworkHive();
    }

    public DistributedSystem getSpark() {
        return new HortonworkSpark();
    }

    public DistributedSystem getFlink(){
        return null;
    }
}
