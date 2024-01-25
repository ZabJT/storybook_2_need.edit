package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page8 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("When Little Red Riding Hood arrived at her grandmother’s house, she noticed that the door was open. The girl went in and went to the bedroom.");
    }

    public void GoPage7(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page7.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage9(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page9.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}