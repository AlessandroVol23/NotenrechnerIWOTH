package com.example.sandro.notenrechneriwoth;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sandro on 27.12.2016.
 */

public class ModuleAdapter extends ArrayAdapter {

    public ModuleAdapter(Context context, ArrayList<Module> moduleList) {
        super(context, 0, moduleList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_semester, parent, false);

        }

        Module m = (Module) getItem(position);

        //Put the module name in the name textview
        TextView moduleName = (TextView) listItemView.findViewById(R.id.txt_name);
        moduleName.setText(m.getName());

        //Put the credits in the credits field
        TextView credits = (TextView) listItemView.findViewById(R.id.txt_credits_input);
        credits.setText(m.getCredit());

        // Put grade in txt field
        TextView grade = (TextView) listItemView.findViewById(R.id.txt_grade);
        grade.setText(String.valueOf(m.getGrade()));

        //Put gewichtung in txt field
        TextView gewichtung = (TextView) listItemView.findViewById(R.id.txt_gewichtung);
        gewichtung.setText(String.valueOf(m.getGewichtung()));

        //Put average grade in txt field
        TextView average_grade = (TextView) listItemView.findViewById(R.id.txt_average_grade);
        average_grade.setText(String.valueOf(m.getBerechnet()));


        return super.getView(position, convertView, parent);
    }
}
