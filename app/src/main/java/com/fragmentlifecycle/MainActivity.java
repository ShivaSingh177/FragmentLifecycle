package com.fragmentlifecycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragLifecycleFirst.fragment.FirstFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("ActivityLifecycle : ", "onCreate" );

        getSupportFragmentManager().beginTransaction().add(R.id.framLayout,new FirstFragment()).commit();
    }

    @Override
    public void onStart() {
        Log.e("ActivityLifecycle : ", "onStart" );
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("ActivityLifecycle : ", "onResume" );
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("ActivityLifecycle : ", "onPause" );
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("ActivityLifecycle : ", "onStop" );
        super.onStop();
    }

   
    @Override
    public void onDestroy() {
        Log.e("ActivityLifecycle : ", "onDestroy" );
        super.onDestroy();
    }

}
