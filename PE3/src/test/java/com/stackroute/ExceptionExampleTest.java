package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionExampleTest {

    @Rule
    ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkException_CustomMsg(){
        thrown.expect(Exception.class);
        thrown.expectMessage("My message");
    }

}
