package luyentap_baitap.btvn02;

import java.util.Scanner;

public class Mainstudent {
    public static void main(String[] args) {
            int choice = -1;
            Scanner scanner = new Scanner(System.in);
            while (choice!=0) {
            System.out.println("Menu");
            System.out.println(" 1: To insert student");
            System.out.println(" 2: To show the student list ");
            System.out.println(" 2: To show the student who has the heightest score");
            System.out.println(" 3: To show the student who has the lowest score");
            System.out.println(" 4: To insert one student in to list");
            System.out.println(" 5: To delete one student");
            System.out.println(" 6: To find student by name");
            System.out.println(" 7: To show the student by gender");
            System.out.println(" 8: To sort student by score");
            System.out.println(" 0: Exit");
            choice = scanner.nextInt();
            System.out.println(" input the number of student: ");
            int size = scanner.nextInt();
            Student[] students = new Student[size];
            StudentManager studentManager = new StudentManager(students);
            switch (choice) {
                case 1:
                    addStudentList(scanner, students, studentManager);
                    break;
                case 2:
                    addStudentList(scanner, students, studentManager);
                    studentManager.displayAllStudent();
                    break;
                case 3:
                    addStudentList(scanner, students, studentManager);
                    studentManager.displayAllStudent();
                    studentManager.maxScore();
            }


            }



            }

    private static void addStudentList(Scanner scanner, Student[] students, StudentManager studentManager) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("student " + (i + 1) + ":");
            System.out.print(" name: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.print(" age:");
            int age = scanner.nextInt();
            System.out.print(" gender: ");
            scanner.nextLine();
            String gender = scanner.nextLine();
            System.out.print(" address: ");
            String address = scanner.nextLine();
            System.out.print(" averageScore: ");
            double averageScore = scanner.nextDouble();
            studentManager.addStudent(scanner, name, age, gender, address, averageScore);
        }
    }
}


