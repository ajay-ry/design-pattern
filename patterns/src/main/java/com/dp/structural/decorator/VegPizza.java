package com.dp.structural.decorator;

public class VegPizza implements Pizza {
    @Override
    public void make() {
        System.out.println("Veg pizza ready !!");
    }
}
