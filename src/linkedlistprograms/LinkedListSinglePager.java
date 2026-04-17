package linkedlistprograms;

import java.util.*;

public class LinkedListSinglePager {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> l_list = new LinkedList<>();

        // Add elements
        l_list.add("Red");
        l_list.add("Blue");
        l_list.add("Green");
        l_list.add("Yellow");

        System.out.println("Original LinkedList: " + l_list);

        // 1. Iterate from specified position (2nd position → index 1)
        System.out.println("\nIterating from 2nd position:");
        Iterator<String> it = l_list.listIterator(1);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 2. Iterate in reverse order
        System.out.println("\nReverse order iteration:");
        Iterator<String> rev = l_list.descendingIterator();
        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        // 3. Insert element at end using offerLast()
        l_list.offerLast("Pink");
        System.out.println("\nAfter adding Pink at end: " + l_list);

        // 4. Display elements with positions
        System.out.println("\nElements with positions:");
        for (int i = 0; i < l_list.size(); i++) {
            System.out.println("Position " + i + ": " + l_list.get(i));
        }

        // 5. Swap first and third elements
        Collections.swap(l_list, 0, 2);
        System.out.println("\nAfter swapping 1st and 3rd elements: " + l_list);
    }
}