package com.example.joseph_manjama_bit_3410_lab_1;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG,"onCreateView called");
        return inflater.inflate(R.layout.homefragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnTimetable = view.findViewById(R.id.btnGoToTimetable);
        Button btnNotices = view.findViewById(R.id.btnGoToNotices);

        BottomNavigationView navView = getActivity().findViewById(R.id.bottomNav);

        btnTimetable.setOnClickListener(v -> {
            if (navView != null) {
                navView.setSelectedItemId(R.id.timetableFragment);
            }
        });

        btnNotices.setOnClickListener(v -> {
            if (navView != null) {
                navView.setSelectedItemId(R.id.noticesFragment);
            }
        });
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"onResume called");
    }
    @Override
    public void onPause(){
        super. onPause();
        Log.d(TAG, "onPause called");
    }
    @Override
    public void onDestroyView(){
        super. onDestroyView();
        Log.d(TAG, "onDestroyView called");
    }
}