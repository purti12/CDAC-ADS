/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask6;
import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static int ListSum(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0) + ListSum(list.subList(1, list.size()));
        }
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        int result = ListSum(myList);
        System.out.println("Sum of elements in the list: " + result);
    }
}

