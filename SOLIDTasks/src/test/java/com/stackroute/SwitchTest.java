package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchTest {

    @Test
    public void flipSwitch() {
        Switch button = new Switch();
        Electronics bulb = new Bulb();
        button.flipSwitch(bulb);
        button.flipSwitch(bulb);
    }
}