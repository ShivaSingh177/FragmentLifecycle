package com.fragLifecycleSec.fragment;

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

import com.fragLifecycleThird.fragment.ThirdFragment;
import com.fragmentlifecycle.R;

public class SecondFragment extends Fragment {

    Button button;
    @Override
    public void onAttach(Context context) {
        Log.e("fragLifecycleSec : ", "onAttach" );
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleSec : ", "onCreate" );
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleSec : ", "onCreateView" );
        View view =inflater.inflate(R.layout.frag_sec,container,false);
        button=(Button )view.findViewById(R.id.buttonClick);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleSec : ", "onActivityCreated" );
        super.onActivityCreated(savedInstanceState);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new ThirdFragment();
                replacementFragment(fragment);
            }
        });
    }

    public void replacementFragment(Fragment someFrag){
        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framLayout,someFrag);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onStart() {
        Log.e("fragLifecycleSec : ", "onStart" );
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("fragLifecycleSec : ", "onResume" );
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("fragLifecycleSec : ", "onPause" );
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("fragLifecycleSec : ", "onStop" );
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("fragLifecycleSec : ", "onDestroyView" );
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("fragLifecycleSec : ", "onDestroy" );
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e("fragLifecycleSec : ", "onDetach" );
        super.onDetach();
    }
}
