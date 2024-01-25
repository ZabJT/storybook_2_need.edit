package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page10 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("Her grandmother looked strange. “Oh, Grandma, what big ears you have!” exclaimed Red Riding Hood. “All the better to hear you with!” " + pangalan + " replied in a fake voice. “Oh, Grandma, what big eyes you have!” she continued. “All the better to see you with! ”" + pangalan + " said. “Oh, Grandma, what big hands you have!” “All the better to grab you with!”, " + pangalan + " said.");
    }

    public void GoPage9(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page9.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage11(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page11.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}