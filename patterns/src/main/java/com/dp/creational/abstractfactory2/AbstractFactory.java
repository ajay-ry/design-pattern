package com.dp.creational.abstractfactory2;

public abstract class AbstractFactory {

    public static AbstractFactory getFactory(FactorySystems factorySystems) {
        if (factorySystems == FactorySystems.HORTONWORKS)
            return new HortonworkFactory();
        else if (factorySystems == FactorySystems.CLOUDERA)
            return new ClouderaFactory();
        else if(factorySystems == FactorySystems.APACHE)
            return new ApacheFactory();

        return null;
    }

    public abstract DistributedSystem getHive();
    public abstract DistributedSystem getSpark();
    public  abstract  DistributedSystem getFlink();
}
