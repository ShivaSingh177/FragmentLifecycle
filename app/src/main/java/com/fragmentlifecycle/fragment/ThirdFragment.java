package com.fragLifecycleThird.fragment;

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
import com.fragmentlifecycle.fragment.FourFragment;

public class ThirdFragment extends Fragment {

    Button button;
    @Override
    public void onAttach(Context context) {
        Log.e("fragLifecycleThird : ", "onAttach" );
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleThird : ", "onCreate" );
        super.onCreate(savedInstanceState);

    }
    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.framLayout, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleThird : ", "onCreateView" );
        View view= inflater.inflate(R.layout.frag_third,container,false);
        button=(Button)view.findViewById(R.id.buttonClick);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e("fragLifecycleThird : ", "onActivityCreated" );
        super.onActivityCreated(savedInstanceState);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new FourFragment();
                replaceFragment(fragment);
            }
        });
    }

    @Override
    public void onStart() {
        Log.e("fragLifecycleThird : ", "onStart" );
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("fragLifecycleThird : ", "onResume" );
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("fragLifecycleThird : ", "onPause" );
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("fragLifecycleThird : ", "onStop" );
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("fragLifecycleThird : ", "onDestroyView" );
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("fragLifecycleThird : ", "onDestroy" );
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e("fragLifecycleThird : ", "onDetach" );
        super.onDetach();
    }
}
