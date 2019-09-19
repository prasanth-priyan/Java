package com.stackroute;

import java.util.ArrayList;

public class UpdateArrayList {
    public static ArrayList<String> updateArrayList(ArrayList<String> items, String oldItem, String newItem){
        if(items.contains(oldItem)){
            items.set(items.indexOf(oldItem), newItem);
        }
        return items;
    }
}
