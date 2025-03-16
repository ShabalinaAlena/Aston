package org.example;

import java.util.*;

import static java.util.Arrays.*;

class Main {
    public static void main(String[] args) {
        // Задание 1: Студенты и их оценки
        System.out.println("=== Задание 1: Студенты и их оценки ===");

        Set<Student> students = new HashSet<>(asList(
                new Student("Нюра Васечкина", "Группа 1", 1, asList(4, 5, 3, 4)),
                new Student("Люся Иванова", "Группа 2", 2, asList(2, 3, 2, 2)),
                new Student("Толик Пузиков", "Группа 1", 1, Arrays.asList(5, 5, 5, 5)),
                new Student("Еня Колотушкина", "Группа 3", 3, asList(3, 4, 3, 4))
        ));

        System.out.println("\nСтуденты до обработки:");
        students.forEach(System.out::println);

        removeUnderperformingStudents(students);

        promoteStudents(students);

        System.out.println("\nСтуденты после обработки:");
        students.forEach(System.out::println);

        System.out.println("\nСтуденты на 1 курсе:");
        printStudents(students, 1);

        // Задание 2: Телефонный справочник
        System.out.println("\n=== Задание 2: Телефонный справочник ===");

        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Колотушкина", "123-456");
        phoneDirectory.add("Носиков", "789-012");
        phoneDirectory.add("Колотушкина", "345-678");
        phoneDirectory.add("Пузиков", "901-234");
        phoneDirectory.add("Колотушкина", "567-890");

        System.out.println("\nТелефонный справочник:");
        phoneDirectory.printAll();

        System.out.println("\nНомера для фамилии Колотушкина:");
        List<String> kolotushkinaNumbers = phoneDirectory.get("Колотушкина");
        kolotushkinaNumbers.forEach(System.out::println);

        System.out.println("\nНомера для фамилии Носиков:");
        List<String> nosikovNumbers = phoneDirectory.get("Носиков");
        nosikovNumbers.forEach(System.out::println);

        System.out.println("\nНомера для фамилии Пузиков:");
        List<String> puzikovNumbers = phoneDirectory.get("Пузиков");
        puzikovNumbers.forEach(System.out::println);

    }

    public static void removeUnderperformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    public static void promoteStudents(Set<Student> students) {
        students.forEach(Student::promoteToNextCourse);
    }

    public static void printStudents(Set<Student> students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(student -> System.out.println(student.getName()));
    }
}