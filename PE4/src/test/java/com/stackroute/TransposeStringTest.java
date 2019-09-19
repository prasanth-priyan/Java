package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    @Test
    public void transposeString_PassedString_ShouldReturnTransposedString() {
        assertEquals("Incorrect Output", "a kciuq nworb xof spmuj revo eht yzal god", TransposeString.transposeString("a quick brown fox jumps over the lazy dog"));
    }
}