package com.example.hm_adapter_03;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        String[] itemNames = {"Meat", "Juice", "Bread"};
        int[] itemImages = {R.drawable.img1, R.drawable.img2, R.drawable.img3};

        SpinnerAdapter adapter = new SpinnerAdapter(this, itemNames, itemImages);
        spinner.setAdapter(adapter);
    }
}