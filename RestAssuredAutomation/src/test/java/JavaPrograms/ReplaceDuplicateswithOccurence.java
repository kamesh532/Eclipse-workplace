package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceDuplicateswithOccurence {

	public static String replaceDuplicates(String str) {
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		StringBuilder result = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if(ch!=' ')
			   charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
			if (charCountMap.get(ch) > 1) {
				result.append(charCountMap.get(ch)); // Replace duplicate with count
			} else {
				result.append(ch); // Keep first occurrence as it is
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String input = "Kaammmeshwwwar";
		String output = replaceDuplicates(input);
		System.out.println("Modified String: " + output);
	}
}

