package com.example.afdhalrifqiathallah_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.afdhalrifqiathallah_uts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String nama = getIntent().getStringExtra("nama");
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        binding.tvNama.setText(nama);
        binding.tvEmail.setText(email);
        binding.tvPassword.setText(password);
    }
}