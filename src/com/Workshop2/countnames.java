package com.Workshop2;


    import java.util.ArrayList;
import java.util.List;

public class countnames {        public static void main(String[] args) {
            // Create a list of names
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Kathy");
            names.add("Kevin");
            names.add("Liam");
            names.add("Kate");

            long count = names.stream()
                    .filter(name -> name.startsWith("K")) // Filter names starting with 'K'
                    .count();                             // Count the filtered names

            // Print the count
            System.out.println("Number of names that start with 'K': " + count);
        }
    }

