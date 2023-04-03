package Programme2to10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Programme_5_ArrayListIterator {

    public static void main(String[] args) {
        Programme_5_ArrayListIterator obj = new Programme_5_ArrayListIterator();
        obj. iterateArray();
    }
    public void  iterateArray(){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
