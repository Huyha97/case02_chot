package controller;

import io.ReadAndWriteStaff;
import model.Staff;
import model.StaffFullTime;
import model.StaffPartTime;
import view.ViewStaff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ControllerStaff implements Manager {
    Scanner scanner = new Scanner(System.in);
    private List<Staff> staffList;

    public ControllerStaff() {
        staffList = ReadAndWriteStaff.readStaff();
    }

    public void add(Staff staff) {
        staffList.add(staff);
        ReadAndWriteStaff.writeStaff(staffList);
    }

    public void edit(int index, Staff staff) {
        staffList.set(index, staff);
        ReadAndWriteStaff.writeStaff(staffList);
    }

    public List<Staff> findAll() {
        return staffList;
    }

    public int findIndex() {
        String name = scanner.nextLine();
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void displayStaff() {
        if (staffList.isEmpty()) {
            System.err.println("EMPTY!!!");
        }
        System.out.format("%-7s %-10s %-10s %-10s %-10s %-10s %-15s %-20s %-40s %-10s\n",
                "ID", "Name", "Age", "Address", "Code","Department", "Status", "type of job", "total workring time", "wage/hours");
        staffList = ReadAndWriteStaff.readStaff();
        assert staffList != null;
        for (Staff staff : staffList) {
            String[] line = staff.toString().split(",");
            System.out.format("%-7s %-10s %-10s %-10s %-10s %-10s %-15s %-20s %-40s %-10s\n",
                    line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7], line[8],line[9]);
        }
    }


    @Override
    public void searchStaff() {
        System.out.println("who do you want to search??? ");
        String name = scanner.next();
        System.out.println("input department");
        String dept = scanner.next();
        int index = -1;
        boolean check = false;
        for (int i = 0; i < staffList.size(); i++) {
            if (name.contains(staffList.get(i).getName())  && dept.contains(staffList.get(i).getDepartment())) {
                check = true;
                index = staffList.indexOf(staffList.get(i));
            }
        }
        if (check) {
            System.out.format("%-7s %-10s %-10s %-10s %-10s %-15s %-15s %-20s %-40s %-10s\n",
                    "ID", "Name", "Age", "Address", " Code","Department", "Status", "type of job", "total workring time", "wage/hours");
            staffList = ReadAndWriteStaff.readStaff();
            assert staffList != null;
            String[] line = staffList.get(index).toString().split(",");
            System.out.format("%-7s %-10s %-10s %-10s %-10s %-15s %-15s %-20s %-40s %-10s\n",
                    line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7], line[8],line[9]);
            System.out.println("");
        } else {
            System.err.println("===============================");
            System.err.println("| this staff does not exit!!!  |");
            System.err.println("===============================");
            searchStaff();
        }
    }

    @Override
    public void checkStatusbyName() {
        System.out.println("whose do you want to check the working status???");
        String name = scanner.nextLine();
        for (Staff staff : staffList) {
            if (staff.getName().equals(name)) {
                if (staff.isStatus()) {
                    System.out.println("Staff " + "'" + name + "'" + " is working");
                } else {
                    System.out.println("Staff " + "'" + name + "'" + " has retired ");
                }
                System.out.println("");
            }
        }
    }

    @Override
    public void checkStatus() {
        System.out.println(" you want check whatt kind of staff???");
        System.out.println("1.Staff who are working");
        System.out.println("2.Staff who has retired");
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice != 1 && choice != 2) {
                System.err.println("only type 1 or 2!!!");
                checkStatus();
            }
        } catch (Exception e) {
            System.err.println("=================");
            System.err.println("|  TRY AGAIN!!!  |");
            System.err.println("=================");
        }
        switch (choice) {
            case 1:
                for (Staff s : staffList) {
                    if (s.isStatus()) {
                        System.out.println(s.toString());
                    }
                }
                break;
            case 2:
                for (Staff s : staffList) {
                    if (!s.isStatus()) {
                        System.out.println(s.toString());
                    }
                }
                break;
        }
    }


    @Override
    public void updateStatus() {
        System.out.println("whose do you want to change the working status???");
        String name = scanner.nextLine();
        int index = -1;
        boolean check = false;
        for (int i = 0; i < staffList.size(); i++) {
            if (name.contains(staffList.get(i).getName()) ) {
                check = true;
                index = staffList.indexOf(staffList.get(i));
            }
        }
        if (check) {
            if (staffList.get(index).isStatus()) {
                staffList.get(index).setStatus(false);
            } else {
                staffList.get(index).setStatus(true);
            }
            System.out.format("%-7s %-10s %-10s %-10s %-10s %-15s %-15s %-20s %-40s %-10s\n",
                    "ID", "Name", "Age", "Address", " Code","Department", "Status", "type of job", "total workring time", "wage/hours");
            String[] line = staffList.get(index).toString().split(",");
            System.out.format("%-7s %-10s %-10s %-10s %-10s %-15s %-15s %-20s %-40s %-10s\n",
                    line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7], line[8],line[9]);
            System.out.println("");
            ReadAndWriteStaff.writeStaff(staffList);
        } else {
            System.err.println("===============================");
            System.err.println("| this staff does not exit!!!  |");
            System.err.println("===============================");
        }
    }

    @Override
    public Staff addStaff(boolean isStaffFullTime) {
        int id;
        if (staffList.size() == 0) {
            id = 1;
        } else {
            id = staffList.get(staffList.size() - 1).getId() + 1;
        }

        String name;
        while (true) {
            System.out.println("Input name: ");
            name = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-z ]*$");
            if (pattern.matcher(name).find()) {
                break;
            } else {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }

        int age = 0;
        boolean check = true;
        while (check) {
            try {
                System.out.println("input age :");
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 18 && age <= 60) {
                    check = false;
                } else if (age < 18) {
                    System.err.println("you are to young, try again NOW!!!>");
                } else {
                    System.err.println("you are too old");
                }
            } catch (Exception e) {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }

        String address;
        while (true) {
            System.out.println("input address:");
            address = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-z ]*$");
            if (pattern.matcher(address).find()) {
                break;
            } else {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }

        String code;
        while (true) {
            System.out.println("Input code: ");
            code = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-z ]*$");
            if (pattern.matcher(code).find()) {
                break;
            } else {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }

        String dept;
        while (true) {
            System.out.println(" input department: ");
            dept = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-z ]*$");
            if (pattern.matcher(dept).find()) {
                break;
            } else {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }


        int workTimeOnMonth = 0;
        boolean checkWorkingOnMonth = true;
        if (isStaffFullTime) {
            while (checkWorkingOnMonth) {
                try {
                    System.out.println("how many hours working fulltime/month:");
                    workTimeOnMonth = Integer.parseInt(scanner.nextLine());
                    if (workTimeOnMonth >= 176 && workTimeOnMonth <= 208) {
                        checkWorkingOnMonth = false;
                    } else if (workTimeOnMonth < 176) {
                        System.err.println("min is 176h: ");
                    } else {
                        System.err.println("working over 208hours can damage your heath!!!");
                    }
                } catch (Exception e) {
                    System.err.println("=================");
                    System.err.println("|  TRY AGAIN!!!  |");
                    System.err.println("=================");
                }
            }



            int salaryOnHour = 0;
            boolean checkSalaryOnHour = true;
            while (checkSalaryOnHour) {
                try {
                    System.out.println("input salary/hour:");
                    salaryOnHour = Integer.parseInt(scanner.nextLine());
                    if (salaryOnHour >= 40000) {
                        checkSalaryOnHour = false;
                    } else {
                        System.err.println("the salary min is 40000vnd");
                    }
                } catch (Exception e) {
                    System.err.println("==============");
                    System.err.println("| Invalid!!!  |");
                    System.err.println("==============");
                }
            }

            System.out.println("ADDED!!!");
            System.out.println("");
            return new StaffFullTime(id, name, age, address, code, dept, true, true, workTimeOnMonth, salaryOnHour);
        } else {
            while (checkWorkingOnMonth) {
                try {
                    System.out.println("how many hours working parttime/month:");
                    workTimeOnMonth = Integer.parseInt(scanner.nextLine());
                    if (workTimeOnMonth >= 88 && workTimeOnMonth <= 104) {
                        checkWorkingOnMonth = false;
                    } else if (workTimeOnMonth < 88) {
                        System.err.println("partime min : 88h");
                    } else {
                        System.err.println("if do a partime job over 104h, you should transfer to fulltime job!!!");
                    }
                } catch (Exception e) {
                    System.err.println("==============");
                    System.err.println("| Invalid!!!  |");
                    System.err.println("==============");
                }
            }

            int salaryOnHour = 0;
            boolean checkSalaryOnHour = true;
            while (checkSalaryOnHour) {
                try {
                    System.out.println("salary part time/hour:");
                    salaryOnHour = Integer.parseInt(scanner.nextLine());
                    if (salaryOnHour >= 30000) {
                        checkSalaryOnHour = false;
                    } else {
                        System.err.println("the salary min is 30.000vnd");
                    }
                } catch (Exception e) {
                    System.err.println("==============");
                    System.err.println("| Invalid!!!  |");
                    System.err.println("==============");
                }
            }

            System.out.println("ADDED!!!");
            System.out.println("");
            return new StaffPartTime(id, name, age, address, code, dept, true, false, workTimeOnMonth, salaryOnHour);
        }
    }

    @Override
    public Staff updateStaff(boolean isStaffFullTime, int index) {
        int id;
        id = staffList.get(index).getId();

        String name;
        while (true) {
            System.out.println("input new name:");
            name = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[#.0-9a-zA-Z\\s,-]+$");
            if (pattern.matcher(name).find()) {
                break;
            } else {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }

        int age = 0;
        boolean check = true;
        while (check) {
            try {
                System.out.println("Input new age:");
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 18 && age <= 60) {
                    check = false;
                } else if (age < 18) {
                    System.err.println("you are to young, try again NOW!!!>");
                } else {
                    System.err.println("you are too old");
                }
            } catch (Exception e) {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }

        String address;
        while (true) {
            System.out.println("input new address:");
            address = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[#.0-9a-zA-Z\\s,-]+$");
            if (pattern.matcher(address).find()) {
                break;
            } else {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }
        String code;
        while (true) {
            System.out.println("Input code: ");
            code = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-z ]*$");
            if (pattern.matcher(code).find()) {
                break;
            } else {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }

        String dept;
        while (true) {
            System.out.println(" input department: ");
            dept = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-z ]*$");
            if (pattern.matcher(dept).find()) {
                break;
            } else {
                System.err.println("==============");
                System.err.println("| Invalid!!!  |");
                System.err.println("==============");
            }
        }

        int workTimeOnMonth = 0;
        boolean checkWorkingOnMonth = true;
        if (isStaffFullTime) {
            while (checkWorkingOnMonth) {
                try {
                    System.out.println("Enter the number of working hours in the month full time:");
                    workTimeOnMonth = Integer.parseInt(scanner.nextLine());
                    if (workTimeOnMonth >= 176 && workTimeOnMonth <= 200) {
                        checkWorkingOnMonth = false;
                    } else if (workTimeOnMonth < 176) {
                        System.err.println("Working fulltime min is 176h");
                    } else {
                        System.err.println("working over 200h can demage your heath!!!");
                    }
                } catch (Exception e) {
                    System.err.println("==============");
                    System.err.println("| Invalid!!!  |");
                    System.err.println("==============");
                }
            }

            int salaryOnHour = 0;
            boolean checkSalaryOnHour = true;
            while (checkSalaryOnHour) {
                try {
                    System.out.println("input salary/hour:");
                    salaryOnHour = Integer.parseInt(scanner.nextLine());
                    if (salaryOnHour >= 40000) {
                        checkSalaryOnHour = false;
                    } else {
                        System.err.println("the salary min is 40000vnd");
                    }
                } catch (Exception e) {
                    System.err.println("==============");
                    System.err.println("| Invalid!!!  |");
                    System.err.println("==============");
                }
            }


            System.out.println("CHANGED!!!");
            System.out.println("");
            return new StaffFullTime(id, name, age, address, code, dept, true, true, workTimeOnMonth, salaryOnHour);
        } else {
            while (checkWorkingOnMonth) {
                try {
                    System.out.println("Enter the number of working hours in the month part time:");
                    workTimeOnMonth = Integer.parseInt(scanner.nextLine());
                    if (workTimeOnMonth >= 90 && workTimeOnMonth <= 110) {
                        checkWorkingOnMonth = false;
                    } else if (workTimeOnMonth < 90) {
                        System.err.println("Minimum part time is 90 hours/month and maximum is 110 hours");
                    } else {
                        System.err.println("you work to muchhh");
                    }
                } catch (Exception e) {
                    System.err.println("==============");
                    System.err.println("| Invalid!!!  |");
                    System.err.println("==============");
                }
            }

            int salaryOnHour = 0;
            boolean checkSalaryOnHour = true;
            while (checkSalaryOnHour) {
                try {
                    System.out.println("Enter hourly part-time salary:");
                    salaryOnHour = Integer.parseInt(scanner.nextLine());
                    if (salaryOnHour >= 30000) {
                        checkSalaryOnHour = false;
                    } else {
                        System.err.println("Minimum part-time salary is 30.000VNĐ");
                    }
                } catch (Exception e) {
                    System.err.println("==============");
                    System.err.println("| Invalid!!!  |");
                    System.err.println("==============");
                }
            }

            System.out.println("CHANGED!!!");
            System.out.println("");
            return new StaffPartTime(id, name, age, address, code, dept, true, false, workTimeOnMonth, salaryOnHour);
        }
    }

    @Override
    public void deleteStaff() {
        String name;
        while (true) {
            System.out.println("Who do you want to delete? ");
            name = scanner.nextLine();
            int index = -1;
            boolean check = false;
            Pattern pattern = Pattern.compile("[^0-9]");
            if (pattern.matcher(name).find()) {
                for (int i = 0; i < staffList.size(); i++) {
                    if (name.contains(staffList.get(i).getName())) {
                        check = true;
                        index = staffList.indexOf(staffList.get(i));
                    }
                }
                if (check) {
                    staffList.remove(index);
                    System.out.println("deleted!!!");
                    System.out.println("");
                } else {
                    System.err.println("this staff dose not exit!!!");
                    deleteStaff();
                }
                break;
            } else {
                System.err.println("=================");
                System.err.println("|  TRY AGAIN!!!  |");
                System.err.println("=================");
            }
        }
        ReadAndWriteStaff.writeStaff(staffList);
    }

    @Override
    public void payRoll() {
        System.out.println("Which staff do you want to calculate salary? ");
        String name = scanner.nextLine();
        for (Staff staff : staffList) {
            if (staff.getName().equals(name)) {
                if (staff.isClassify()) {
                    System.out.println("A full time staff: " + "'" + name + "'" + " salary: " + ((StaffFullTime) staff).getPayRoll() + " VNĐ");
                } else {
                    System.out.println("A parttime staff " + "'" + name + "'" + " salary:  " + ((StaffPartTime) staff).getPayRoll() + " VNĐ");
                }
                return;
            }
        }
    }

    @Override
    public void employeeClassification() {
        System.out.println("which kind of staff do you want to classify ???");
        System.out.println("1. Fulltime staff");
        System.out.println("2. Parttime staff");
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice != 1 && choice != 2) {
                System.err.println("only type 1 or 2!!!");
                employeeClassification();
            }
        } catch (Exception e) {
            System.err.println("=================");
            System.err.println("|  TRY AGAIN!!!  |");
            System.err.println("=================");
        }
        switch (choice) {
            case 1:
                for (Staff s : staffList) {
                    if (s.isClassify()) {
                        System.out.println(s);
                    }
                }
                break;
            case 2:
                for (Staff s : staffList) {
                    if (!s.isClassify()) {
                        System.out.println(s);
                    }
                }
                break;
        }

    }

    public ArrayList<Staff> displayAllStaffinDepartment(String department) {
        ArrayList<Staff> staff= new ArrayList<>();
        for (Staff s : staffList) {
            if (s.getDepartment().equals(department)) {
                staff.add(s);
            }
        }
        return staff;
    }


//: method of staff menu
    public void showInfo() {
        System.out.println(" your name,please: ??? ");
        String name = scanner.next();
        System.out.println(" input your code: ");
        String code = scanner.next();
        int index = -1;
        boolean check = false;
        for (int i = 0; i < staffList.size(); i++) {
            if (name.contains(staffList.get(i).getName()) && code.contains(staffList.get(i).getCode())) {
                check = true;
                index = staffList.indexOf(staffList.get(i));
            }
        }
        if (check) {
            System.out.format("%-7s %-10s %-10s %-10s %-15s %-15s %-20s %-40s %-10s\n",
                    "ID", "Name", "Age", "Address", " code", "Status", "type of job", "total workring time", "wage/hours");
            staffList = ReadAndWriteStaff.readStaff();
            assert staffList != null;
            String[] line = staffList.get(index).toString().split(",");
            System.out.format("%-7s %-10s %-10s %-10s %-15s %-15s %-20s %-40s %-10s\n",
                    line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7], line[8]);
            System.out.println("");
        } else {
            System.err.println("====================================");
            System.err.println("|| we do not have these staff !!!  ||");
            System.err.println("====================================");
            showInfo();
        }
    }

    public void mySalary() {
        System.out.println("your name,please!!! ");
        String name = scanner.next();
        System.out.println(" input your code: ");
        String code2 = scanner.next();
        for (Staff staff : staffList) {
            if (staff.getName().equals(name) && staff.getCode().equals(code2)) {
                if (staff.isClassify()) {
                    System.out.println("A full time staff: " + "'" + name + "'" + " salary: " + ((StaffFullTime) staff).getPayRoll() + " VNĐ");

                } else {
                    System.out.println("Lương part time của nhân viên " + "'" + name + "'" + " là " + ((StaffPartTime) staff).getPayRoll() + " VNĐ");
                }
            } else {
                System.err.println("====================================");
                System.err.println("|| we do not have these staff !!!  ||");
                System.err.println("====================================");
                mySalary();
            }
        }
    }

}

