package com.example.firebase9a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

public class PageThree extends AppCompatActivity {

    Button skip;
    TextView showMessage;
    VideoView pppp;
    EditText bookname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);

        skip =findViewById(R.id.skipbtn);

        showMessage=findViewById(R.id.textView2);
        pppp=findViewById(R.id.videoView);

        showMessage.setText("Welcome "+ getIntent().getStringExtra("unamenext"));

        String path = "android.resource://"+getPackageName()+"/raw/ssbookstore";
        pppp.setVideoPath(path);
        pppp.start();

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PageThree.this,PageBooklist.class);
                startActivity(i);
            }
        });// end of skip button
    }
}