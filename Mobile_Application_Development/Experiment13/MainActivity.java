package com.example.exp13;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openBROWSEActivity();
    }
    public void openBROWSEActivity(){
        Intent intent = new Intent(this,BrowseActivity.class);
        startActivity(intent);
    }
}
