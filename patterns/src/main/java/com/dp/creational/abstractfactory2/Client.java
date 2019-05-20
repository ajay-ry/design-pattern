package com.dp.creational.abstractfactory2;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(FactorySystems.HORTONWORKS);
        DistributedSystem hive = factory.getHive();
        hive.getSession();

        AbstractFactory factory2 = AbstractFactory.getFactory(FactorySystems.CLOUDERA);
        DistributedSystem spark = factory2.getSpark();
        spark.getSession();


        AbstractFactory factory3 = AbstractFactory.getFactory(FactorySystems.APACHE);
        DistributedSystem flink_apache = factory3.getFlink();
        flink_apache.getSession();

        System.out.println(new ApacheFactory().getFlink("test"));
    }
}
