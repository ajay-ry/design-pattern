package com.dp.creational.abstractfactory;

public class WaterTransportFactory extends AbstractTransportFactory {

    public Transport createTransport() {
        return new WaterTransport();
    }
}
