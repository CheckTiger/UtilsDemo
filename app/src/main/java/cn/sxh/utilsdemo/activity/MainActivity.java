package cn.sxh.utilsdemo.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import cn.sxh.utilsdemo.R;
import cn.sxh.utilsdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private ListView mListView;
    protected BaseAdapter mAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initUI() {
        mListView = (ListView) findViewById(R.id.listview);
    }

    @Override
    public void initData() {
        mAdapter = new ArrayAdapter<>(this, R.layout.list_item,
                R.id.tv_item, getResources().getStringArray(R.array.util_list));
        mListView.setAdapter(mAdapter);
        initListeners();
    }

    private void initListeners() {
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                findID_Item(i);
            }
        });
    }


    private void findID_Item(int i) {
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

}
