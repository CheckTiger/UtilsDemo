package cn.sxh.utilsdemo;

import android.app.Application;

/**
 * @auther snowTiger
 * @mail SnowTigerSong@gmail.com
 * @time 2017/5/4 10:42
 */

public class AppContext extends Application {
    public static AppContext instance;

    public AppContext getInstance(){
        if (instance == null) {
            instance = (AppContext) getApplicationContext();
        } else {
            return instance;
        }
        return instance;
    }
}
