package com.example.dialogwebview1fatihsyams;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dialog_Layout extends AppCompatActivity {
    TextInputEditText edtName, edtAge, edtAddress, edtQuote;

    Button btnKembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog__layout);
        edtName = findViewById(R.id.edt_name);
        edtAge = findViewById(R.id.edt_umur);
        edtAddress = findViewById(R.id.edt_address);
        edtQuote = findViewById(R.id.Quote);

        btnKembali = findViewById(R.id.btn_berpindah);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtName.getText().length() == 0) {
                    edtName.setError("ISI DLU PAK");
                }
                if (edtAddress.getText().length() == 0) {
                    edtAddress.setError("ISI DLU PAK");
                }
                if (edtAge.getText().length() == 0) {
                    edtAge.setError("ISI DLU PAK");
                }
                if (edtQuote.getText().length() == 0) {
                    edtQuote.setError("ISI DLU PAK");
                }else {
                    startActivity(new Intent(Dialog_Layout.this, DialogLayoutLogin.class));
                }

            }
        });
    }
}
