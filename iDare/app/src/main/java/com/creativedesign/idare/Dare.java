package com.creativedesign.idare;

/**
 * Created by ltang23 on 1/29/16.
 */
public class Dare {

    public String Sender;
    public String Reciever;

    public String dareDescription;

    public boolean Complete;

    public Dare(String sender, String receiver, String dare) {
        Sender = sender;
        Reciever = receiver;

        dareDescription = dare;

        Complete = false;
    }


    @Override
    public String toString() {
        return dareDescription;
    }
}
