package com.example.prashu.assignment121;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button saveBtn, showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saveBtn = (Button) findViewById(R.id.button1);
        showBtn = (Button) findViewById(R.id.button2);
    }

    public void storeDataEntered(View view) {
        // on clicking the button intent is fired to the SettingsActivity.java.
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);  // fires the intent.
    }
    public void showDataCreated(View view) {
        // on clicking the button intent is fired to the ShowData.java activity.
        Intent intent = new Intent(this, DisplayDataActivity.class);
        startActivity(intent);  // fires the intent.
    }

}
