package viDu.cafedev;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        System.out.println("List " + numbers);
//
//        int number = numbers.get(2);
//        System.out.println("Accessed element:" + number);
//
//        int removedNumber = numbers.remove(0);
//        System.out.println("Removed Element: " + removedNumber);
//        System.out.println("List"+ numbers);



//        // Linkedlist 01: animals
//        LinkedList<String> animals = new LinkedList<>();
//
//        animals.add("Dog");
//        animals.add("Cat");
//        animals.add("Horse");
//        animals.add(3,"Monkey");
//        animals.add(4,"Tiger");
//        animals.add(5,"Elephent");
//
//        System.out.println("LinkedList: " + animals);
//
//        // linklist02: mammals
//
//        LinkedList<String> mammals = new LinkedList<>();
//
//        mammals.add("a");
//        mammals.add("b");
//        mammals.add("c");
//        System.out.println("Mammals" + mammals);
//
//        animals.addAll(mammals);
//        System.out.println("Animals after add mammals: " + animals);
//
//        int index1= animals.indexOf("Dog");
//        System.out.println(index1);
//        animals.set(0,"zoo");
//        System.out.println(animals);

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("LinkedList: " + animals);

        System.out.println("accessing linked list elements");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
            System.out.println(", ");

        }
    }
}
