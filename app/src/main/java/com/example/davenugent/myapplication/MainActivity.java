package com.example.davenugent.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button mult;
    private Button div;
    private Button sub;
    private Button add;
    private Button dec;
    private Button eq;
    private Button clear;
    private TextView info;
    private TextView result;
    private final char ADDI = '+';
    private final char SUBT = '-';
    private final char MULTI = '*';
    private final char DIVI = '/';
    private double val1 = -1;
    private double val2;
    private char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "0");
            }

        });
        one.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "1");
            }

        });
        two.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "2");
            }

        });
        three.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "3");
            }

        });
        four.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "4");
            }

        });
        five.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "5");
            }

        });
        six.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "6");
            }

        });
        seven.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "7");
            }

        });
        eight.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "8");
            }

        });
        nine.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + "9");
            }

        });
        add.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operation = ADDI;
                val1 = parseDouble(info.getText().toString());
                result.setText(info.getText().toString() + "+");
                info.setText("");
            }

        });
        sub.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operation = SUBT;
                val1 = parseDouble(info.getText().toString());
                result.setText(info.getText().toString() + "-");
                info.setText("");
            }

        });
        mult.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operation = MULTI;
                val1 = parseDouble(info.getText().toString());
                result.setText(info.getText().toString() + "*");
                info.setText("");
            }

        });
        div.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
               operation = DIVI;
                val1 = parseDouble(info.getText().toString());
                result.setText(info.getText().toString() + "/");
                info.setText("");
            }

        });
        dec.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText(info.getText().toString() + ".");
            }

        });
        clear.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                info.setText("");
                result.setText("");
                val1 = -1;
            }

        });
        eq.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (val1 != -1 ) {
                    switch (operation) {
                        case ADDI:
                            val2 = parseDouble(info.getText().toString()) + val1;
                            break;
                        case SUBT:
                            val2 = val1 - parseDouble(info.getText().toString());
                            break;
                        case DIVI:
                            val2 =  val1 / parseDouble(info.getText().toString());
                            break;
                        case MULTI:
                            val2 = parseDouble(info.getText().toString()) * val1;
                            break;
                        default:
                            val2 = val1;
                    }
                    result.setText(String.valueOf(val2));
                    val1 = val2;
                    info.setText(String.valueOf(val2));
                }

            }

        });


    }

    protected void setupUIViews() {
        zero = (Button) findViewById(R.id.btn0);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        dec = (Button) findViewById(R.id.btnDec);
        add = (Button) findViewById(R.id.btnAdd);
        sub = (Button) findViewById(R.id.btnSub);
        mult = (Button) findViewById(R.id.btnMult);
        div = (Button) findViewById(R.id.btnDiv);
        clear = (Button) findViewById(R.id.btnClr);
        eq = (Button) findViewById(R.id.btnEq);
        info = (TextView) findViewById(R.id.TVControl);
        result = (TextView) findViewById(R.id.TVResult);
    }
}

