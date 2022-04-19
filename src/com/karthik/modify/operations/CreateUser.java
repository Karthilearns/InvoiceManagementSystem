package com.karthik.modify.operations;

import com.karthik.modify.Beans;
import com.karthik.modify.standardIO.StandardInput;
import com.karthik.modify.storage.UserStorage;
import com.karthik.modify.users.UserId;
import com.karthik.modify.users.UserModel;

public class CreateUser implements OperationsFactory
{

    Beans beans = new Beans();
    public void execute()
    {
          UserStorage userStorage = beans.createUserStorageBean();
          StandardInput standardInput = beans.createStandardInputBean();
          int userId = UserId.getUserId();
          String userName = standardInput.fetchUsername();
          String phoneNumber = standardInput.fetchPhoneNumber();
          userStorage.addUser(beans.createUserModelbean(userId,userName,phoneNumber));
    }

}
