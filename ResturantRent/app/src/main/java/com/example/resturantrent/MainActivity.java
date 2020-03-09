package com.example.resturantrent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView toRegisterActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toRegisterActivity = findViewById(R.id.toRegisterActivity);
        toRegisterActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });
    }
    public void toAccountActivity(View view){
        Intent i = new Intent(MainActivity.this,AccountActivity.class);
        startActivity(i);
    }
}
