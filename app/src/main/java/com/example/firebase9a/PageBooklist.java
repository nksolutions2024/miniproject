package com.example.firebase9a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageBooklist extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot;
    Button add,sub,mul,div,equal,clear,sclearv;
    Button buynow;

    TextView tv;

    TextView callll;

    Float no1,no2,ans;

    String op;

    String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_booklist);

        buynow = findViewById(R.id.buynowbtn);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bdot=findViewById(R.id.btnDot);
        add=findViewById(R.id.btnAdd);
        sub=findViewById(R.id.btnSub);
        mul=findViewById(R.id.btnMul);
        div=findViewById(R.id.btnDiv);
        equal=findViewById(R.id.btnEqual);
//        clear=findViewById(R.id.btnClear);
        tv=findViewById(R.id.textview3);
        callll=findViewById(R.id.allcalculation);
        sclearv=findViewById(R.id.sclear);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Harry Potter");
//                callll.setText(callll.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Wings of Wire");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"4");
            }
        });
//
//        bdot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv.setText(tv.getText()+".");
//            }
//        });
//
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                callll.setText(callll.getText()+"+");
//                no1=Float.parseFloat(tv.getText()+"");
//                op="+";
//                tv.setText(null);
//            }
//        });
//
////        sub.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                no1=Integer.parseInt(tv.getText()+"");
////                op="-";
////                tv.setText(null);
////            }
////        });
////
////        div.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                no1=Integer.parseInt(tv.getText()+"");
////                op="/";
////                tv.setText(null);
////            }
////        });
////
////        mul.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                no1=Integer.parseInt(tv.getText()+"");
////                op="*";
////                tv.setText(null);
////            }
////        });
//
//        equal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                no2=Float.parseFloat(tv.getText().toString());
//                switch(op) {
//                    case "+" :ans=no1+no2;
//                        break;
//                    case "-" :ans=no1-no2;
//                        break;
//                    case "/" :ans=no1/no2;
//                        break;
//                    case "*" :ans=no1*no2;
//                        break;
//                }
//                tv.setText(ans+"");
//            }
//        });
//
//        clear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv.setText("");
//            }
//        });
//
//        sclearv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                temp = tv.getText().toString();
//                String newtext = temp.substring(0,temp.length()-1);
//                tv.setText(newtext);
//            }
//        });

        buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //going to BuyPage
                String bookname = tv.getText().toString();
                Intent i = new Intent(PageBooklist.this,BuyPage.class);
                i.putExtra("booknamenext",bookname);
                startActivity(i);
            }
        });


    }
}