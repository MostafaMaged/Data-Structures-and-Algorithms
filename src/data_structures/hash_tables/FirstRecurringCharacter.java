import java.util.Arrays;
import java.util.HashSet;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

public class FirstRecurringCharacter {

    public static Object firstRecurringCharacter(Object[] inputArray) {
        HashSet<Object> values = new HashSet<>(Arrays.asList(inputArray));
        for (Object obj : inputArray) {
            if (values.contains(obj)) {
                return obj;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Object[] arr = {1, 5, 8, 5, 1, 8, 8, 7, 4, 4, 10};
        System.out.println(firstRecurringCharacter(arr));
    }
}
