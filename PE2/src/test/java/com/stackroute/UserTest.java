package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest{

    User user = new User("Hari", "Kumar", 25, 2500.3);
    @Test
    public void checkFullName(){
        assertEquals("Incorrect Output","Hari Kumar", user.getFullName());
    }
    @Test
    public void checkAge(){
        assertTrue("Incorrect Output", user.isValidAge());
    }
}
