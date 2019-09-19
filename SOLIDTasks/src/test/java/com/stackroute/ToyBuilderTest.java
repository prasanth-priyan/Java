package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToyBuilderTest {

    @Test
    public void buildToy() {
        FlyingToy plane = new FlyingToy();
        ToyBuilder planeBuilder = new ToyBuilder();
        planeBuilder.buildToy(plane);

        MovingToy car = new MovingToy();
        ToyBuilder carBuilder = new ToyBuilder();
        carBuilder.buildToy(car);
    }
}