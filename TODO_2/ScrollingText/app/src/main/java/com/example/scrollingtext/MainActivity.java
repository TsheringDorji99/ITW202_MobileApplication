package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView linktext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linktext = findViewById(R.id.textView3);
        linktext.setMovementMethod(LinkMovementMethod.getInstance());
    }
}