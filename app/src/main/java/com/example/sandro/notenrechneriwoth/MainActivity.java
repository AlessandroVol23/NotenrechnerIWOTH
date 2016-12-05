package com.example.sandro.notenrechneriwoth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_main);

        ArrayList<Semester> semesterList = new ArrayList<Semester>();

        //Create new Semester
        Semester s1 = new Semester("Semester1");
        Semester s2 = new Semester("Semester2");
        Semester s3 = new Semester("Semester3");
        Semester s4 = new Semester("Semester4");
        Semester s5 = new Semester("Semester5");
        Semester s6 = new Semester("Semester6");
        Semester s7 = new Semester("Semester7");


        //Add semester to list
        semesterList.add(s1);
        semesterList.add(s2);
        semesterList.add(s3);
        semesterList.add(s4);
        semesterList.add(s5);
        semesterList.add(s6);
        semesterList.add(s7);


        //Create Adapter
        SemesterAdapter adapter = new SemesterAdapter(this, semesterList);

        ListView listview = (ListView) findViewById(R.id.list_view_main);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SemesterActivity.class);
                startActivity(intent);
            }
        });
    }
}
