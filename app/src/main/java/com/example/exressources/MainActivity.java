package com.example.exressources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = findViewById(R.id.t);

        String ch2 = getString(R.string.chaine2);

        t.setText(ch2);

        String[] tab = getResources().getStringArray(R.array.filiere);


    }
}