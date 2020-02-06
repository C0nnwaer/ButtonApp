package com.chungbella.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Button submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit_button = findViewById(R.id.test_button);
        submit_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i("testButton", "Hey what's up? :)");
            }
        });
    }
}
