package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.List;


public class Users {
    public String Username;
    public String password;

    //
    public static Boolean passwordIsValid(String User,
                                          String Password){
        for (Users i:getUsers()){
            if (i.Username.equals(User)){
                if (i.password.equals(Password) && i.password.length() >= 3 && i.password.length()<= 50  ){
                    return true;
                }

            }
        }
        return false;
    }
    public static List<Users> getUsers(){
        List<Users> list = new ArrayList<Users>();

        Users o = new Users();
        o.Username = "harit";
        o.password = "123";
        list.add(o);

        Users t = new Users();
        t.Username = "yoli";
        t.password = "123";
        list.add(t);

        Users a = new Users();
        a.Username = "yo";
        a.password = "1";
        list.add(a);

        return list;
    }
}
