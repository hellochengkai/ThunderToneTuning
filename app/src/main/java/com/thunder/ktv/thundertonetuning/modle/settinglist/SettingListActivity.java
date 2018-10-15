package com.thunder.ktv.thundertonetuning.modle.settinglist;

import android.support.v4.app.Fragment;

import com.thunder.ktv.thundertonetuning.util.SingleFragmentActivity;

/**
 * Created by chengkai on 18-10-15.
 */

public class SettingListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new SettingListFragment();
    }
}
