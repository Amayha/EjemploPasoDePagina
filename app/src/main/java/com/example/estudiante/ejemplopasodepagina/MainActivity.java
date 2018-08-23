package com.example.estudiante.ejemplopasodepagina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnMainToForm;
    private TextView tvMainStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnMainToForm = findViewById(R.id.btn_main_to_form);
        tvMainStatus = findViewById(R.id.tv_status_name);


        btnMainToForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });


    }
}
