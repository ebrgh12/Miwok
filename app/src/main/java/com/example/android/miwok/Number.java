package com.example.android.miwok;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create an array of words
        ArrayList< String> words = new ArrayList<String>();

                words.add ("ONE");
                words.add ("TWO");
                words.add ("THREE");
                words.add ("Four");
                words.add ("Five");
                words.add ("SIX");
                words.add ("SEVEN");
                words.add ("EIGHT");
                words.add ("NINE");
                words.add ("TEN");
            // For verification
                Log.v("Number Activity","Word at index :0" +words.get(0) );
                // Display using java( Set the rootview)

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.test_list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);





    }

}
