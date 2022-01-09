package buoi03;

import java.util.Scanner;

public class find_element_in_aray {
    public static void main(String[] args) {
        String[] students = { "A","B","C","D"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a name 's student: ");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length ; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("position of the student " + input_name + " is " + i );
                isExit = true;
                break;
            }
            if (!isExit) {
                System.out.println("not found" + input_name );
            }
        }

    }
}
