package com.example.dialogwebview1fatihsyams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HasilDialogLayout extends AppCompatActivity {
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_dialog_layout);

        btnregister = findViewById(R.id.btn_registerr);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HasilDialogLayout.this, LastActivity.class));
            }
        });
    }
}
