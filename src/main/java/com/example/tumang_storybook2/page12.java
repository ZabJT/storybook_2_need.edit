package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page12 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("With his stomach full, " + pangalan + " got back into grandma’s bed and fell asleep, snoring loudly. A huntsman, who was passing by the house, heard him and thought it was very strange for the old woman to snore so loudly. He looked inside and saw that it was " + pangalan + " who was snoring. The huntsman had been looking for " + pangalan + " for a long time. At long last he had found him!");
    }

    public void GoPage11(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page10.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage13(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page13.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}