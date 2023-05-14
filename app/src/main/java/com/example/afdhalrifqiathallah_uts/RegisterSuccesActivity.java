package com.example.afdhalrifqiathallah_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.afdhalrifqiathallah_uts.databinding.ActivityRegisterSuccesBinding;

public class RegisterSuccesActivity extends AppCompatActivity {

    ActivityRegisterSuccesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterSuccesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = getIntent().getStringExtra("nama");
                String email = getIntent().getStringExtra("email");
                String password = getIntent().getStringExtra("password");

                Intent registersuccess = new Intent(RegisterSuccesActivity.this, LoginActivity.class);
                registersuccess.putExtra("nama", nama);
                registersuccess.putExtra("email", email );
                registersuccess.putExtra("password", password );
                startActivity(registersuccess);
            }
        });
    }
}