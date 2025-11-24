package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        // Creating Students
        Student s1 = new Student("Abul Kalam", "abul@gmail.com", "Computer Science", 60);
        Student s2 = new Student("Abdul Jabbar", "jabbar@gmail.com", "History", 30);

        // Creating Faculty
        Faculty f1 = new Faculty("Sohel Khan", "sohel@gmail.com", "Math", 75000);

        // Add to list
        people.add(s1);
        people.add(s2);
        people.add(f1);

        // Iterate through list
        for (Person p : people) {
            System.out.println("ID: " + p.getID());
            System.out.println("Name: " + p.getName());

            if (p instanceof Student) {
                System.out.println(((Student) p).toString());
            }
            else if (p instanceof Faculty) {
                ((Faculty) p).assignCourse("Object-Oriented Design");
            }

            System.out.println("----------------------------------");
        }
    }
}
