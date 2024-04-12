package com.example.david188;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        Button button = (Button) findViewById(R.id.button_sign_up);
        int grey = getResources().getColor(R.color.grey);
        int blue = getResources().getColor(R.color.blue);
        TextView sign_in = (TextView) findViewById(R.id.textView4);

        EditText edit_text_1 = (EditText) findViewById(R.id.name);
        EditText edit_text_2 = (EditText) findViewById(R.id.number);
        EditText edit_text_3 = (EditText) findViewById(R.id.email);
        EditText edit_text_4 = (EditText) findViewById(R.id.password);
        EditText edit_text_5 = (EditText) findViewById(R.id.password_confirm);

        

        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    if (edit_text_1.getText().toString().length()>0 &&
                            edit_text_2.getText().toString().length()>0 &&
                            edit_text_3.getText().toString().length()>0 &&
                            edit_text_4.getText().toString().length()>0 &&
                            edit_text_5.getText().toString().length()>0
                            ){

                        button.setEnabled(true);
                        button.setBackgroundColor(blue);
                    }
                    else{
                        button.setEnabled(false);
                        button.setBackgroundColor(grey);
                    }





                } else {
                    button.setEnabled(false);
                    button.setBackgroundColor(grey);

                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_up.this, Home.class);
                startActivity(intent);
            }
        });

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_up.this, Log_in.class);
                startActivity(intent);
            }
        });


    }
    }