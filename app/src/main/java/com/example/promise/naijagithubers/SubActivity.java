package com.example.promise.naijagithubers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button button = (Button) findViewById(R.id.javaDevelopers);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.cDevelopers);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SubActivity.this, CActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.rubyDeveelopers);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SubActivity.this, RubyActivity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.pythonDeveelopers);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SubActivity.this, PythonActivity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.phpDeveelopers);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SubActivity.this, PhpActivity.class);
                startActivity(intent);
            }
        });
    }

}
