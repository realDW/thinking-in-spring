package com.daiwei.dependency.lookup.domain;

import com.daiwei.dependency.lookup.annotation.Super;

/**
 * Created by Daiwei on 2020/8/23
 */
@Super
public class SuperUser extends User {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
