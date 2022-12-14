package com.example.passvariablebwactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT =  "com.example.application.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button  = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

    }

    private void openActivity2() {
        //edit text is in this activity
        EditText editText1 = (EditText) findViewById(R.id.edittext1) ;
        //this gets the string that is input in the edit text
        String text = editText1.getText().toString();

        //this edit text is in this activity
        EditText editText2 = (EditText) findViewById(R.id.edittext2);
        //it gets the number
        int number = Integer.parseInt(editText2.getText().toString());



        Intent intent = new Intent(this,Activity2.class);

        //this code is needed
        intent.putExtra(EXTRA_TEXT,text);
        intent.putExtra(EXTRA_NUMBER,number);

        startActivity(intent);
    }
}