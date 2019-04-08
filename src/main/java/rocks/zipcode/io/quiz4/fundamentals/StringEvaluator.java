package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                if(!list.contains(string.substring(i, j))) {
                    list.add(string.substring(i, j));
                }
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> temp = new ArrayList<>();
        String [] temp1 = getAllSubstrings(string1);
        String[] temp2 = getAllSubstrings(string2);

        for (String word:temp1) {
            for (String word2: temp2) {
                if(word2.equals(word)){
                    temp.add(word2);
                }
            }
        }
        String[] answer = temp.toArray(new String[temp.size()]);
        return answer;

    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] temp = getCommonSubstrings(string1, string2);
        String currentBiggest = temp[0];

        for (String word: temp) {
            if(word.length() > currentBiggest.length()){
                currentBiggest = word;
            }
        }
        return currentBiggest;
    }
}
