package com.stackroute;

public class Bulb extends Electronics {

    @Override
    public void changeStatus() {
        if (this.isStatus())
            System.out.println("Turning off");
        else
            System.out.println("Turning on");
        /*Logic
        * */
        this.setStatus(!this.isStatus());
    }
}
