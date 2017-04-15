package com.misk.amna.guidapp;

/**
 * Created by me on 07/04/17.
 */

public class Place {

    private int pID;
    private String pName;

    public Place(int pID, String pName) {
        this.pID = pID;
        this.pName = pName;
    }


    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getpName() {  return pName; }

    public void setpName(String pName) {
        this.pName = pName;
    }

}
