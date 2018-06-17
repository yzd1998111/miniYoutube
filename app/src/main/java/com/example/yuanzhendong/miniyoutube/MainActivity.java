package com.example.yuanzhendong.miniyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSingle = findViewById(R.id.btnPlaySingle);
        Button btnStandAlone = findViewById(R.id.btnStandalone);

        btnSingle.setOnClickListener(this);
        btnStandAlone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnPlaySingle:
                intent = new Intent(this, YoutubeActivity.class);
                break;
            case R.id.btnStandalone:
                intent = new Intent(this, StandaloneActivity.class);
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
