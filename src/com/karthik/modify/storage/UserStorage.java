package com.karthik.modify.storage;

import com.karthik.modify.users.UserFactory;
import com.karthik.modify.users.UserModel;

import java.util.ArrayList;

public class UserStorage {
    static ArrayList<UserModel> userStorage = new ArrayList<>();

    public void addUser(UserModel userModel)
    {
        userStorage.add(userModel);
    }

    public ArrayList<UserModel> getAllUsers() {
        return userStorage;
    }
}
