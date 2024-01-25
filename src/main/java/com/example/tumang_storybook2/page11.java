package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page11 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("“Oh, Grandma, what a big mouth you have!” exclaimed Red Riding Hood. “All the better to eat you with!” " + pangalan + " roared, jumped off the bed and ate the poor girl whole.");
    }

    public void GoPage10(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page10.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage12(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page12.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}