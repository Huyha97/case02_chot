package luyentap_baitap.btvn02;

import java.util.Scanner;

public class StudentManager {
        private Student[] students;
        private static int index =0;

    public StudentManager() {
    }

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Scanner scanner, String name, int age, String gender, String address, double averageScore ){
        Student student = new Student(name,age,gender,address,averageScore);
        students[index] = student;
        index++;
    }

    public void displayAllStudent() {
        System.out.println("All student are: ");
        for (Student student : students) {
            boolean compareNull = student != null;
            if (compareNull) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }

    public void maxScore() {
        double maxScore = students[0].getAverageScore();
        for (Student student : students) {
            boolean compareScore = student.getAverageScore() > maxScore;
            if (compareScore) {
                maxScore = student.getAverageScore();
            }
        }
        System.out.println("Học sinh có điểm cao nhất là: ");
        for (Student student : students) {
            if (student.getAverageScore() == maxScore) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }

    public void minScore() {
        double minScore = students[0].getAverageScore();
        for (Student student : students) {
            boolean compareScore = student.getAverageScore() < minScore;
            if (compareScore) {
                minScore = student.getAverageScore();
            }
        }
        System.out.println("Học sinh có điểm thap nhat là: ");
        for (Student student : students) {
            if (student.getAverageScore() == minScore) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }
}


