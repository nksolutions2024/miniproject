package com.example.firebase9a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText prn,name,email;
    Button insert,select;
    DatabaseReference databaseReference;
    DataSnapshot dsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prn = findViewById(R.id.editTextText1);
        name = findViewById(R.id.editTextText2);
        email = findViewById(R.id.editTextText3);
        insert = findViewById(R.id.button1);
        select = findViewById(R.id.button2);

        databaseReference = FirebaseDatabase.getInstance().getReference("studentinfo");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                dsp = snapshot;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });// end of add value event listener

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentPrn = prn.getText().toString();
                String studentName = name.getText().toString();
                String studentEmail = email.getText().toString();
                studentinfo data = new studentinfo(studentPrn, studentName,studentEmail);
                databaseReference.child(studentPrn).setValue(data);

                //going to page3
                String uname = prn.getText().toString();
                Intent i = new Intent(MainActivity.this,PageThree.class);
                i.putExtra("unamenext",uname);
                startActivity(i);

            }
        });// end of insert button
    }
}