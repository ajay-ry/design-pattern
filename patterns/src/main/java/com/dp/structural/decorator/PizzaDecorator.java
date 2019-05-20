package com.dp.structural.decorator;

public abstract class PizzaDecorator implements Pizza{

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public void make(){
        pizza.make();
    }
}
