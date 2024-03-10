/*
 *
 *   Created by VnjVibhash on 3/10/24, 5:32 PM
 *   Copyright Ⓒ 2024. All rights reserved Ⓒ 2024 http://vivekajee.in/
 *   Last modified: 3/10/24, 5:32 PM
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License. You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENS... Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *    either express or implied. See the License for the specific language governing permissions and
 *    limitations under the License.
 * /
 */

package in.innovateria.planeshooterGame;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class SplashActivity extends AppCompatActivity {
    public CountDownTimer countDownTimer;
    GifImageView gifImageView;
    TextView txtZoomIn;
    TranslateAnimation animation;
    Animation animZoomIn;
    private long timeLeftInMillis = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        gifImageView = findViewById(R.id.img);
        animation = new TranslateAnimation(-400.0f, 400.0f, 0.0f, 0.0f);
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