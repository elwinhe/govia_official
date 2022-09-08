package com.example.govia_official;

import android.content.Context;
import android.content.SharedPreferences;

    /*
        Created by Elwin He, 12/19/21
        This class manages the stored user data for login on local database.
     */

public class UserLocalStore {
    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase; //creates a shared preference for all the users

    //constructor with context
    public UserLocalStore(Context context) {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0); //context given from the user name
    }

    public void storeUserData(User user) {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("email", user.email);
        spEditor.putString("phone", user.phoneNum);
        spEditor.putString("address", user.address);
        spEditor.putInt("age", user.age);
        spEditor.putInt("race", user.race);
        spEditor.putInt("gender", user.gender);
        spEditor.putString("password", user.password);

        spEditor.commit();
    }

    //retrieves the user profile
    public User getLoggedUser() {
        String name = userLocalDatabase.getString("name", "");
        String email = userLocalDatabase.getString("email", "");
        String password = userLocalDatabase.getString("password","");
        String address = userLocalDatabase.getString("address", "");
        String phone = userLocalDatabase.getString("phone", "");
        int age = userLocalDatabase.getInt("age", -1);
        int gender = userLocalDatabase.getInt("gender", -1);
        int race = userLocalDatabase.getInt("race", -1);

        User storedUser = new User(name, email, phone, password, address, age, race, gender);
        return storedUser;
    }

    //determines whether the user is logged in
    public void setUserLoggedIn(boolean loggedIn) {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    //clears user data
    public void clearUserData() {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
