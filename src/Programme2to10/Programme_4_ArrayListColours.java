package Programme2to10;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ArrayListColours {
    public static void main(String[] args) {
        Programme_4_ArrayListColours obj = new Programme_4_ArrayListColours();
        obj.colourArrayList();
    }

    public void colourArrayList() {
        ArrayList<String> colour = new ArrayList();
        colour.add("Red");
        colour.add("Orange");
        colour.add("Yellow");
        colour.add("Green");
        colour.add("Blue");
        colour.add("Indigo");
        colour.add("Violet");

        for (String c : colour) {
            System.out.println(c);
        }
    }
}
