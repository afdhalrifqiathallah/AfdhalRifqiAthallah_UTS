package com.example.afdhalrifqiathallah_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.afdhalrifqiathallah_uts.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaRegister = binding.etNamaRegister.getText().toString().trim();
                String emailRegister = binding.etEmailRegister.getText().toString().trim();
                String passwordRegister = binding.etPasswordRegister.getText().toString().trim();

                if (TextUtils.isEmpty(namaRegister)) {
                    binding.etNamaRegister.setError("Nama harus di isi");
                } else if (TextUtils.isEmpty(emailRegister)) {
                    binding.etEmailRegister.setError("Email harus di isi");
                } else if (TextUtils.isEmpty(passwordRegister)) {
                    binding.etPasswordRegister.setError("Password harus di isi");
                }else {
                    Intent register = new Intent(RegisterActivity.this, RegisterSuccesActivity.class);
                    register.putExtra("nama", namaRegister);
                    register.putExtra("email", emailRegister );
                    register.putExtra("password", passwordRegister );
                    startActivity(register);
                    finishAffinity();
                }
            }
        });
    }
}