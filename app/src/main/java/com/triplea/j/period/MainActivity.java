package com.triplea.j.period;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Spot> bathrooms = new ArrayList<>();
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = (findViewById(R.id.mapppppp));
        setContentView(R.layout.activity_map);
        ImageButton plusButton = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton minusButton = (ImageButton) findViewById(R.id.imageButton4);

        final TextView heart = findViewById(R.id.editText2);
        final TextView face = findViewById(R.id.editText3);


        minusButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int i = Integer.parseInt(heart.getText().toString());
                i++;
                heart.setText(i);

            }

        });

        plusButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int j = Integer.parseInt(face.getText().toString());
                j++;
                face.setText(j);

            }

        });




    }










}
