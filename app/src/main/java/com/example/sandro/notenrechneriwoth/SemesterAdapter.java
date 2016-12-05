package com.example.sandro.notenrechneriwoth;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sandro on 03.12.2016.
 */

public class SemesterAdapter extends ArrayAdapter {

    public SemesterAdapter(Activity context, ArrayList<Semester> semesterList) {
        super(context, 0, semesterList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_semester, parent, false);

        }

        Semester s = (Semester) getItem(position);

        //Put the semester name in the textview
        TextView modulNameTxt = (TextView) listItemView.findViewById(R.id.txt_name);
        modulNameTxt.setText(s.getName());




        return listItemView;

    }
}
