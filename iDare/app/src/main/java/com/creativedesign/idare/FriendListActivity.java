package com.creativedesign.idare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

public class FriendListActivity extends AppCompatActivity {

    User CurrentUser;
    ListView friendList;
    FriendAdapter friendAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);

        //init friendList
        friendList = (ListView) findViewById(R.id.friendList);
        addFriendsToList();
    }

    private void addFriendsToList() {

        User frendArray[] = new User[10];

        //dummy friend list
        for (int i = 0; i< frendArray.length; i++){
            frendArray[i] = new User ("ltang", "Larry Tang");
        }
        //
        friendAdapter = new FriendAdapter(getBaseContext(), frendArray);
        friendList.setAdapter(friendAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.friend_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
