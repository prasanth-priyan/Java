package com.stackroute;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TextFileTest {

    @Test
    public void readTextFile_TextInputGiven_ShouldReturnUpperCaseAndLength() throws IOException {
        File file = new File ("demoText.txt");
        if(file.createNewFile()) {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("my text file");
            fileWriter.close();
        }
        assertEquals("Incorrect Output - format: MY TEST FILE - file.length", "MY TEST FILE - "+file.length(), TextFile.readTextFile(new File("hello.txt")));
    }
}
