
package org.example.lists;

import java.util.ArrayList;
import java.util.Arrays;

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
    }
}
