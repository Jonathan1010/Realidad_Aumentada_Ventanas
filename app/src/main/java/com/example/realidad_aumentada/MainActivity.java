package com.example.realidad_aumentada;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.wikitude.NativeStartupConfiguration;
import com.wikitude.WikitudeSDK;
import com.wikitude.common.camera.CameraSettings;
import com.wikitude.common.rendering.InternalRendering;
import com.wikitude.common.rendering.RenderExtension;
import com.wikitude.tracker.ImageTrackerListener;
import com.wikitude.tracker.TargetCollectionResource;

import java.sql.Driver;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button realidad_aumentada , ayuda , wikitude;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        NativeStartupConfiguration startupConfiguration = new NativeStartupConfiguration();
        startupConfiguration.setLicenseKey(WikitudeSDKConstants.WIKITUDE_SDK_KEY);
        wikitudeSDK.onCreate(getApplicationContext(), startupConfiguration);

        realidad_aumentada = (Button) findViewById(R.id.realidad_aumentada);
        realidad_aumentada.setOnClickListener(this);


        ayuda = (Button) findViewById(R.id.ayuda);
        ayuda.setOnClickListener(this);

        /*WikitudeSDK wikitudeSDK = new WikitudeSDK((InternalRendering) this);
        NativeStartupConfiguration startupConfiguration = new NativeStartupConfiguration();
        startupConfiguration.setLicenseKey(WikitudeSDKConstants.WIKITUDE_SDK_KEY);
        startupConfiguration.setCameraPosition(CameraSettings.CameraPosition.BACK);
        startupConfiguration.setCameraResolution(CameraSettings.CameraResolution.AUTO);*/

        //wikitudeSDK.onCreate(getApplicationContext(), this, startupConfiguration);

        //final TargetCollectionResource targetCollectionResource = wikitudeSDK.getTrackerManager().createTargetCollectionResource("file:///android_asset/magazine.wtc");
        //wikitudeSDK.getTrackerManager().createImageTracker(targetCollectionResource, (ImageTrackerListener) this, null);
    }

    @Override
    public void onClick(View v) {
        if(v==ayuda){
            Intent i = new Intent(this, ayuda.class);
            startActivity(i);
            Toast.makeText(this,"Ayuda",Toast.LENGTH_LONG).show();
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        }
        if(v==realidad_aumentada){
            Intent i = new Intent(this, wikitude.class);
            startActivity(i);
            Toast.makeText(this,"Wikitude",Toast.LENGTH_LONG).show();
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
    }

    public static class wikitudeSDK{

        public static void onCreate(Context applicationContext, NativeStartupConfiguration startupConfiguration) {

        }
    }
}
