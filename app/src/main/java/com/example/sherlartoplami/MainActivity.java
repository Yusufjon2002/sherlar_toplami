package com.example.sherlartoplami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button kril, lotin;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lotin = findViewById(R.id.lotincha);
        kril = findViewById(R.id.krilcha);
        imageView=findViewById(R.id.imageview);
        textView=findViewById(R.id.textview);

        Intent intent = new Intent(MainActivity.this, KitobActivity.class);

        lotin.setOnClickListener(view -> {
            intent.putExtra("til", true);
            startActivity(intent);
        });
        kril.setOnClickListener(view -> {
            intent.putExtra("til", false);
            startActivity(intent);
        });

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.animation1);
        lotin.startAnimation(animation1);

        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2);
        kril.startAnimation(animation2);

        Animation image_animation = AnimationUtils.loadAnimation(this, R.anim.image_animation);
        imageView.startAnimation(image_animation);

        Animation textview_animation = AnimationUtils.loadAnimation(this, R.anim.textview_animation);
        textView.startAnimation(textview_animation);
    }
}
