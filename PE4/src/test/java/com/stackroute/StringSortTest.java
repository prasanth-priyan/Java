package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortTest {

    @Test
    public void sortPara_ParaGiven_ShouldReturnSortedAlphabetically() {
        assertArrayEquals("Incorrect Output", new String[]{"Alpha", "Bravo", "leopard", "zebra"}, StringSort.sortPara("Alpha Bravo zebra leopard"));
    }
}