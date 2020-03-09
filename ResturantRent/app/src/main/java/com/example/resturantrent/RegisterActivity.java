package com.example.resturantrent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void toAccountActivity(View view){
        Intent i = new Intent(RegisterActivity.this,AccountActivity.class);
        startActivity(i);
    }
}
