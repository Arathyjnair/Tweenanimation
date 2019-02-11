package com.example.user.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView)findViewById(R.id.imageView);
    }

    public void zoom(View view) {
        Animation zooo=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        image.startAnimation(zooo);

    }

    public void clockwise(View view) {

        Animation clock=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        image.startAnimation(clock);
    }

    public void fade(View view) {
        Animation fad=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        image.startAnimation(fad);
    }

    public void blink(View view) {
        Animation blik=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        image.startAnimation(blik);
    }

    public void move(View view) {
        Animation mov=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        image.startAnimation(mov);
    }

    public void slide(View view) {
        Animation slde=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        image.startAnimation(slde);
    }
}
