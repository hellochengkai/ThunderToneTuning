package com.thunder.ktv.thundertonetuning.modle.settinglist;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thunder.ktv.thundertonetuning.R;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chengkai on 18-10-15.
 */

public class SettingListFragment extends Fragment {

    private RecyclerView mSettingRecyclerView;
    private SettingAdapter settingAdapter;
    private static List<SettingItem> settingList = new LinkedList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting_list,container,false);
        mSettingRecyclerView = (RecyclerView) view.findViewById(R.id.setting_list_view);
        mSettingRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        initData();
        updateUI();
        return view;
    }

    private void initData()
    {
        settingList.add(new SettingItem("a"));
        settingList.add(new SettingItem("b"));
        settingList.add(new SettingItem("c"));
        settingList.add(new SettingItem("d"));
        settingList.add(new SettingItem("e"));
    }

    private void updateUI()
    {
        settingAdapter = new SettingAdapter(settingList);
        mSettingRecyclerView.setAdapter(settingAdapter);
    }

    private class SettingHolder extends RecyclerView.ViewHolder{

        TextView itemNameTV;
        public SettingHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.list_item,viewGroup,false));
            itemNameTV = itemView.findViewById(R.id.item_name);
        }


        public void onBindData(String title)
        {
            itemNameTV.setText(title);
        }
    }

    private class SettingAdapter extends RecyclerView.Adapter<SettingHolder>{

        private static final String TAG = "SettingAdapter";
        List<SettingItem> list;
        public SettingAdapter(List<SettingItem> list) {
            this.list = list;
        }

        @Override
        public SettingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());

            return new SettingHolder(layoutInflater,parent);
        }

        @Override
        public void onBindViewHolder(SettingHolder holder, int position) {
            holder.onBindData(list.get(position).getName());
            Log.d(TAG, "onBindViewHolder: " + position);
        }

        @Override
        public int getItemCount() {
            Log.d(TAG, "getItemCount: " + list.size());
            return list.size();
        }
    }
}
