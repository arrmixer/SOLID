package com.AE.LSP;

/**
 * Created by Angel on 6/7/17.
 */
public class EnglishTeacher extends SchoolStaff implements CourseInstructor{
    public EnglishTeacher(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println("Teaching English..");
    }
}
