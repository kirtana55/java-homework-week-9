package Programme2to10;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayEmpty {
    public void addElementsToTheList(){

        String a [] = new String [5];

        ArrayList<String> list = new ArrayList<>();
        list.add("Kirtana");
        list.add("Mamata");
        list.add("Nita");
        list.add("Neha");
        list.add("Pinak");
        list.add("Jimesh");


        if(list.isEmpty()){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }
    }

    public static void main(String[] args) {
        Programme_7_ArrayEmpty object = new Programme_7_ArrayEmpty();
        object.addElementsToTheList();
    }

}

