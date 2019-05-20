package com.dp.structural.decorator;

public class Maker {
    public static void main(String[] args) {
        Pizza vegPizza = new VegPizza();
        Pizza decoratedPizza = new CheeseDecorator(new PepperoniDecorator(new ChilliDecorator(vegPizza)));
        decoratedPizza.make();
    }
}
