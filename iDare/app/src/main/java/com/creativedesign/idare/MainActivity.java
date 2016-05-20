package com.creativedesign.idare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Dare> dares = new ArrayList<Dare>();
    DareAdapter dareAdapter;

    FloatingActionButton fab;
    ListView dareList;
    RelativeLayout listLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fetchData();

        //floating action button initialisation
        //this button is used to create a new dare
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewDare();
            }
        });

        //init dareList
        dareList = (ListView) findViewById(R.id.dareList);


        //set listview unscrollable
        /*
        dareList.setScrollContainer(false);
        dareList.setClickable(false);
        dareList.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return (event.getAction() == MotionEvent.ACTION_MOVE);
            }
        });
        */


        addDaresToDareList();


    }



    //fetch data from servers
    public void fetchData() {
        // TODO: 1/29/16 add instructions to fetch data from serverside
        /***dummy data***/
        // TODO: 1/29/16 create template for test data
        //dummy dare
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
        dares.add(new Dare("Larry", "Evan", "Eat his own cum"));
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
        dares.add(new Dare("Mishul", "Evan", "Eat his own shit"));
    }



    //open new dare activity
    private void openNewDare() {
        Intent intent = new Intent(this, FriendListActivity.class);
        startActivity(intent);
    }





    //sync dare list in main screen
    private void addDaresToDareList() {
        Dare [] dareArray = new Dare [dares.size()];
        for (int i = 0; i < dareArray.length; i++){
            dareArray[i] = dares.get(i);
        }
        dareAdapter = new DareAdapter(this,dareArray);
        dareList.setAdapter(dareAdapter);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        // TODO: 1/29/16 add menu functionality
        return super.onOptionsItemSelected(item);
    }
}
