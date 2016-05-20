package com.creativedesign.idare;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set The Content View To The Splash Screen
        setContentView(R.layout.splash);

        // Setup a font for use on the text view title
        TextView appNameSplash = (TextView)findViewById(R.id.appNameSplash);

        Typeface futura = Typeface.createFromAsset(getAssets(), "fonts/futura/FuturaLT-Light.ttf");
        appNameSplash.setTypeface(futura);

        //setup make an account button
        Button makeAccount = (Button) findViewById(R.id.makeAccount);
        makeAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeNewAccount();
            }
        });

        //setup sign in button
        Button signInButton = (Button) findViewById(R.id.signinButton);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

    }




    //procedure for making an new account
    public void makeNewAccount(){
        // TODO: 1/24/16 add procedure
    }



    //procedure for signing into the app
    public void signIn(){
        Intent intent = new Intent(Splash.this, MainActivity.class);

        // TODO: 1/24/16 assign data to be put to the main activity

        startActivity(intent);
    }
}
