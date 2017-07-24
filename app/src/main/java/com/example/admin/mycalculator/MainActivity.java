package com.example.admin.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnadd,btnsub,btnmul,btndiv;
    private TextView result;
    private EditText firstNumber ,secondNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnadd = (Button)findViewById(R.id.btnadd);
        btnsub = (Button)findViewById(R.id.btnsub);
        btnmul = (Button)findViewById(R.id.btnmul);
        btndiv = (Button)findViewById(R.id.btndiv);
        firstNumber = (EditText)findViewById(R.id.firstNumber);
        secondNumber = (EditText)findViewById(R.id.secondNumber);


        result = (TextView)findViewById(R.id.result);
        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = firstNumber.getText().toString();
        String num2 = secondNumber.getText().toString();

        switch (view.getId()) {
            case R.id.btnadd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnsub:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnmul:
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(String.valueOf(multiplication));
                break;
            case R.id.btndiv:
                try
                {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    result.setText(String.valueOf(division));
                }
                catch(Exception e)
                {
                    result.setText("CANNOT DIVIDE");
                }
                break;

        }

    }
}
