package bai12.baitap01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị tất cả list");
            System.out.println("2. Thêm 1 sản phẩm");
            System.out.println("3. Sửa 1 người theo id");
            System.out.println("4. Xóa 1 người theo id");
            System.out.println("5. Tìm 1 người theo tên");
            System.out.println("6. Sắp xếp list từ bé đến lớn ");
            System.out.println("7. Sắp xếp list từ lớn đến bé ");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productManager.displayAll();
                    break;
                case 2:
                   Product product = productManager.CreatProduct(scanner);
                   productManager.addProduct(product);
                   break;
                case 3:
                    productManager.upDateById(scanner);
                    break;
                case 4:
                    System.out.println("Nhập id sản phẩm muốn xóa: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(productManager.deleteProductById(idDelete));
                    break;
                case 5:
                    System.out.println("Nhập tên người muốn tìm: ");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(productManager.searchByName(name));
                    break;
                case 6:
                    productManager.SortByPriceAtoZ();
                    productManager.displayAll();
                    break;
                case 7:
                    productManager.SortByPriceZtoA();
                    productManager.displayAll();
                    break;
                }
        }while (choice!=0);
    }}