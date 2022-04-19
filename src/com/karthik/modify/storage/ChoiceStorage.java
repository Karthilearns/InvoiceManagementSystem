package com.karthik.modify.storage;

import com.karthik.modify.Beans;
import com.karthik.modify.operations.OperationsFactory;

import java.util.Hashtable;

public class ChoiceStorage {
    static int presentChoiceCount =1;
    static Hashtable<Integer,OperationsFactory> choiceStorageTable = new Hashtable<>();

    Beans beans = new Beans();
    public ChoiceStorage()
    {
        choiceStorageTable.put(1, beans.fetchCreateUserClass());
        choiceStorageTable.put(2, beans.createUserPrinterBean());
        choiceStorageTable.put(3,beans.fetchCreateProductBean());
        choiceStorageTable.put(4,beans.createProductPrinterBean());
    }
    public void addNewChoice(OperationsFactory operation)
    {
        choiceStorageTable.put(presentChoiceCount++,operation);
    }
    public OperationsFactory getChoiceBean(int userChoice)
    {
        return choiceStorageTable.get(userChoice);
    }

}
