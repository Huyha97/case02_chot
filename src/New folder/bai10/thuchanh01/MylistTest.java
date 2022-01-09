package bai10.thuchanh01;

public class MylistTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
            listInterger.add(1);
            listInterger.add(2);
            listInterger.add(3);
            listInterger.add(4);

        System.out.println("elements 4: " + listInterger.get(4));
        System.out.println("elements 1: " + listInterger.get(1));
        System.out.println("elements 2: " + listInterger.get(2));

        listInterger.get(6);
        System.out.println("elements 6: " + listInterger.get(6));

        listInterger.get(-1);
        System.out.println("elements -1: " + listInterger.get(-1));
              }
    }

