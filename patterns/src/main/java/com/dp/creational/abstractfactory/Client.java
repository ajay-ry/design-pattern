package com.dp.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractTransportFactory atf = new LandTransportFactory();
        Transport lt = atf.createTransport();
        lt.move();
    }
}
