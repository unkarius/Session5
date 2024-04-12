package com.example.david188;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Transaction_successful_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_successful1);
        TextView txt = (TextView) findViewById(R.id.textView34);
        ImageView img = (ImageView) findViewById(R.id.imageView9);
        Button button = (Button) findViewById(R.id.button_229);

        txt.setText("");
        img.setImageResource(R.drawable.krug_1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Transaction_successful_1.this, Home.class);
                startActivity(intent);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                img.setImageResource(R.drawable.good_tick);
                txt.setText("Transaction Successful");


            }
        },2000);
    }
}