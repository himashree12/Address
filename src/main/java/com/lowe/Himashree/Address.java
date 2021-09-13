package com.lowe.Himashree;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class Address {

    private int addressId;

    private int hno;

    private String stressName;

    private String city;

    private String state;

    private long postcode;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getHno() {
        return hno;
    }

    public void setHno(int hno) {
        this.hno = hno;
    }

    public String getStressName() {
        return stressName;
    }

    public void setStressName(String stressName) {
        this.stressName = stressName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPostcode() {
        return postcode;
    }

    public void setPostcode(long postcode) {
        this.postcode = postcode;
    }
}
