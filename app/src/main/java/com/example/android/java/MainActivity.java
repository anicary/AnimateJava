package com.example.android.java;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
    }

    public void onButtonClick(View v) {

        imageView.animate()
                .scaleX(2)
                .scaleY(2)
                .rotationX(220)
                .rotationY(220)
                .translationX(200)
                .translationY(200)
                .setDuration(3000)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Log.i("Animation", "onAnimationStart");
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Log.i("Animation", "onAnimationEnd");

                        animation.removeListener(this);
                        animation.setDuration(0);
                        animation.setInterpolator(new ReverseInterpolator());
                        animation.start();


                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }
    public void onButtonClick1(View v) {

        imageView.animate()
                .rotation(360)
                .y(15)
                .x(45)
                .setDuration(5000)
                .translationX(300)

                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        animation.removeListener(this);
                        animation.setDuration(0);
                        animation.setInterpolator(new ReverseInterpolator());
                        animation.start();

                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                    }
                });
    }

    public void onButtonClick2(View v) {
        imageView.animate()

                .setDuration(3000)
                .scaleX(-2)
                .scaleY(-2)



                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        animation.removeListener(this);
                        animation.setDuration(0);
                        animation.setInterpolator(new ReverseInterpolator());
                        animation.start();
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                    }
                });
    }
    public void onButtonClick3(View v) {

        imageView.animate()
                .rotationX(180)
                .scaleX(-5)
                .setDuration(5000)
                .translationX(300)

                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {animation.removeListener(this);
                        animation.setDuration(0);
                        animation.setInterpolator(new ReverseInterpolator());
                        animation.start();


                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                    }
                });
    }
    public class ReverseInterpolator implements Interpolator {

        private final Interpolator delegate;

        public ReverseInterpolator(Interpolator delegate){
            this.delegate = delegate;
        }

        public ReverseInterpolator(){
            this(new LinearInterpolator());
        }

        @Override
        public float getInterpolation(float input) {
            return 1 - delegate.getInterpolation(input);
        }

    }


}