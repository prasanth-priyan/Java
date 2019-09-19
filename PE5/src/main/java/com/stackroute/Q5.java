package com.stackroute;

import java.util.HashMap;

public class Q5 {
    public static HashMap<String, String> modifyMap(HashMap testMap){
        if(testMap.get("key1").toString().isEmpty()){
            return testMap;
        }
        else{
            testMap.put("key2", testMap.get("key1"));
            testMap.put("key1", "");
            return testMap;
        }
    }
}
