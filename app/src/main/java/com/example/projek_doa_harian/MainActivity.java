package com.example.projek_doa_harian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp, clover;
    LinearLayout textsplash, texthome, menu;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menu = (LinearLayout) findViewById(R.id.menu);

        bgapp.animate().translationY(-1300).setDuration(800).setStartDelay(600);
        clover.animate().alpha(0).setDuration(1000).setStartDelay(900);
        textsplash.animate().translationY(140).alpha(0).setDuration(1000).setStartDelay(600);

        texthome.startAnimation(frombottom);
        menu.startAnimation(frombottom);

    }
}
