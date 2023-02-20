package in.innovateria.planeshooterGame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class SplashActivity extends AppCompatActivity {
    public CountDownTimer countDownTimer;
    private long timeLeftInMillis = 5000;
    GifImageView gifImageView;
    TextView txtZoomIn;
    TranslateAnimation animation;
    Animation animZoomIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        gifImageView = findViewById(R.id.img);
        animation = new TranslateAnimation(-400.0f, 400.0f,0.0f, 0.0f);
        animation.setDuration(5000);
        animation.setRepeatCount(5);
        animation.setRepeatMode(2);
        animation.setFillAfter(true);
        gifImageView.startAnimation(animation);

        txtZoomIn = findViewById(R.id.game_text);
        animZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        txtZoomIn.startAnimation(animZoomIn);

        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();

    }
}