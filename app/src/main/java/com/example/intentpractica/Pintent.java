package com.example.intentpractica;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Pintent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pintent);



        Button mbuttonsecond=findViewById(R.id.mibutton2);
        mbuttonsecond.setOnClickListener

                (new View.OnClickListener() {
                     @Override
                    public void onClick(View v) {
                    Intent mIntentSecond= new Intent(Pintent.this,MainActivity.class);
                    startActivity(mIntentSecond);
                    finish(); }
                    }
                );
    }
}