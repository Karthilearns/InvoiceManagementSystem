package com.karthik.modify.validator;

import com.karthik.modify.users.UserModel;

import java.util.ArrayList;

public class UsersCountValidator implements ValidaterWithList{

    @Override
    public boolean validate(ArrayList<UserModel> userList)
    {
        return userList.size()!=0;
    }
}
