package com.example.helloworld;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.KeyEvent;
import android.content.Intent;
import android.widget.LinearLayout;
import android.view.View;

public class a extends AppCompatActivity {

    protected void onCreate(Bundle a) {
        setTheme(R.style.a);
        super.onCreate(a);
        setContentView(R.layout.a);
        final AppCompatTextView b = (AppCompatTextView) findViewById(R.id.a);
        b.setText("Hello World");
        b.setTextSize(30);
        Typeface c = Typeface.createFromAsset(getAssets(), "fonts/a.ttf");
        b.setTypeface(c);
        int d = ContextCompat.getColor(getApplicationContext(),R.color.d);
        b.setTextColor(d);
        LinearLayout e = (LinearLayout) findViewById(R.id.f);
        e.setBackgroundResource(R.drawable.e);
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 String f = b.getText().toString();
                 String g = "Hello World";
                 String h = "Hi World";
                 if (f.equals(g)) {
                     b.setText(h);
                 } else {
                     b.setText(g);
                 }
            }
        });
    }

    public boolean onKeyLongPress(int a, KeyEvent b) {
        if (a == 4 && !b.isCanceled()) {
            finish();
            startActivity(new Intent(this, com.android.DROID_MJ.fakeidentitygenerator.a.class));
        }
        return false;
    }
}