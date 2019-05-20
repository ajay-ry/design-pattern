package com.dp.structural.decorator;

public class ChilliDecorator extends PizzaDecorator {
    public ChilliDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void make(){
        pizza.make();
        System.out.println("Added chilli");
    }
}
