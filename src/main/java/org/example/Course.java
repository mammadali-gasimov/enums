package org.example;

import java.util.Arrays;

public class Course {
    public String name;
    public Student[] students = new Student[5];
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i] = student;
                return;
            }
        }

        Student[] newList = new Student[students.length * 2];
        for (int i = 0; i < students.length; i++) {
            newList[i] = students[i];
        }
        newList[students.length] = student;
        students = newList;
        Arrays.toString(students);
        newList = null;
    }
}
