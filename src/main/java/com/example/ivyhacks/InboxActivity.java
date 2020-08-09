package com.example.ivyhacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InboxActivity extends AppCompatActivity {

    Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);

        btn_1 = findViewById(R.id.btn_toComplete1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InboxActivity.this, MessageActivity.class));
            }
        });
    }
}