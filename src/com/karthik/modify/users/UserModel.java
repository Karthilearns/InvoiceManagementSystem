package com.karthik.modify.users;

import com.karthik.modify.invoice.InvoiceModel;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    int userID;
    String userName;
    String phoneNumber;
    List<InvoiceModel> invoicesList ;

public UserModel(int userId ,String userName,String phoneNumber)
{
    this.userID = userId;
    this.userName = userName;
    this.phoneNumber =phoneNumber;
    this.invoicesList= new ArrayList<>();
}

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<InvoiceModel> getInvoicesList() {
        return invoicesList;
    }

    public void setInvoicesList(List<InvoiceModel> invoicesList)
    {
        this.invoicesList = invoicesList;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", invoicesList=" + invoicesList +
                '}';
    }


}
