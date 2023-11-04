
package LabTask11;
import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 2, 3, 5, 4, 6, 3, 7, 3, 5, 8 };

     
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

       
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        for (int key : frequencyMap.keySet()) {
            System.out.println("Element " + key + " occurs " + frequencyMap.get(key) + " time(s)");
        }
    }
}

