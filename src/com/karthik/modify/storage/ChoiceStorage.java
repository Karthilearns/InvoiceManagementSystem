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
