package org.techtown.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class CallingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);

        Button btnFamily = findViewById(R.id.btnFamily);
        Button btnRelative = findViewById(R.id.btnRelative);
        Button btnFriend = findViewById(R.id.btnFriend);
        Button btnHospital = findViewById(R.id.btnHospital);
        Button btnRestaurant = findViewById(R.id.btnRestaurant);
        Button btnAgency = findViewById(R.id.btnAgency);

        btnFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CallingFActivity.class);
                startActivity(intent);
            }
        });



    }
}
