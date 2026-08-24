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

public class NoticeFragment extends Fragment {

    private RecyclerView rvNotices;
    private NoticeAdapter adapter;
    private List<Notice> noticeList;

    public NoticeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notice, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvNotices = view.findViewById(R.id.rvNotices);
        rvNotices.setLayoutManager(new LinearLayoutManager(getContext()));

        noticeList = new ArrayList<>();
        
        // Registration Process Notices for Kwame Nkrumah University
        noticeList.add(new Notice(
            "Admission Verification",
            "Report to the Admissions Office with your original Letter of Offer, NRC, and Grade 12 Results for verification.",
            "Monday"
        ));
        
        noticeList.add(new Notice(
            "Tuition & Fee Payment",
            "Proceed to the Finance Office or designated bank to pay your tuition and registration fees. Ensure you keep your official receipt.",
            "Tuesday"
        ));
        
        noticeList.add(new Notice(
            "Departmental Course Registration",
            "Visit your Head of Department (HOD) for course selection approval and academic guidance for the semester.",
            "Wednesday"
        ));
        
        noticeList.add(new Notice(
            "ICT & Portal Account Setup",
            "Visit the ICT center to create your student portal account and set up your university email address.",
            "Thursday"
        ));
        
        noticeList.add(new Notice(
            "Student ID Card & Final Clearance",
            "Have your biometric data captured for your student ID card and obtain final clearance from the Registrar's office.",
            "Friday"
        ));

        adapter = new NoticeAdapter(noticeList);
        rvNotices.setAdapter(adapter);
    }
}