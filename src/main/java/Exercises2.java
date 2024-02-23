import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercises2 {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            boolean found = false;
            for (int temp = i + 1; temp < nums.length; temp++)
            {
                if (difference == nums[temp]) {
                    indices[0] = i;
                    indices[1] = temp;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        return indices;
    }

    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two ones added together.
    12 is written as XII, which is simply X + II.
    The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII.
    Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given a roman numeral, convert it to an integer.
    */

    public static int romanToInt(String s) {
        Map<String, Integer> dictionary = new HashMap<>();
        int result = 0;
        dictionary.put("I", 1);
        dictionary.put("IV", 4);
        dictionary.put("V", 5);
        dictionary.put("IX", 9);
        dictionary.put("X", 10);
        dictionary.put("XL", 40);
        dictionary.put("L", 50);
        dictionary.put("XC", 90);
        dictionary.put("C", 100);
        dictionary.put("CD", 400);
        dictionary.put("D", 500);
        dictionary.put("CM", 900);
        dictionary.put("M", 1000);
        dictionary.put(" ", 0);


        if (s.contains("IV"))
        {
            int count = 0;
            int index = s.indexOf("IV");

            while (index != -1) {
                count++;
                index = s.indexOf("IV", index + 1);
            }

            result += count * dictionary.get("IV");
            s = s.replaceAll("IV", "  ");
        }
        if (s.contains("IX"))
        {
            int count = 0;
            int index = s.indexOf("IX");

            while (index != -1) {
                count++;
                index = s.indexOf("IX", index + 1);
            }

            result += count * dictionary.get("IX");
            s = s.replaceAll("IX", "  ");
        }
        if (s.contains("XL"))
        {
            int count = 0;
            int index = s.indexOf("XL");

            while (index != -1) {
                count++;
                index = s.indexOf("XL", index + 1);
            }

            result += count * dictionary.get("XL");
            s = s.replaceAll("XL", "  ");
        }
        if (s.contains("XC"))
        {
            int count = 0;
            int index = s.indexOf("XC");

            while (index != -1) {
                count++;
                index = s.indexOf("XC", index + 1);
            }

            result += count * dictionary.get("XC");
            s = s.replaceAll("XC", "  ");
        }
        if (s.contains("CD"))
        {
            int count = 0;
            int index = s.indexOf("CD");

            while (index != -1) {
                count++;
                index = s.indexOf("CD", index + 1);
            }

            result += count * dictionary.get("CD");
            s = s.replaceAll("CD", "  ");
        }
        if (s.contains("CM"))
        {
            int count = 0;
            int index = s.indexOf("CM");

            while (index != -1) {
                count++;
                index = s.indexOf("CM", index + 1);
            }

            result += count * dictionary.get("CM");
            s = s.replaceAll("CM", "  ");
        }

        for (int i = 0; i< s.length(); i++)
        {
            result += dictionary.get("" + s.charAt(i));
        }



        return result;
    }

    /*
    Given an array nums of distinct integers, return all the possible permutations.
    You can return the answer in any order.
    */

    public List<List<Integer>> permute(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
    }
}