package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Course course = new Course();

    public static void main(String[] args) {
        while (true) {
            createStudent();
        }
    }

    public static void createStudent() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter surname:");
        String surname = scanner.nextLine();
        Field[] fields = Field.values();
        boolean fieldFound = false;

        while (!fieldFound) {
            System.out.println("Enter 0 for Programming, 1 for Design, 2 for SMM:");
            int field = scanner.nextInt();
            for (Field f : fields) {
                if (f.ordinal() == field) {
                    fieldFound = true;
                    Student st = new Student(name, surname, f);
                    course.addStudent(st);
                }
            }
        }
    }
}