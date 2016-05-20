package com.creativedesign.idare;

import android.graphics.drawable.Icon;
import android.net.Uri;

import java.net.URI;
import java.util.ArrayList;

/**
 * Created by ltang23 on 1/30/16.
 */
public class User {
    public ArrayList<Dare> dares;
    public ArrayList<User> friends;

    public String facebook_username;
    public String name;

    public String status;

    Icon profilePicture;
    Uri profilePicURI;

    // TODO: 2/7/16 add specs to users, such as number of completions, a rating, etc...

    public int completedDares;
    public int daresChallenged;

    public float rating = 10f;

    public User(String fbname, String user){
        facebook_username = fbname;
        name = user;
    }

}
