package cn.sxh.utilsdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zhy.autolayout.AutoLayoutActivity;

/**
 * @auther snowTiger
 * @mail SnowTigerSong@gmail.com
 * @time 2017/5/2 14:57
 */

public abstract class BaseActivity extends AutoLayoutActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initUI();
        initData();
    }

    /**
     * 加载布局资源
     * @return
     */
    public abstract int getLayoutId() ;

    /**
     * 初始化UI控件
     */
    public abstract void initUI();

    /**
     * 初始化数据资源
     */
    public abstract void initData();
}
