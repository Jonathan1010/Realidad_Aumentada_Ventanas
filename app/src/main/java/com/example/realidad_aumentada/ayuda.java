package com.example.realidad_aumentada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ayuda extends AppCompatActivity implements View.OnClickListener {
    Button  btnregresar;

    //Transacciones
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);
        btnregresar = (Button) findViewById(R.id.btn_regresar);
        btnregresar.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if(v == btnregresar){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
    }
}