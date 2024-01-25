package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page7 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText( pangalan + " entered the house, went to the old woman’s bed and ate her whole. Then he put her clothes on and slipped into the bed.");
    }

    public void GoPage6(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page6.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage8(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page8.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}