package com.karthik.modify;

import com.karthik.modify.operations.*;
import com.karthik.modify.product.ProductID;
import com.karthik.modify.product.ProductModel;
import com.karthik.modify.standardIO.StandardInput;
import com.karthik.modify.standardIO.StandardOutput;
import com.karthik.modify.storage.ChoiceStorage;
import com.karthik.modify.storage.ProductStorage;
import com.karthik.modify.storage.UserStorage;
import com.karthik.modify.users.UserId;
import com.karthik.modify.users.UserModel;
import com.karthik.modify.validator.PhoneNumberLengthValidator;
import com.karthik.modify.validator.UsersCountValidator;

import com.karthik.modify.validator.ValidaterWithList;
import com.karthik.modify.validator.ValidaterWithString;

import java.util.Scanner;

public class Beans {


    public  StandardOutput createStandardOutputBean()
    {

        return new StandardOutput();
    }
    public  StandardInput createStandardInputBean()
    {

        return new StandardInput();
    }
    public  ChoiceStorage createChoiceStorageBean()
    {
        return new ChoiceStorage();
    }
    public  Scanner createScannerBean()
    {
        return new  Scanner(System.in);
    }

    public  CreateUser fetchCreateUserClass()
    {
        return new CreateUser();
    }

    public UserModel createUserModelbean(int userId, String userName, String phoneNumber)
    {

        return new UserModel(userId,userName,phoneNumber);
    }

    public UserStorage createUserStorageBean() {
        return new UserStorage();
    }

    public OperationsFactory createUserPrinterBean()
    {
        return new UserPrinter();
    }

    public ValidaterWithList createUserCountValidatorBean() {
        return new UsersCountValidator();
    }

    public ValidaterWithString createPhoneNumberValidater() {
        return new PhoneNumberLengthValidator();
    }

    public ProductID createProductIdBean()
    {

        return new ProductID();

    }
    public CreateProduct fetchCreateProductBean()
    {
        return new CreateProduct();
    }


    public ProductStorage createProductStorageBean()
    {
        return new ProductStorage();
    }

    public ProductModel createProductModel(int productId, String productName, int productPrice) {
        return new ProductModel(productId,productName,productPrice);
    }

    public OperationsFactory createProductPrinterBean() {
        return new ProductPrinter();
    }
}
