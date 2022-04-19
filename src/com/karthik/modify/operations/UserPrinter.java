package com.karthik.modify.operations;

import com.karthik.modify.Beans;
import com.karthik.modify.operations.OperationsFactory;
import com.karthik.modify.standardIO.StandardOutput;
import com.karthik.modify.storage.UserStorage;
import com.karthik.modify.users.UserModel;

import com.karthik.modify.validator.ValidaterWithList;

import java.util.ArrayList;

public class UserPrinter implements OperationsFactory {
    Beans beans = new Beans();

    public void execute()
    {
        UserStorage userStorage = beans.createUserStorageBean();
        StandardOutput standardOutput = beans.createStandardOutputBean();

        ArrayList<UserModel> allUsersList = userStorage.getAllUsers();
        ValidaterWithList validator = beans.createUserCountValidatorBean();
        if(!validator.validate(allUsersList))
        {
            standardOutput.printNoUserFoundMessage();
            return;
        }
            standardOutput.printAllUsers(allUsersList);

    }

}
