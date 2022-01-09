package baitapthem.menu.phanmemquanlisv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
   static ArrayList<Sinhvien> arr = new ArrayList<>();
   public static void Addstudent(){
       Scanner scanner = new Scanner(System.in);
       System.out.println(" nhap id");
       int id = scanner.nextInt();
       System.out.println("nhap ten sinh vien");
       scanner.nextLine();
       String name = scanner.nextLine();
       System.out.println("nhap tuoi");
       int age = scanner.nextInt();
       System.out.println("nhap dia chi");
       scanner.nextLine();
       String address = scanner.nextLine();
       System.out.println(" nhap diem trung binh");
       double gpa = scanner.nextDouble();
       Sinhvien sv = new Sinhvien(id,name,age,address,gpa);
       arr.add(sv);
   }
   public static void EditStudent(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("nhap id sinh vien can sua: ");
       int id = scanner.nextInt();
       boolean timThay = false;

       for (int i = 0; i <= arr.size(); i++) {
        if (id == arr.get(id).getId()){
            System.out.println("nhap ten moi muon sua");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println(" nhap tuoi sv");
            int age = scanner.nextInt();
            System.out.println(" nhap dia chi");
            String address= scanner.nextLine();
            System.out.println(" nhap diem trung binh");
            double gpa = scanner.nextDouble();
            Sinhvien sv = new Sinhvien(id,name,age,address,gpa);
            arr.get(i).setName(name);
            arr.get(i).setAge(age);
            arr.get(i).setAddress(address);
            arr.get(i).setGpa(gpa);
            timThay = false;
            break;
        }
       }
        if (timThay == true) System.out.println("khong tim thay sinh vien nao");
   }

   public static void DeleteStudent(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("nhap id sinh vien can xoa");
       int id = scanner.nextInt();

       int d = -1;
       boolean timThay = false;
       for (int i = 0; i < arr.size(); i++) {
           if (id == arr.get(i).getId()){
               timThay = true;
               d = i;
               break;
           }
       }
        if (timThay == false) System.out.println(" khong tim thay sinh vien nao");
        else {
            arr.remove(d);
        }
   }
    public static void SortGPA() {
       arr.sort(Comparator.comparing(Sinhvien::getGpa));
    }

    public static void  SortName(){
       arr.sort(Comparator.comparing(Sinhvien::getName));
    }

    public static void Show(){
        for (Sinhvien a: arr) {
            System.out.println(a.toString());
        }
    }

    public static void  Exit (){
        System.out.println("Goodbye!!!");
        System.out.println(0);
    }

    public static void Menu(){
        System.out.println("***Menu***");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student by Id");
        System.out.println("3. Delete Student by Id");
        System.out.println("4. Sort Student by GPA");
        System.out.println("5. Sort Student by Name");
        System.out.println("6. Show");
        System.out.println("0. Exit");
        int d;
        System.out.println(" nhập lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextInt();

        switch(d){
            case 1: Addstudent();
            break;
            case 2: EditStudent();
            break;
            case 3: DeleteStudent();
            break;
            case 4: SortGPA();
            break;
            case 5: SortName();
            break;
            case 6: Show();
            break;
            case 0:Exit();
            break;

        }
    }
    public static void main(String[] args) {
    while (true) {
        Menu();
    }
    }
}
