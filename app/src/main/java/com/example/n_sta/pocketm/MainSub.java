package com.example.n_sta.pocketm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by n-sta on 2017-06-13.
 */

public class MainSub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_main);

        Button limit = (Button) findViewById(R.id.limit);
        limit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingLimit.class);
                startActivity(intent);
            }
        });

        Button btnSetting = (Button) findViewById(R.id.btnSetting);
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), setting.class);
                startActivity(intent);
            }
        });

        Button btnEmergencyFund = (Button) findViewById(R.id.btnEmergencyFund);
        btnEmergencyFund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FundEmergency.class);
                startActivity(intent);
            }
        });
    }
}