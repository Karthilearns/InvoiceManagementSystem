package com.karthik.modify;

import com.karthik.modify.operations.OperationsFactory;
import com.karthik.modify.standardIO.StandardInput;
import com.karthik.modify.standardIO.StandardOutput;
import com.karthik.modify.storage.ChoiceStorage;
import com.karthik.modify.users.UserModel;

import java.util.Scanner;

public class Main {



    public static void main(String args[])
    {
        int choice = 1;
        UserModel user ;
        Beans beans = new Beans();
        StandardInput standardInput = beans.createStandardInputBean();
        StandardOutput standardOutput = beans.createStandardOutputBean();
        ChoiceStorage choiceStorage = beans.createChoiceStorageBean();
        while(choice==1 || choice==2|| choice==3|| choice==4||choice==5|| choice==6|| choice==7)
        {
            standardOutput.printSelectionOutput();
            standardOutput.printForChoiceInput();
            choice = standardInput.fetchChoice();
            OperationsFactory choiceBean = choiceStorage.getChoiceBean(choice);
            choiceBean.execute();
        }

    }
}
