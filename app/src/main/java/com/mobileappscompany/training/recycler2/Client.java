package com.mobileappscompany.training.recycler2;

/**
 * Created by ferna on 2/9/2017.
 */

public class Client {
    private String mName;
    private String mPhone;

    public Client() {
    }

    public Client(String mName, String mPhone) {
        this.mName = mName;
        this.mPhone = mPhone;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
