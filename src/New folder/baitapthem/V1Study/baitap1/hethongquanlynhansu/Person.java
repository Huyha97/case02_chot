package baitapthem.V1Study.baitap1.hethongquanlynhansu;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private int DateOfBirth;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, int dateOfBirth, String address) {
        this.name = name;
        this.gender = gender;
        DateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void  inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập tên");
        String name = scanner.nextLine();
        System.out.println(" nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println(" nhập ngày sinh");
        int DateofBirth = scanner.nextInt();
        System.out.println(" nhập địa chỉ");
        String address = scanner.nextLine();
        Person person = new Person(name, gender,DateofBirth,address);

    }

}
