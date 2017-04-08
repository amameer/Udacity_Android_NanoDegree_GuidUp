package com.misk.amna.guidapp;

/**
 * Created by me on 07/04/17.
 */

public class City {

    private  int cID;
    private  String cName;

    public City(int cID, String cName) {
        this.cID = cID;
        this.cName = cName;
    }



    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

}
