package com.cefalo.school.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by proshad on 11/7/16.
 */
public class House {
    private List<String> parts = new ArrayList<String>();

    public void addParts(String part){
        parts.add(part);
    }

    public List<String> getParts() {
        return parts;
    }

    public void showParts(){
        System.out.println("House parts:............");
        for (String part : parts) {
            System.out.println(part);
        }
    }


}
