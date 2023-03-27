package Lab8;

import java.util.HashMap;
import java.util.Map;

public class CountMappings {
    public static void main(String[] args) {
        // create a HashMap of String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // add some key-value mappings to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        map.put("mango", 4);

        // count the number of key-value mappings in the map
        int numMappings = map.size();

        // print the number of mappings
        System.out.println("Number of mappings: " + numMappings);
    }
}

