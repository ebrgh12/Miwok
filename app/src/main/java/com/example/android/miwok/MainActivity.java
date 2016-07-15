package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    public static final String WISHSONG = "name";
    Button a1;
    Button a2;
    Intent intent1;
    Intent intent2;
    Button a3;
    Intent intent3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //This is the code for onclick of the show button
        a1 = (Button) findViewById(R.id.showButton);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You are  directed to marks section", Toast.LENGTH_SHORT).show();
                intent1 = new Intent(v.getContext(), Number.class);
                startActivity(intent1);
            }
        });
        // This is the equivalent code for onclick of the playbutton
    }
}
