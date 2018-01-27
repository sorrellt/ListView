package com.strobertchs.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create People for List
        Person eric = new Person("Eric Fabroa", "05-20-1969", "Male");
        Person phil = new Person("Phil Coulson", "01-20-1966", "Male");
        Person jake = new Person("Jake Perolta", "03-26-1970", "Male");
        Person bob = new Person("Bob Saget","06-23-1950", "Male");
        Person thomas = new Person("Thomas Sorrell","04-12-2000", "Male");
        Person marcus = new Person("Marcus Sorrell", "11-23-2001", "Male");
        Person sally = new Person("Sally Smith", "04-20-1999", "Female");
        Person sara = new Person("Sara Johnson", "04-7-1998", "Female");
        Person vera = new Person("Vera Bambi", "04-20-1981", "Female");
        Person steph = new Person("Steph Chang", "09-30-2001", "Female");
        Person trinity = new Person("Trinity Sorrell", "07-02-2007", "Female");

        //ArrayList that will contain People
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(eric);
        peopleList.add(phil);
        peopleList.add(jake);
        peopleList.add(bob);
        peopleList.add(thomas);
        peopleList.add(marcus);
        peopleList.add(sally);
        peopleList.add(sara);
        peopleList.add(vera);
        peopleList.add(steph);
        peopleList.add(trinity);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout. adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);


    }
}
