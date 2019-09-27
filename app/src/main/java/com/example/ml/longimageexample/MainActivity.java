package com.example.ml.longimageexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BigView bigView = findViewById(R.id.bigView);
        InputStream is = null;
        try {
            is = getAssets().open("long.jpg");

        } catch (IOException e) {
            e.printStackTrace();
        }
        bigView.setImage(is);
    }
}
