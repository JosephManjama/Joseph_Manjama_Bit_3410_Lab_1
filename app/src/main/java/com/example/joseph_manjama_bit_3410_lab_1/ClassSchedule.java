package com.example.joseph_manjama_bit_3410_lab_1;

public class ClassSchedule {
    private String subject;
    private String time;
    private String venue;
    private String lecturer;

    public ClassSchedule(String subject, String time, String venue, String lecturer) {
        this.subject = subject;
        this.time = time;
        this.venue = venue;
        this.lecturer = lecturer;
    }

    public String getSubject() { return subject; }
    public String getTime() { return time; }
    public String getVenue() { return venue; }
    public String getLecturer() { return lecturer; }
}