package com.karthik.modify.standardIO;

public class StandardOutput {
    String choiceSelecttionOutput ="System.out.println(\"1 - creating a new user\");\n" +
            "            System.out.println(\"2 - purchasing a product\");\n" +
            "            System.out.println(\"3 - switching between users\");\n" +
            "            System.out.println(\"4 -  invoices of a particular user\");\n" +
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
        System.out.println("enter your username");
    }

    public void printForPhoneNumberInput()
    {
        System.out.println("enter your phoner number");
    }

    public void printForChoiceInput() {
        System.out.println("enter your choice");
    }
}
