package com.example.a16022596.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvResult = (TextView)findViewById(R.id.textViewResult);


      Intent intRecieved = getIntent();
      String[] info = intRecieved.getStringArrayExtra("info");

        tvResult.setText("Your name is " + info[1] + " and " + info[0]);
    }
}
