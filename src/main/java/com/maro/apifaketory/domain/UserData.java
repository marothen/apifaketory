package com.maro.apifaketory.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 9/21/17.
 */
public class UserData {

    List<User> data = new ArrayList<>();

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
