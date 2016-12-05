package com.example.sandro.notenrechneriwoth;

import java.util.ArrayList;

/**
 * Created by Sandro on 03.12.2016.
 */

public class Semester {

    private String name;

    public Semester(String name) {
        //Add every new semester to the all semester list
        this.name = name;
        System.out.println("Created object: " + this.name);
    }

    public String getName() {
        return name;
    }
}
