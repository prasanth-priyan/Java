package com.stackroute;

public class FlyingToy extends Toy {

    public FlyingToy() {
        System.out.println("Instantiating flying toy");
    }

    public boolean isMove() {
        return true;
    }

    public boolean isFly() {
        return true;
    }

    /*Specific methods and fields
    * */
}
