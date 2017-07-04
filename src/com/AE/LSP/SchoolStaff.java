package com.AE.LSP;

/**
 * Created by Angel on 6/7/17.
 */
public class SchoolStaff {
    private String name;

    public SchoolStaff(String name) {
        this.name = name;
    }


    private void makeAnnouncements(){
        System.out.println("make announcements...");
    }

    private void takeAttendence(){
        System.out.println("taking attendance...");
    }

    private void collectPaperWork(){
        System.out.println("collecting paper work...");
    }

    private void conductHallwayDuties(){
        System.out.println("supervising the hallways..");
    }

    public void performOtherResponsibilities(){
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
        performOtherResponsibilities();
    }
}
