package com.chungbella.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button submit_button;
    TextView display_text;
    Integer click_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = getString(R.string.text_count, click_count);

        display_text = findViewById(R.id.text);
        display_text.setText(text);
        submit_button = findViewById(R.id.test_button);
        submit_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i("testButton", "Hey what's up? :)");
                click_count += 1;

                String text = getString(R.string.text_count, click_count);
                display_text.setText(text);

                Random rand = new Random();
                int color = Color.argb(255, rand.nextInt(256),
                        rand.nextInt(256), rand.nextInt(256));
                submit_button.setTextColor(color);
            }
        });
    }
}
