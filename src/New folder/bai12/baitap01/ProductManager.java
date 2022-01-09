package bai12.baitap01;

import java.util.*;

public class ProductManager implements Manager {
    private ArrayList<Product> products;
    private final Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        this.products = new ArrayList<>();
    }

//1
    @Override
    public void displayAll() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
//2
    @Override
    public void addProduct(Product product) {

        products.add(product);
    }
//3
    @Override
    public Product searchByName(String name) {
        for (Product p : products) {
            if (Objects.equals(p.getName(), name)) {
                return p;
            }
        }
        return null;
    }
//4
    @Override
    public Product deleteProductById(int id) {
            Product product = null;
        for (Product p : products) {
            if (p.getId() == id) {
                product = p;
            }
        }
        products.remove(product);
        return null;
    }


    //5
    @Override
    public void upDateById(Scanner sc) {
        System.out.println(" nhập id sản phẩm cần sửa: ");
        int id = sc.nextInt();
        Product ProductUpdate = null;
        for (Product product : products) {
            if (product.getId() == id) {
                ProductUpdate = product;
                System.out.println("Nhập tên mới: ");
                ProductUpdate.setName(scanner.nextLine());
                System.out.println(" nhập giá mới");
                ProductUpdate.setPrice(scanner.nextDouble());
                System.out.println(" nhập loại mới");
                ProductUpdate.setType(scanner.nextLine());
                scanner.nextLine();
            }

        }

    }

    @Override
    public void SortByPriceAtoZ() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() > o2.getPrice())
                    return 1;
                else if (o1.getPrice() < o2.getPrice())
                    return -1;
                else
                    return 0;
            }
        });
    }

    @Override
    public void SortByPriceZtoA() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() > o2.getPrice())
                    return -1;
                else if (o1.getPrice() < o2.getPrice())
                    return 1;
                else
                    return 0;
            }
        });
    }

    public Product CreatProduct(Scanner scanner) {
        scanner.nextLine();
        System.out.println("nhập vào id: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập vào giá: ");
        double price = scanner.nextDouble();
        System.out.println(" nhập vào loại: ");
        String type = scanner.nextLine();
        scanner.nextLine();
        return new Product(id,name,price,type);
    }


}



