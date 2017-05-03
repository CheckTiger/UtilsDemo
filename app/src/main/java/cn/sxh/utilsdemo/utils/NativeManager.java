package cn.sxh.utilsdemo.utils;

/**
 * @auther snowTiger
 * @mail SnowTigerSong@gmail.com
 * @time 2017/5/3 09:03
 */

public class NativeManager {
    private static NativeManager instance;
    public static NativeManager getInstance(){
        if (instance == null) {
            instance = new NativeManager();
            return instance;
        } else {
            return instance;
        }
    }
}
