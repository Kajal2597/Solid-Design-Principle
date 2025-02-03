package com.Workshop2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Findnames {
    public static void main(String[] args) {
        Integer[] arr = {5, 9, 11, 3, 7, 2, 5};  // Example array

        // Find the third largest element
        Optional<Integer> thirdLargest = Arrays.stream(arr)
                .distinct()                               // Remove duplicates
                .sorted(Comparator.reverseOrder())        // Sort in descending order
                .skip(2)                                  // Skip the first two largest elements
                .findFirst();                             // Get the third largest element

        if (thirdLargest.isPresent()) {
            System.out.println("Third largest element is: " + thirdLargest.get());
        } else {
            System.out.println("Array doesn't have a third largest element.");
        }
    }
}


/*
Find third element
Convert the array into a stream.
Remove duplicates (if necessary).
Sort the elements in reverse order (descending).
Limit the stream to get the third element.
 */