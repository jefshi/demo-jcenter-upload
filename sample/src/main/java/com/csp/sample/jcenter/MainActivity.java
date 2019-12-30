package com.csp.sample.jcenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.csp.jcenter.LogCat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogCat.e("测试");
    }
}
