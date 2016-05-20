package com.creativedesign.idare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by ltang23 on 1/30/16.
 */
public class DareAdapter extends ArrayAdapter<Dare> {
    public DareAdapter(Context context, Dare[] objects) {
        super(context, R.layout.card, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.card, parent, false);

        TextView fromWho = (TextView) view.findViewById(R.id.fromWho);
        TextView dareText = (TextView) view.findViewById(R.id.dareText);

        //set text based on the dare array passed into the adapter
        fromWho.setText(getItem(position).Sender +" dared " + getItem(position).Reciever + " to ");
        dareText.setText(getItem(position).dareDescription);
        return view;
    }
}
