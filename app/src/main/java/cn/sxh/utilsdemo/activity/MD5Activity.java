package cn.sxh.utilsdemo.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.socks.library.KLog;

import cn.sxh.utilsdemo.R;
import cn.sxh.utilsdemo.base.BaseActivity;
import cn.sxh.utilsdemo.utils.MD5Util;

public class MD5Activity extends BaseActivity {

    private static final String TAG = MD5Activity.class.getSimpleName();
    private TextView mTextView;
    private EditText mEditText;
    private String beforeMd5;
    private String afterMd5;
    @Override
    public int getLayoutId() {
        return R.layout.activity_md5;
    }

    @Override
    public void initUI() {
        mTextView = (TextView) findViewById(R.id.md5_text);
        mEditText = (EditText) findViewById(R.id.md5_edit);
        initListeners();
    }

    @Override
    public void initData() {
        KLog.e(TAG,"加密之前的字符串为---->>>>>>"+afterMd5);
        if (afterMd5 == null) {
            KLog.e(TAG, "加密字符串失败---->>>>>>");
        } else {
            mTextView.setText(afterMd5);
        }
    }

    private void initListeners() {
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                beforeMd5 = mEditText.getText().toString().trim();
                KLog.e(TAG,"加密之前的字符串为---->>>>>>"+beforeMd5);
                afterMd5 = MD5Util.GetMD5Code(beforeMd5,true);
                KLog.e(TAG,"加密之前的字符串为---->>>>>>"+afterMd5);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                mTextView.setText(afterMd5);
            }
        });
    }
}
