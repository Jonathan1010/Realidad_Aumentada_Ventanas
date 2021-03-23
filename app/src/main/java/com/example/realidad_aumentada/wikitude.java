package com.example.realidad_aumentada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wikitude extends AppCompatActivity implements View.OnClickListener {
    Button volver;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wikitude);
        volver = (Button) findViewById(R.id.btn_volver);
        volver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == volver){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
    }
}