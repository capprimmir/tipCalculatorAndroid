package com.example.mperez.tipcalculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numTip, numTotal, numInitial;
    Button btn15, btn18, btn20;
    double initialAmnt, tipPercent, total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numInitial = (EditText)findViewById(R.id.numInitial);
        numTip = (EditText)findViewById(R.id.numTip);
        numTotal = (EditText)findViewById(R.id.numTotal);

        btn15 = (Button)findViewById(R.id.btn15);
        btn18 = (Button)findViewById(R.id.btn18);
        btn20 = (Button)findViewById(R.id.btn20);


        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initialAmnt = Double.parseDouble(numInitial.getText().toString());

                tipPercent = initialAmnt * .15;
                total =  tipPercent + initialAmnt;

                numTip.setText(String.valueOf(tipPercent));
                numTotal.setText(String.valueOf(total));

            }

        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initialAmnt = Double.parseDouble(numInitial.getText().toString());

                tipPercent  = initialAmnt * .18;
                total = tipPercent + initialAmnt;

                numTip.setText(String.valueOf(tipPercent));
                numTotal.setText(String.valueOf(total));

            }

        });


        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initialAmnt = Double.parseDouble(numInitial.getText().toString());

                tipPercent  = initialAmnt * .20;
                total = tipPercent + initialAmnt;

                numTip.setText(String.valueOf(tipPercent));
                numTotal.setText(String.valueOf(total));

            }

        });



    }
}
