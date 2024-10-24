package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

public class MapUtilitiesDriver {
	public static void main(String[] args) {
        // test map1
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Alice", "Healthy");
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Chuck", "Fine");
        map1.put("Felix", "Sick");

        // test map2
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Mary", "Ecstatic");
        map2.put("Felix", "Healthy");
        map2.put("Ricardo", "Superb");
        map2.put("Tam", "Fine");
        map2.put("Bob", "Happy");

        // print expected output
        int commonPairs = MapUtilities.commonKeyPairs(map1, map2);
        System.out.println("Number of common key/value pairs is: " + commonPairs); 
    }
}

