package com.bodhi.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String introToast = "This button will launch my ";
    private static final String endToast = " app";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);

        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) b1.getLayoutParams();
        params1.addRule(RelativeLayout.ALIGN_LEFT, R.id.button4);
        params1.addRule(RelativeLayout.ALIGN_RIGHT, R.id.button4);
        b1.setLayoutParams(params1);

        RelativeLayout.LayoutParams params2 = (RelativeLayout.LayoutParams) b2.getLayoutParams();
        params2.addRule(RelativeLayout.ALIGN_LEFT, R.id.button4);
        params2.addRule(RelativeLayout.ALIGN_RIGHT, R.id.button4);
        b2.setLayoutParams(params2);

        RelativeLayout.LayoutParams params3 = (RelativeLayout.LayoutParams) b3.getLayoutParams();
        params3.addRule(RelativeLayout.ALIGN_LEFT, R.id.button4);
        params3.addRule(RelativeLayout.ALIGN_RIGHT, R.id.button4);
        b3.setLayoutParams(params3);

        RelativeLayout.LayoutParams params5 = (RelativeLayout.LayoutParams) b5.getLayoutParams();
        params5.addRule(RelativeLayout.ALIGN_LEFT, R.id.button4);
        params5.addRule(RelativeLayout.ALIGN_RIGHT, R.id.button4);
        b5.setLayoutParams(params5);

        RelativeLayout.LayoutParams params6 = (RelativeLayout.LayoutParams) b6.getLayoutParams();
        params6.addRule(RelativeLayout.ALIGN_LEFT, R.id.button4);
        params6.addRule(RelativeLayout.ALIGN_RIGHT, R.id.button4);
        b6.setLayoutParams(params6);


    }

    public void buttonClicked(View view) {
        Button b = (Button) view;
        CharSequence charSequence = (introToast + b.getText() + endToast);
        Toast.makeText(this, charSequence, Toast.LENGTH_SHORT).show();
    }
}
