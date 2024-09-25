package org.example;

import org.example.classes.Student;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Jaume", 60);
        Student student2 = new Student("Alejandro", 50);
        Student student3 = new Student("Celia", 96);
        Student student4 = new Student("Julia", 35);

        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(student1.getName(), student1);
        studentHashMap.put(student2.getName(), student2);
        studentHashMap.put(student3.getName(), student3);
        studentHashMap.put(student4.getName(), student4);

        studentHashMap.values().forEach(System.out::println);

        System.out.println("Increase grades:");

        increaseGrades(studentHashMap);
        studentHashMap.values().forEach(System.out::println);
    }

    private static void increaseGrades(HashMap<String, Student> studentHashMap) {
        for (Student student : studentHashMap.values()) {
            int newGrade = (int) (student.getGrade() * 1.10);
            student.setGrade(newGrade);
        }
    }
}
