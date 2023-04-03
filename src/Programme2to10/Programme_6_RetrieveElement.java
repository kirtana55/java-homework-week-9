package Programme2to10;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElement {
    ArrayList list = new ArrayList();
    public static void main(String[] args) {

        Programme_6_RetrieveElement obj = new Programme_6_RetrieveElement();
        ArrayList list = obj.list;
        obj.addElements();
        obj.findElements(2,list);
    }
    public void addElements(){
        list.add("Honda");
        list.add("Ford");
        list.add("BMW");
        list.add("Audi");
        list.add("Mercedes");
        list.add("Ferrari");
        list.add("Mclaren");
    }
    public void findElements(int i,ArrayList list){
        System.out.println(list.get(i));
    }
}
