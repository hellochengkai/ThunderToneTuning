package com.thunder.ktv.thundertonetuning.modle.musicsetting;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thunder.ktv.thundertonetuning.R;

/**
 * Created by chengkai on 18-10-15.
 */

public class MusicFragment extends Fragment {
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music,container,false);
        textView = view.findViewById(R.id.music_title);
//        textView.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        return view;
    }
}
