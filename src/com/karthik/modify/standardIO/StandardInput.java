package com.karthik.modify.standardIO;

import com.karthik.modify.Beans;
import com.karthik.modify.operations.CreateUser;

import java.util.Scanner;

public class StandardInput {

    public Beans getBean()
    {
        return new Beans();
    }


    public String  fetchUsername()
    {
        Beans beans = getBean();

        StandardOutput standardOutput = beans.createStandardOutputBean();
        Scanner scanner = beans.createScannerBean();
        standardOutput.printForUsernameInput();
        String username = scanner.next();
        return username;

    }
    public String fetchPhoneNumber()
    {
        Beans beans = getBean();
        StandardOutput standardOutput = beans.createStandardOutputBean();
        Scanner scanner = beans.createScannerBean();
        standardOutput.printForPhoneNumberInput();
        String phoneNumber = scanner.next();
        return phoneNumber;
    }

    public int fetchChoice() {
        Beans beans = getBean();
        Scanner scanner = beans.createScannerBean();
        return scanner.nextInt();
    }

    public String fetchProductName() {
        Beans beans = getBean();
        Scanner scanner = beans.createScannerBean();
        String productName = scanner.next();
        return productName;
    }

    public int fetchProductPrice()
    {
        Beans beans = getBean();
        Scanner scanner = beans.createScannerBean();
        int productPrice = scanner.nextInt();
        return productPrice;
    }

}
