package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedChar {
    public static int secondMostRepeatedChar(String str) {
        if (str == null || str.isEmpty()) {
           return '\0'; // Return null character for empty or null string
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int firstMaxCount = 0, secondMaxCount = 0;
        char firstMaxChar = '\0', secondMaxChar = '\0';

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count > firstMaxCount) {
                secondMaxChar = firstMaxChar;
                secondMaxCount = firstMaxCount;

                firstMaxChar = c;
                firstMaxCount = count;
            } else if (count > secondMaxCount && count != firstMaxCount) {
                secondMaxChar = c;
                secondMaxCount = count;
            }
        }
System.out.println(secondMaxChar+" : "+secondMaxCount);
        //return secondMaxChar;
        return  secondMaxChar;
        
    }

    public static void main(String[] args) {
        String str = "hello wwrld";
        int secondMostRepeated = secondMostRepeatedChar(str);
        System.out.println("Second most repeated character: " + secondMostRepeated);
    }
}
