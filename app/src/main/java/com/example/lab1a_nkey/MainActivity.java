package com.example.lab1a_nkey;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.example.lab1a_nkey.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private void decideWinner() {

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Weapon.getRandomWeapon();
                decideWinner();



            }
        });

    }


}

