package com.example.joseph_manjama_bit_3410_lab_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TimetableAdapter extends RecyclerView.Adapter<TimetableAdapter.ViewHolder> {

    private List<ClassSchedule> classList;

    public TimetableAdapter(List<ClassSchedule> classList) {
        this.classList = classList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_class, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ClassSchedule schedule = classList.get(position);
        holder.tvSubject.setText(schedule.getSubject());
        holder.tvTime.setText("Time: " + schedule.getTime());
        holder.tvVenue.setText("Venue: " + schedule.getVenue());
        holder.tvLecturer.setText("Lecturer: " + schedule.getLecturer());
    }

    @Override
    public int getItemCount() {
        return classList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvSubject, tvTime, tvVenue, tvLecturer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSubject = itemView.findViewById(R.id.tvSubject);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvVenue = itemView.findViewById(R.id.tvVenue);
            tvLecturer = itemView.findViewById(R.id.tvLecturer);
        }
    }
}