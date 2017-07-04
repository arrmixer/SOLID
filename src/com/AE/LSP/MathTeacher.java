package com.AE.LSP;

/**
 * Created by Angel on 6/7/17.
 */
public class MathTeacher extends SchoolStaff implements CourseInstructor{
    public MathTeacher(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println("Teaching Math....");
    }




}
