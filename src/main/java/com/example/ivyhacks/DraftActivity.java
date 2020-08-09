package com.example.ivyhacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DraftActivity extends AppCompatActivity {

    private Spinner Emails;
    Button btn_send;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draft);

        firebaseAuth = FirebaseAuth.getInstance();

        btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DraftActivity.this, MainActivity.class));
                send();
                finish();
            }
        });
    }

    public void send(){
        EditText target = findViewById(R.id.email);
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users").child(target.getText().toString());
    }

}