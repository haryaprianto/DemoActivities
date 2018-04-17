package com.example.a16022596.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDone;
    EditText etName;
    EditText etAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDone = (Button)findViewById(R.id.buttonDone);
        etName = (EditText)findViewById(R.id.editTextName);
        etAge = (EditText)findViewById(R.id.editTextAge);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = etAge.getText().toString();
                String name = etName.getText().toString();

                Intent intent = new Intent(getBaseContext(),Main2Activity.class);
                String [] info = {age,name};
                intent.putExtra("info",info);
                startActivity(intent);

            }
        });

    }
}
