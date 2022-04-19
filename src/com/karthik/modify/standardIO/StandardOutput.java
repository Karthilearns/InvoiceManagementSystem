package com.karthik.modify.standardIO;

import com.karthik.modify.product.ProductModel;
import com.karthik.modify.users.UserModel;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class StandardOutput {
    String choiceSelecttionOutput =
            "            System.out.println(\"1 - creating a new user\");\n" +
            "            System.out.println(\"2 - print all users\");\n" +
            "            System.out.println(\"3 - add a new product\");\n" +
            "            System.out.println(\"4 - print all products\");\n" +
            "            System.out.println(\"5 -  invoices of a all user\");\n" +
            "            System.out.println(\"6 -  details of a particular user\");\n" +
            "            System.out.println(\"7 -  details of a all user\");\n" +
            "            System.out.println(\"enter choice\");";

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
    public void printProducts(int productId , ProductModel productModel) {

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
