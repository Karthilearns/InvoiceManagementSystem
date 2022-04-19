package com.karthik.base;

import java.util.ArrayList;
import java.util.List;

public class User {
    int UserID;
    String name;
    String phoneNumber;
    List<Invoice> invoicesList = new ArrayList<>();

    public User(int userID, String name, String phoneNumber) {
        UserID = userID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "com.karthik.base.User{" +
                "UserID=" + UserID +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", invoicesList=" + invoicesList +
                '}';
    }

    public void addInvoice(Invoice invoice)
    {
        invoicesList.add(invoice);
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Invoice> getAllInvoices()
    {
        return invoicesList;
    }

}
