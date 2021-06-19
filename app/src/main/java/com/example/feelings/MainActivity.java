package com.example.feelings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton happy;
    ImageButton sad;
    ImageButton neutral;
    ImageButton angry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        happy =(ImageButton)findViewById(R.id.happy);
        sad=(ImageButton)findViewById(R.id.sad);
        neutral=(ImageButton)findViewById(R.id.neutral);
        angry=(ImageButton)findViewById(R.id.angry);
        happy.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(getApplicationContext(), happy.class);
                                          startActivity(intent);
                                      }

                                  }
        );
        sad.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(getApplicationContext(),sad.class);
                                        startActivity(intent);
                                    }

                                }
        );
        neutral.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(getApplicationContext(), Neutral.class);
                                         startActivity(intent);
                                     }

                                 }
        );
        angry.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(getApplicationContext(), angry.class);
                                           startActivity(intent);
                                       }

                                   }
        );
    }

    }
