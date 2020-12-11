package com.example.midtermactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name, weight, height;
    Button go;
    TextView result, result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.editTextTextPersonName8);
        weight=findViewById(R.id.editTextTextPersonName9);
        height=findViewById(R.id.editTextTextPersonName10);
        go=findViewById(R.id.button2);
        result=findViewById(R.id.textView);
        result2=findViewById(R.id.textView2);

        go.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String txtName;

                txtName=name.getText().toString();
                result.setText("Name: "+ txtName);
                calculate();
            }
        });
    }
    public void calculate(){
        Double value1 = Double.parseDouble(weight.getText().toString());
        Double value2 = Double.parseDouble(height.getText().toString());

        Double calculatedValue = value1/(value2*value2);
        result2.setText("Body Mass Index: "+calculatedValue.toString());
    }
}