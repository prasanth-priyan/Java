package com.stackroute;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class MultipleExceptionsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkException_NegativeArraySize_ShouldThrowException(){
        Exception e = new NegativeArraySizeException();

        thrown.expect(NegativeArraySizeException.class);
        thrown.expectMessage(e.getMessage());
    }

    @Test
    public void checkException_IndexOutOfBounds_ShouldThrowException(){
        Exception e = new IndexOutOfBoundsException();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage(e.getMessage());
    }

    @Test
    public void checkException_NullPointer_ShouldThrowException(){
        Exception e = new NullPointerException();

        thrown.expect(NullPointerException.class);
        thrown.expectMessage(e.getMessage());
    }
}
