package org.example.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArrays {
    public static void main(String[] args) {

        // *** Code Snippet 1: Basic ArrayList Operations ***
        System.out.println("**** Snippet 1: Basic ArrayList Operations ****");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        list.remove(1);
        System.out.println("ArrayList after removal: " + list);

        // *** Code Snippet 2: Using asList() to Convert Arrays to ArrayLists ***
        System.out.println("\n**** Snippet 2: Convert Arrays to ArrayList using asList() ****");
        String[] techLanguages = {"Java", "Python", "C++", "JavaScript"};
        ArrayList<String> techList = new ArrayList<>(Arrays.asList(techLanguages));
        System.out.println("Tech Languages List: " + techList);

        // *** Time Complexity Explanation ***
        System.out.println("\n**** Time Complexity of ArrayList Operations ****");
        System.out.println("1. add(E e) - O(1) for adding at the end, O(n) for inserting at an arbitrary index.");
        System.out.println("2. remove(Object o) - O(n) for removing by value, O(n) for removing by index.");
        System.out.println("3. get(int index) - O(1), direct access to the element.");
        System.out.println("4. size() - O(1), constant time to retrieve the size.");
        System.out.println("5. set(int index, E element) - O(1), direct replacement of the element.");
        System.out.println("6. contains(Object o) - O(n), searching through the list.");

        // *** Code Snippet 3: Add and Remove Elements from ArrayList ***
        System.out.println("\n**** Snippet 3: Add and Remove Elements from ArrayList ****");
        ArrayList<String> cricketers = new ArrayList<>();
        cricketers.add("Virat Kohli");
        cricketers.add("Sachin Tendulkar");
        cricketers.add("MS Dhoni");
        cricketers.add("Ricky Ponting");
        System.out.println("Cricketers: " + cricketers);
        cricketers.remove("MS Dhoni");
        System.out.println("Cricketers after removal: " + cricketers);

        // *** Code Snippet 4: Using contains() to Check for Elements ***
        System.out.println("\n**** Snippet 4: Using contains() to Check for Elements ****");
        System.out.println("Contains 'Virat Kohli': " + cricketers.contains("Virat Kohli"));
        System.out.println("Contains 'MS Dhoni': " + cricketers.contains("MS Dhoni"));

        // *** Difference Between Arrays.asList() and ArrayList ***
        System.out.println("\n**** Difference Between Arrays.asList() and ArrayList ****");
        System.out.println("Arrays.asList() creates a fixed-size list backed by the original array. " +
                "It does not allow adding or removing elements, and attempting to do so will throw an UnsupportedOperationException.");
        System.out.println("Example: If we try to remove an element from the list created by Arrays.asList(), it will throw an exception.");

        // Demonstrating the difference
        System.out.println("\nDemonstration:");
        // Creating a list using Arrays.asList()
        ArrayList<String> listFromAsList = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        System.out.println("List created by Arrays.asList(): " + listFromAsList);

        // Attempting to modify the list (This works because we're using an ArrayList, which is mutable)
        listFromAsList.add("JavaScript");
        System.out.println("After adding 'JavaScript': " + listFromAsList);

        // Now using the same approach with Arrays.asList() directly (not an ArrayList)
        // can't add, but can modify the elements using set and get function

        // Can set only 
        System.out.println("\nTrying to modify the list from Arrays.asList() directly (not an ArrayList):");
        String[] techArray = {"Java", "Python", "C++"};
        java.util.List<String> listFromArray = Arrays.asList(techArray);
        System.out.println("List created using Arrays.asList(): " + listFromArray);

        // Uncommenting the next line will throw an UnsupportedOperationException
        // listFromArray.add("JavaScript");  // Throws UnsupportedOperationException


        // Newer Java versions
        // can't replace even, can't add, can't remove, immutable
        List<Integer> data = List.of(1,2,3,4);
    }
}
