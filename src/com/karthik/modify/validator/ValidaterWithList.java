package com.karthik.modify.validator;

import com.karthik.modify.users.UserModel;

import java.util.ArrayList;

public interface ValidaterWithList{
   // public boolean validateWit();

    boolean validate(ArrayList<UserModel> userList);
}

