package com.karthik.modify.operations;

import com.karthik.modify.Beans;
import com.karthik.modify.standardIO.StandardInput;
import com.karthik.modify.standardIO.StandardOutput;
import com.karthik.modify.storage.UserStorage;
import com.karthik.modify.users.UserId;
import com.karthik.modify.users.UserModel;
import com.karthik.modify.validator.ValidaterWithString;

public class CreateUser implements OperationsFactory
{

    Beans beans = new Beans();
    public void execute()
    {
          ValidaterWithString validaterWithString = beans.createPhoneNumberValidater();
          UserStorage userStorage = beans.createUserStorageBean();
          StandardInput standardInput = beans.createStandardInputBean();
          StandardOutput standardOutput = beans.createStandardOutputBean();
          int userId = UserId.getUserId();
          String userName = standardInput.fetchUsername();
          String phoneNumber = standardInput.fetchPhoneNumber();
          if(!validaterWithString.validate(phoneNumber))
          {
            standardOutput.printInvalidPhoneNumberMessage();
            return;
          }
          userStorage.addUser(beans.createUserModelbean(userId,userName,phoneNumber));
    }

}
