package com.example.sherlartoplami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KitobActivity extends AppCompatActivity {
    TextView sher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitob);
        sher = findViewById(R.id.sher);
        boolean a = getIntent().getBooleanExtra("til", true);
        if (a) {
            sher.setText(R.string.kitob_lotincha);
        } else {
            sher.setText(R.string.kitob_krilcha);
        }
    }
}
