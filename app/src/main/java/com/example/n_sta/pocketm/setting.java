package com.example.n_sta.pocketm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by n-sta on 2017-06-13.
 */

public class setting extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);


        Button btnBulletin = (Button) findViewById(R.id.btnBulletin);
        btnBulletin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BoardBulletin.class);
                startActivity(intent);
            }
        });
    }
}