package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page4 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("Good day, Little Red Riding Hood, " + pangalan + " greeted her. Good day, Mr." + pangalan + ", the girl replied. Where are you going? he asked. I’m going to visit my grandmother, because she isn’t feeling very well, Little Red Riding Hood replied. What do you have in that basket?" + pangalan + " asked. I have some bread, butter, cake and berries to take to grandma, she replied. Excellent! And where does your grandmother live? " + pangalan + " asked again, and Little Red Riding Hood explained exactly where her grandma lived.");
    }

    public void GoPage3(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page3.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage5(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page5.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}