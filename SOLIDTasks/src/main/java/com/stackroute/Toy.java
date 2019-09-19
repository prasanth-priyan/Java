package com.stackroute;

public abstract class Toy {
    private String name;
    private double price;

    public Toy() {
        System.out.println("In base abstract class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract boolean isMove();
    public abstract boolean isFly();
}
