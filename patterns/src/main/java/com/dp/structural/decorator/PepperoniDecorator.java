package com.dp.structural.decorator;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void make(){
        pizza.make();
        System.out.println("Added pepperoni");
    }
}
