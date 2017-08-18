package com.example.adeeb.simpleloginformapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginClick(View view){
        EditText txtUserName = (EditText)findViewById(R.id.txtUserName);
        EditText txtPassword = (EditText)findViewById(R.id.txtPassword);

        Log.i("Entered Values:", txtUserName.getText() + " - " + txtPassword.getText());
    }
}
