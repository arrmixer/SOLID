package com.AE.LSP;

/**
 * Created by Angel on 6/7/17.
 */
public class ScienceTeacher extends SchoolStaff implements CourseInstructor{
    public ScienceTeacher(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println("Teaching Science...");
    }
}
