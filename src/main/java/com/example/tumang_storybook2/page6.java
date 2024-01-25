package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page6 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText("While Little Red Riding Hood went deeper into the woods to pick flowers, " + pangalan + " went straight to her grandmother’s house. He knocked on the door and heard a voice inside “Who is it?” ‘It’s me, Little Red Riding Hood. I’ve brought you bread, butter, cake and berries”, " + pangalan + " said, disguising his voice. “How lovely! Give the door a big push and come in. I don’t have the strength to come and open it.“");
    }

    public void GoPage5(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page5.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage7(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page7.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}