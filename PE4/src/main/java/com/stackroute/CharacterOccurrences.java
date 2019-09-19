package com.stackroute;

public class CharacterOccurrences {

    public static int getCharacterOccurrences(String testString, char testChar){
        return testString.length() - testString.toLowerCase().replaceAll(String.valueOf(Character.toLowerCase(testChar)),"").length();
    }
}
