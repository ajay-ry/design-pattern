package com.dp.creational.abstractfactory;

public class LandTransportFactory extends AbstractTransportFactory {
    public LandTransport createTransport() {
        return new LandTransport();
    }

}
