package com.example.anggarisky.doesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditTask extends AppCompatActivity {


    EditText titledoes, descdoes, datedoes;
    Button btnSaveTask, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);

        titledoes = findViewById(R.id.titledoes);
        descdoes = findViewById(R.id.descdoes);
        datedoes = findViewById(R.id.datedoes);

        btnSaveTask = findViewById(R.id.btnSaveTask);
        btnCancel = findViewById(R.id.btnCancel);

        titledoes.setText(getIntent().getStringExtra("titledoes"));
        descdoes.setText(getIntent().getStringExtra("descdoes"));
        datedoes.setText(getIntent().getStringExtra("datedoes"));
    }
}