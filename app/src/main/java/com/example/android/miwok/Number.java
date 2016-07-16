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
        ArrayList< Word> words = new ArrayList<Word>();

        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiko"));
        words.add(new Word("three","tolook"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokk"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","keneka"));
        words.add(new Word("eight","kaeint"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

            // For verification
                Log.v("Number Activity","Word at index :0" +words.get(0) );
                // Display using java( Set the rootview)

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
