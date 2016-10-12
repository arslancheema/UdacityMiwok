package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

       // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);



        ArrayList<String> wordsList = new ArrayList<String>();

        wordsList.add("one");
        wordsList.add("two");
        wordsList.add("Three");
        wordsList.add("Four");
        wordsList.add("Five");
        wordsList.add("Six");
        wordsList.add("Seven");
        wordsList.add("Eight");
        wordsList.add("nine");
        wordsList.add("ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, wordsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
