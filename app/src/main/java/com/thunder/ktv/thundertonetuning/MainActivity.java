package com.thunder.ktv.thundertonetuning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();

        Fragment musicFragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if(musicFragment == null){
            fragmentManager.beginTransaction().add(R.id.fragment_container,new MusicFragment()).commit();
        }
    }
}
