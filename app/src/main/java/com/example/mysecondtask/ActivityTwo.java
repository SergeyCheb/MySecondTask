package com.example.mysecondtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    //------------------------
    Button btnActThree;
    //------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        //------------------------
        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);
        //------------------------
    }

    //----------------------------
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActThree:
                // TODO Call second activity
                Intent intent = new Intent(this, ActivityThree.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}