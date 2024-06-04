package org.example;

public class Student {
    private String name;
    private String surname;
    private Field field;

    public Student(String name, String surname, Field field) {
        this.name = name;
        this.surname = surname;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", field=" + field +
                '}';
    }
}
