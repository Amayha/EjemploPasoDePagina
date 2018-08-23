package com.example.estudiante.ejemplopasodepagina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UserFormActivity extends AppCompatActivity {


    private EditText edtUserFormName;
    private EditText edtUserFormEmail;
    private EditText edtUserFormNick;

    private Button btnUserFormFinish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);

        //Intent solicitud = getIntent();

        edtUserFormName = findViewById(R.id.edt_userform_name);
        edtUserFormEmail = findViewById(R.id.edt_userform_email);
        edtUserFormNick = findViewById(R.id.edt_userform_nick);

        btnUserFormFinish = findViewById(R.id.btn_userform_finish);


    }
}
