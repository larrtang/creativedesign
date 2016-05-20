package com.creativedesign.idare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;


/**
 * Created by ltang23 on 2/2/16.
 */
public class FriendAdapter extends ArrayAdapter<User> {

    public FriendAdapter(Context context, User[] objects) {
        super(context, R.layout.friendcard, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.friendcard, parent, false);

        //init picture, name, and button
        ImageView friendProfPic = (ImageView) view.findViewById(R.id.friendProfilePic);
        TextView friendName = (TextView) view.findViewById(R.id.friendName);
        Switch dareSwitch = (Switch) view.findViewById(R.id.dareSwitch);

        friendProfPic.setImageURI(getItem(position).profilePicURI);
        friendName.setText(getItem(position).name);

        return view;
    }
}
