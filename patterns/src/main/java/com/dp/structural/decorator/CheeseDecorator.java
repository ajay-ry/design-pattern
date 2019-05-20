package com.dp.structural.decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void make() {
        pizza.make();
        System.out.println("Added cheese");
    }
}
