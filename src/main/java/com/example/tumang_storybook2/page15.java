package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page15 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page15);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("Little Red Riding Hood gathered some stones and they filled " + pangalan +"'s belly with them. When he woke up, he was scared and tried to run away but the stones were so heavy that he fell down dead.");
    }

    public void GoPage14(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page14.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage16(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page16.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}