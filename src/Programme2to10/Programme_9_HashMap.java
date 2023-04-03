package Programme2to10;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        Programme_9_HashMap obj = new Programme_9_HashMap();
        obj.addElement();
    }

    Map<String, Integer> people = new HashMap<>();
    public void addElement() {
        people.put("Kirtana", 2);
        people.put("Neha", 4);
        people.put("Mamata", 3);
        people.put("Nita", 5);
        people.put("Jimesh", 1);
        people.put("Pinak", 6);
        for (Map.Entry<String, Integer> map : people.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

}
