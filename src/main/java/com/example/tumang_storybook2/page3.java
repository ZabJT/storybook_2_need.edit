package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page3 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("Little Red Riding Hood’s grandmother lived half an hour away in the woods outside the village. So Little Red Riding Hood set off. The girl had just entered the woods, when "+ pangalan +" came out of the trees. She wasn’t scared because she didn’t know "+ pangalan + " is dangerous.");
    }

    public void GoPage2(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page2.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage4(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page4.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}