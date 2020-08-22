package com.example.intentpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nombre="pamela";
        String apellido="valenzuela";

        String minombre= nombre+apellido;

        TextView mtext=findViewById(R.id.mitexto);
        mtext.setText(minombre);

        Button mibotoncito=findViewById(R.id.mibutton);
         mibotoncito.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent mIntent= new Intent(MainActivity.this,Pintent.class);
               startActivity(mIntent);
               finish();
               Log.e("No hace el intent", "no");
           }
       });
    }
}