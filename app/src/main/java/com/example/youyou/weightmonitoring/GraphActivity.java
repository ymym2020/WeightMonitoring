package com.example.youyou.weightmonitoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GraphActivity extends AppCompatActivity {

    private GraphView mGraphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGraphView = new GraphView(this);
    }

    public void startRegisterAcitivity() {
        Intent intent = new Intent(this, DataRegisterActivity.class);
        startActivity(intent);
    }
}
