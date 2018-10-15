package com.thunder.ktv.thundertonetuning.modle.musicsetting;

import android.support.v4.app.Fragment;

import com.thunder.ktv.thundertonetuning.util.SingleFragmentActivity;

public class MusicSettingActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new MusicFragment();
    }
}
