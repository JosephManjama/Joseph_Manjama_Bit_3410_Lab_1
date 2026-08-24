package com.example.joseph_manjama_bit_3410_lab_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.ViewHolder> {

    private List<Notice> noticeList;

    public NoticeAdapter(List<Notice> noticeList) {
        this.noticeList = noticeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notice, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Notice notice = noticeList.get(position);
        holder.tvDate.setText(notice.getDate());
        holder.tvTitle.setText(notice.getTitle());
        holder.tvDescription.setText(notice.getDescription());
    }

    @Override
    public int getItemCount() {
        return noticeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDate, tvTitle, tvDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tvNoticeDate);
            tvTitle = itemView.findViewById(R.id.tvNoticeTitle);
            tvDescription = itemView.findViewById(R.id.tvNoticeDescription);
        }
    }
}