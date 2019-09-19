package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        FlyingToy plane = new FlyingToy();
        ToyBuilder planeBuilder = new ToyBuilder();
        planeBuilder.buildToy(plane);

        MovingToy car = new MovingToy();
        ToyBuilder carBuilder = new ToyBuilder();
        carBuilder.buildToy(car);
    }
}
