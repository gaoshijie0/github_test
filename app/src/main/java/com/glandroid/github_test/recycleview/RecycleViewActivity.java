package com.glandroid.github_test.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.glandroid.github_test.R;

public class RecycleViewActivity extends AppCompatActivity {
    private  Button mBtnLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mBtnLinear = (Button) findViewById(R.id.bt_rv);
        mBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecycleViewActivity.this,LinearRecycleViewActivity.class);
                startActivity(intent);

            }
        });
    }
    }

