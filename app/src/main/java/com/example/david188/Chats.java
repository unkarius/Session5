package com.example.david188;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);

        ImageView img = (ImageView) findViewById(R.id.e4r);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chats.this, Home.class);
                startActivity(intent);
            }
        });

        ImageView img_chat = (ImageView) findViewById(R.id.imageView34);

        img_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chats.this, Chat_rider.class);
                startActivity(intent);
            }
        });

    }
}