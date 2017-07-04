package com.AE.lesson_5;

/**
 * Created by Angel on 5/29/17.
 */
public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManangement ERDirector = new HospitalManangement();
        Employee peggy = new Nurse(1, "Peggy", "emergency", true);

        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        ERDirector.callUpon(suzan);

    }

}
