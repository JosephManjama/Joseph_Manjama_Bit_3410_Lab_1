package com.example.joseph_manjama_bit_3410_lab_1;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class TimetableFragment extends Fragment {

    private RecyclerView rvTimetable;
    private TimetableAdapter adapter;
    private List<ClassSchedule> classList;

    public TimetableFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_timetable, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvTimetable = view.findViewById(R.id.rvTimetable);
        rvTimetable.setLayoutManager(new LinearLayoutManager(getContext()));

        classList = new ArrayList<>();
        // Adding sample class schedules
        classList.add(new ClassSchedule("Mobile Application Development", "08:00 AM - 10:00 AM", "Lab 4", "Mr. Joseph"));
        classList.add(new ClassSchedule("Database Management Systems", "10:30 AM - 12:30 PM", "Lecture Hall 2", "Dr. Sarah"));
        classList.add(new ClassSchedule("Network Security", "02:00 PM - 04:00 PM", "Room 305", "Prof. Mike"));
        classList.add(new ClassSchedule("Software Engineering", "04:30 PM - 06:30 PM", "Online", "Ms. Alice"));

        adapter = new TimetableAdapter(classList);
        rvTimetable.setAdapter(adapter);
    }
}