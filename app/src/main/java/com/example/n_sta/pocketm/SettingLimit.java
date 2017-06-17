package com.example.n_sta.pocketm;

import android.app.ActivityGroup;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;

import org.w3c.dom.Text;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by n-sta on 2017-06-13.
 */


public class SettingLimit extends ActivityGroup
{

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limit_setting);

        Button btnPercent = (Button) findViewById(R.id.btnPercent);
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DividePercent.class);
                startActivity(intent);
            }


        });



        setTitle("한도 계산");
        tabHost = (TabHost)findViewById(R.id.tabhost1);
        tabHost.setup(getLocalActivityManager());
        TabHost.TabSpec tab1 = tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("자동 한도 계산");
        tabHost.addTab(tab1);//1번탭 생성
        TabHost.TabSpec tab2 = tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("수동 한도 계산");
        tabHost.addTab(tab2);//2번탭 생성

    }


};




