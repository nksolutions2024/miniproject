package com.example.firebase9a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BuyPage extends AppCompatActivity {

    EditText selectedbook;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_page);
        submit = findViewById(R.id.submitbutton);
        selectedbook = findViewById(R.id.selectedbookbox);
        selectedbook.setText(""+ getIntent().getStringExtra("booknamenext"));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //going to thankupage
                Intent i = new Intent(BuyPage.this,ThankuPage.class);
                startActivity(i);
            }
        });


    }
}