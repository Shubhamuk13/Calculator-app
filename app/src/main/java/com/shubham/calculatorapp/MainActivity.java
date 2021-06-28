package com.shubham.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btnadd,btn5,btn6,btn7,btn8,btnsub,btn9,btnmul,btndot,btn0,btnequal,btndiv,btnclear;
    EditText ed1;
    float Res1,Res2;
    boolean add,mul,sub,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btnadd=(Button)findViewById(R.id.btnadd);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btnsub=(Button)findViewById(R.id.btnsub);
        btn9=(Button)findViewById(R.id.btn9);
        btn4=(Button)findViewById(R.id.btn4);
        btn8=(Button)findViewById(R.id.btn8);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndot=(Button)findViewById(R.id.btndot);
        btn0=(Button)findViewById(R.id.btn0);
        btnequal=(Button)findViewById(R.id.btnequal);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnclear=(Button)findViewById(R.id.btnclear);
        ed1=(EditText)findViewById(R.id.ed1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");

                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    add=true;
                    ed1.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");

                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    sub=true;
                    ed1.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");

                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    mul=true;
                    ed1.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");

                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    div=true;
                    ed1.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2=Float.parseFloat(ed1.getText()+"");
                if(add==true){
                    ed1.setText(Res1+Res2+"");
                    add=false;
                }
                if(sub==true){
                    ed1.setText(Res1-Res2+"");
                    sub=false;
                }
                if(mul==true){
                    ed1.setText(Res1*Res2+"");
                    mul=false;
                }
                if(div==true){
                    ed1.setText(Res1/Res2+"");
                    div=false;
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
    }
}