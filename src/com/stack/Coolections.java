//package com.stack;
//import java.util.Hashtable;
//
//public class Hast{
//    public static void main(String[] args) {
//        // Create a Hashtable instance
//        Hashtable<String, Integer> hashtable = new Hashtable<>();
//
//        // Adding key-value pairs to the hashtable
//        hashtable.put("kajal", 25);
//        hashtable.put("kajal", 25);
//        hashtable.put("Bob", 35);
//
//        // Accessing values using keys
//        System.out.println("kajal's age: " + hashtable.get("kajal"));  // Output: 25
//        System.out.println("kajal's age: " + hashtable.get("kajal"));  // Output: 30
//
//        // Display the entire hashtable
//        //System.out.println("Hashtable: " + hashtable);
//    }
//}
package com.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coolections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(2);
        list.add(22);
        list.add(1);
        System.out.println(list);
        System.out.println("after sorting the elements");
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("after reverse");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println("shuffle");
        System.out.println(list);

        int min = Collections.min(list);
        System.out.println("Min value " + min);

        int max = Collections.max(list);
        System.out.println("Max value " + max);

        List<Integer> u= Collections.unmodifiableList(list);
        u.add(50);
        System.out.println("final values " + list);


        // System.out.println(list);
    }
}