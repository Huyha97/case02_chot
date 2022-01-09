package bai12.baitap01;

import java.util.Scanner;

public interface Manager {
    void displayAll();

    void addProduct(Product product);

    Product searchByName(String name);

    Product deleteProductById(int id);

    void upDateById(Scanner sc);

    void SortByPriceAtoZ();

    void SortByPriceZtoA();


}
