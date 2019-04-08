package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] temp = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> list = new ArrayList<>();
        for (String substring:temp) {
            if(isPalindrome(substring)){
                list.add(substring);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();

    }
}
