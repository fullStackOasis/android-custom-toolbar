package com.fullstackoasis.customtoolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.fullstackoasis.customtoolbar.ui.main.MainFragment;
import com.fullstackoasis.customtoolbar.ui.stars.StarsFragment;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnStars;
    private ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        btnStars = findViewById(R.id.imageButtonStars);
        btnStars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, StarsFragment.newInstance())
                        .commitNow();
                toggleBackArrowVisibility();
            }
        });
        btnBack = findViewById(R.id.imageButtonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, MainFragment.newInstance())
                        .commitNow();
                toggleBackArrowVisibility();
            }
        });
    }

    protected void toggleBackArrowVisibility() {
        btnBack.setVisibility(btnBack.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
    }

}