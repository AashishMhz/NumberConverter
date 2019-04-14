package com.example.numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Words numWords;
    EditText numetxt;
    TextView diswordtxt;
    Button btncon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numWords =  new Words();

        numetxt = findViewById(R.id.numetxt);
        diswordtxt = findViewById(R.id.diswordtxt);
        btncon = findViewById(R.id.btncon);
        btncon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String words;
        switch (v.getId()) {
            case R.id.btncon:
                words = numWords.converter(Integer.parseInt(numetxt.getText().toString()));
                diswordtxt.setText(words);
                break;
            default:;
                break;
        }
    }
}
