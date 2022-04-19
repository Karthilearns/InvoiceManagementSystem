package com.karthik.modify.users;

public class UserId {
    static int presentUserId =0;

    public static int getUserId()
    {
        return presentUserId++;
    }
}
