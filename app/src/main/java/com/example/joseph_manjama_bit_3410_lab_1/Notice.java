package com.example.joseph_manjama_bit_3410_lab_1;

public class Notice {
    private String title;
    private String description;
    private String date;

    public Notice(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getDate() { return date; }
}