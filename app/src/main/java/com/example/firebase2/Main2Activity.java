package com.example.firebase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {
    Button btn3;
    EditText e1,e2,e3,e4,e5,e7,e8,e9;
    Spinner s6;
    String code,name,salary,desig,company,district,place,mob,email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        e3=(EditText)findViewById(R.id.ed3);
        e4=(EditText)findViewById(R.id.ed4);
        e5=(EditText)findViewById(R.id.ed5);
        e7=(EditText)findViewById(R.id.ed7);
        e8=(EditText)findViewById(R.id.ed8);
        e9=(EditText)findViewById(R.id.ed9);
        s6=(Spinner)findViewById(R.id.spnr);

        code=e1.getText().toString();
        name=e2.getText().toString();
        salary=e3.getText().toString();

    }
}
