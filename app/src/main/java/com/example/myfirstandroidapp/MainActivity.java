package com.example.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void disable(View v){
        v.setEnabled(false);
        Button btn = (Button) v;
        btn.setText("Disabled");

//        New Disabled  func

        View myView =  findViewById(R.id.button3);
        myView.setEnabled(false);
        Button btn1 =(Button) myView;
        btn1.setText("New Disabled Func");
    }

}