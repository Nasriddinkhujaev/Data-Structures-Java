
package linkedlist_app_demo;

import java.util.LinkedList;
import java.util.List;

public class ManageStudents {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Joe", "Biden", 85);
        Student s2 = new Student(222, "Steve", "Jobs", 80);
        Student s3 = new Student(333, "Taylor", "Swift", 90);

        List<Student> students2168 = new LinkedList<>();             
        students2168.add(s1);
        students2168.add(s2);
        students2168.add(s3);
        System.out.println(students2168);

        System.out.println("\nStudents in linked list students2168: ");        
        for (int i = 0; i < students2168.size(); i++) {
            Student currentStudent = students2168.get(i);
            System.out.println((i+1) + ", " + currentStudent); 
        }
        System.out.println();

        System.out.print("Steve's grade: ");

        for (Student s : students2168) {
            if (s.getFirstName().equals("Steve")) {
                System.out.println(s.getGrade());
                System.out.println();
                break;
            }
        }

        students2168.remove(s2);
        System.out.println("after removing s2: ");
        System.out.println(students2168);

        System.out.println("\nLocation of s3, s2: ");
        System.out.println(students2168.indexOf(s3));
        System.out.println(students2168.indexOf(s2));
    }
    
    //method to return the grade of a given student in a given list by name 
    //System.out.println(getGrade(students2168, "Steve"));    
    
    //method to print a list of Student objects
    public static double  getGrade(List<Student> mySection, String firstName) {
        for (Student s : mySection) {
            if (s.getFirstName().equals(firstName)) {
                System.out.println(s.getGrade());
                System.out.println();
                break;
            }
        }
        return -1.0;
    }
    
}