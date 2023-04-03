package Programme2to10;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_ArrayCompare {
    public static void main(String[] args) {
        Programme_11_ArrayCompare object = new Programme_11_ArrayCompare();
        object.addElemetsInArray();
    }

    public void addElemetsInArray() {

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("First List : " +c1);
        System.out.println("Second List : " +c2);
        c1.removeAll(c2);
        System.out.println("Un-Common between two list is : "+c1);
    }

}