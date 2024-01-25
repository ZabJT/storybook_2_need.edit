package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page14 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page14);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("So the man took a pair of scissors and cut open " + pangalan + "'s belly. He saw a red hood popping out and then Little Red Riding Hood jumped out. The huntsman cut a bit more and the grandmother came out, too.");
    }

    public void GoPage13(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page13.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage15(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page15.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}