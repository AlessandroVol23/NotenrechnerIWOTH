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

        //Create Adapter for Semester Activity
        SemesterAdapter adapter = new SemesterAdapter(this, semesterList);

        //Get the List View to set the adapter
        ListView listview = (ListView) findViewById(R.id.list_view_main);
        listview.setAdapter(adapter);



        //Create modules for semester one
        Module gwi = new Module("Grundlagen der Wirtschaftsinformatik", 8, 1);
        Module pg1 = new Module("Programmieren1", 8, 1);
        Module ma1 = new Module("Mathe1", 7, 1);
        Module englisch = new Module("Fachspezifisches Englisch", 3, 0.5);
        Module bwl1 = new Module("BWL1", 5, 1);

        //Add modules to list in semester
        //Semester one
        s1.addModuleToSemester(gwi);
        s1.addModuleToSemester(pg1);
        s1.addModuleToSemester(ma1);
        s1.addModuleToSemester(englisch);
        s1.addModuleToSemester(bwl1);

        // Create Adapter for modules in semester one
        ModuleAdapter mAdapter = new ModuleAdapter(this, s1.getModuleList());

        //Open new Activtity
        // With the position object android knows which item in the list you've clicked
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SemesterActivity.class);
                System.out.println("POSITION: " + position);
                startActivity(intent);
            }
        });
    }
}
