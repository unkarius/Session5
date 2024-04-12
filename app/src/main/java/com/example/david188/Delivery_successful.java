package com.example.david188;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Delivery_successful extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_successful);
        TextView txt = (TextView) findViewById(R.id.textView7976);
        TextView txt1 = (TextView) findViewById(R.id.textView8143);
        ImageView img = (ImageView) findViewById(R.id.imageView183);
        Button button = (Button) findViewById(R.id.button_234346);

        txt.setText("");
        txt1.setText("");
        img.setImageResource(R.drawable.krug_1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Delivery_successful.this, Home.class);
                startActivity(intent);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                img.setImageResource(R.drawable.good_tick);
                txt.setText("Delivery Successful");
                txt1.setText("Your Item has been delivered successfully");



            }
        },2000);
    }
}