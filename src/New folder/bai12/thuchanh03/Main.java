package bai12.thuchanh03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("kien", 30, "HT");
        Student student1 = new Student("nam", 26, "HN");
        Student student2 = new Student("anh", 38, "HT");
        Student student3 = new Student("tu", 38, "HT");


        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());

            AgeComparator ageComparator = new AgeComparator();
            Collections.sort(lists, ageComparator);
            System.out.println("So sanh theo tuoi:");
            for (Student st1 : lists) System.out.println(st1.toString());
        }
    }
}
