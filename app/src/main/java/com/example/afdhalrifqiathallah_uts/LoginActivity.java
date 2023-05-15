package com.example.afdhalrifqiathallah_uts;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.afdhalrifqiathallah_uts.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = getIntent().getStringExtra("nama");
                String email = getIntent().getStringExtra("email");
                String password = getIntent().getStringExtra("password");

                if (TextUtils.isEmpty(nama)){
                    binding.etNamaLogin.setError("Nama harus di isi");
                }else if (TextUtils.isEmpty(password)) {
                    binding.etPasswordLogin.setError("password harus di isi");
                }else {
                    Intent login = new Intent(LoginActivity.this, MainActivity.class);
                    login.putExtra("nama", nama);
                    login.putExtra("email", email );
                    login.putExtra("password", password );
                    startActivity(login);
                }

            }
        });
        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(register);
                finishAffinity();
            }
        });
    }
}
