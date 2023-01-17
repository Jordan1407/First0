package com.example.first0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        /*cargar imagen con Glide (logo)
        ImageView fondo = findViewById(R.id.logo);
        Glide.with(this)
                .load(R.drawable.error)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.color1)))
                .circleCrop()
                .into(fondo);*/

        //animacion en logo
        ImageView logo = findViewById(R.id.logo);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        logo.startAnimation(anim);

        //open SignUp
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);


    }
}