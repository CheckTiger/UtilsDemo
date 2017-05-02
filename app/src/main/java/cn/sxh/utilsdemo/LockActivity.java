package cn.sxh.utilsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = new NinePointLineView(LockActivity.this);
        setContentView(v);
//        setContentView(R.layout.activity_lock);
    }
}
