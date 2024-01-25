package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page5 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("They walked together for a while. Then " + pangalan + " spoke again. What lovely flowers there are here! Why don’t you pick some for your grandma?” The girl looked around and saw all those beautiful flowers. She thought that her grandmother would be delighted to have some fresh flowers and, despite her mother’s advice, she left the path.");
    }

    public void GoPage4(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page4.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage6(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page6.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}