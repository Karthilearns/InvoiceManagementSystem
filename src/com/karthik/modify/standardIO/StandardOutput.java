package com.karthik.modify.standardIO;

import com.karthik.modify.product.ProductModel;
import com.karthik.modify.users.UserModel;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class StandardOutput {
    String choiceSelecttionOutput =
            "           \"1 - creating a new user\"\n" +
            "           \"2 - print all users\"\n" +
            "           \"3 - add a new product\"\n" +
            "           \"4 - print all products\"\n" +
            "           \"5 -  invoices of a all user\"\n" +
            "           \"6 -  details of a particular user\"\n" +
            "           \"7 -  details of a all user\"\n";

    public  void printSelectionOutput()
    {
        System.out.println(choiceSelecttionOutput);
    }
    public void printForUsernameInput()
    {
        System.out.println("Enter Your Username");
    }

    public void printForPhoneNumberInput()
    {
        System.out.println("Enter your Phone Number");
    }

    public void printForChoiceInput() {
        System.out.println("Enter Your Choice");
    }

    public void printUser(UserModel user)
    {
        System.out.println(user.toString());
    }
    public void printNoUserFoundMessage()
    {
        System.out.println("No Users Found");
    }

    public void printInvalidPhoneNumberMessage()
    {
        System.out.println("Please enter a proper phonenumber");
    }
    public void printAllUsers(ArrayList<UserModel> allUsersList) {

        for(UserModel user : allUsersList)
        {
            printUser(user);
        }
    }

    public void printAllProducts(Hashtable<Integer, ProductModel> productList) {

        for(Map.Entry<Integer,ProductModel> productModelEntries: productList.entrySet())
        {
            printProducts(productModelEntries.getKey(),productModelEntries.getValue());
        }

    }
    public void printProducts(int productId , ProductModel productModel)
    {

        System.out.println(productId+" : "+productModel.toString());
    }

    public void printForProductNameInput()
    {
        System.out.println("enter the product name");
    }

    public void printForProductPrice()
    {
        System.out.println("enter the product price");
    }
}
