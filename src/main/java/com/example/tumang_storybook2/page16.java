package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page16 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page16);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("The three ate some cake, happy in the knowledge that " + pangalan + " was not going to be a danger anymore. Little Red Riding Hood decided never to leave the path again and to listen more carefully to what her mother told her.");
    }

    public void GoPage15(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page15.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void Gocoverpage (View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, coverpage.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}