package com.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;

import static org.junit.Assert.*;

public class WordFrequencyTest {

    private File file = new File ("demoText.txt");
    private FileWriter fileWriter;

    @Before
    public void setUp() throws Exception {
        fileWriter = new FileWriter(file);
        if(file.createNewFile()) {
            fileWriter.write("i am a man, i am 00 superman");
            fileWriter.close();
        }
    }


    @Test
    public void checkWordFrequency_GivenFileAndWord_ShouldDisplayWordFrequency(){

        assertEquals("Incorrect Output", 3, WordFrequency.checkWordFrequency(file,"i"));
        assertEquals("Incorrect Output", 1, WordFrequency.checkWordFrequency(file,"superman"));
        assertNotEquals("Incorrect Output - not a word", 1, WordFrequency.checkWordFrequency(file,"00"));
    }

    @Test
    public void checkWordFrequency_GivenFileAndWrongWord_ShouldDisplayErrorMsg(){

        assertEquals("Incorrect Output - word not in file", "Word not in file", WordFrequency.checkWordFrequency(file,"batman"));
        assertEquals("Incorrect Output - not a word", "Not a word", WordFrequency.checkWordFrequency(file,"1234"));
    }

}