package com.misk.amna.guidapp;

/**
 * Created by me on 07/04/17.
 */

public class Tower {

    private int tId;
    private String tName;

    public Tower(int tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
