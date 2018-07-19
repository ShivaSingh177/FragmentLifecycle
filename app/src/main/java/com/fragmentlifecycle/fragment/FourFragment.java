package com.fragmentlifecycle.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fragmentlifecycle.R;

public class FourFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        Log.e("fragLifecycleFirst : ", "onAttach" );
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleFirst : ", "onCreate" );
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleFirst : ", "onCreateView" );
        View view=inflater.inflate(R.layout.frag_four,container,false);



        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleFirst : ", "onActivityCreated" );
        super.onActivityCreated(savedInstanceState);

    }


    @Override
    public void onStart() {
        Log.e("fragLifecycleFirst : ", "onStart" );
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("fragLifecycleFirst : ", "onResume" );
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("fragLifecycleFirst : ", "onPause" );
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("fragLifecycleFirst : ", "onStop" );
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("fragLifecycleFirst : ", "onDestroyView" );
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("fragLifecycleFirst : ", "onDestroy" );
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e("fragLifecycleFirst : ", "onDetach" );
        super.onDetach();
    }

}
