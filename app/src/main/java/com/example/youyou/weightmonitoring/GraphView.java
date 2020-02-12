package com.example.youyou.weightmonitoring;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by youyou on 2020/02/12.
 */

public class GraphView extends AppCompatActivity implements View.OnClickListener{

    private Button mRegisterButton;  // 登録ボタン
    private GraphActivity mParentActivy; // 呼び出し元のアクティビティ

    GraphView(Activity activity){
        setView();
        mParentActivy = (GraphActivity)activity;
    }

    private void setView(){
        setContentView(R.layout.activity_graph);

        mRegisterButton = findViewById(R.id.button_Activity_Graph_register);
        mRegisterButton.setOnClickListener(this);
    }

    public void onClick(View view){
        if( view.getId() == R.id.button_Activity_Graph_register ){
            // RegisterView へ遷移する
            mParentActivy.startRegisterAcitivity();
        }
    }

    // TODO
    // グラフ作成する

}
