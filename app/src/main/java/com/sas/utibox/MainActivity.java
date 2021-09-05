package com.sas.utibox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sas.utibox.Compass.Compass;
import com.sas.utibox.Compass.CompassMySensorEventListener;
import com.sas.utibox.Compass.CompassSettings;

public class MainActivity extends AppCompatActivity {

    Button Compass, Notes, QRCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Compass = (Button)findViewById(R.id.Compass);
        Notes = (Button)findViewById(R.id.Notes);

        Compass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Compass.class);
                startActivity(intent);
            }
        });

        Notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SwiftMainActivity.class);
                startActivity(intent);
            }
        });

    }
}
