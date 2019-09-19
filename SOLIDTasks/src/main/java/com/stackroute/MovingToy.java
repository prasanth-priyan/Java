package com.stackroute;

public class MovingToy extends Toy {

    public MovingToy() {
        System.out.println("Instantiating moving toy");
    }

    @Override
    public boolean isMove() {
        return true;
    }

    @Override
    public boolean isFly() {
        return false;
    }
    /*Specific methods and fields
    * */
}
