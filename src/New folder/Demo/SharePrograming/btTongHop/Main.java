package Demo.SharePrograming.btTongHop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


    HashMap<String, Integer> customers = new HashMap<>();
 customers.put("John", 30);
 customers.put("Mike", 28);
 customers.put("Bill", 32);
 customers.put("Maria", 27);
    Set<String> keys = customers.keySet();
        System.out.println(Arrays.toString(keys.toArray()));
 for (String key: keys){
        System.out.println("Key: " + key + ": " + customers.get(key));
 }
    }
}

class SetExample {
    public static void main(String[] args) {
        // Create set
        Set<String> items = new HashSet<>();
        items.add("A02"); // Add new item
        items.add("D03");
        items.add("D03"); // item is ignored
        items.add("01");
        items.add("04");

        // Show set through for-each
        for (String item: items) {
            System.out.print(item + " ");
        }
    }
}
