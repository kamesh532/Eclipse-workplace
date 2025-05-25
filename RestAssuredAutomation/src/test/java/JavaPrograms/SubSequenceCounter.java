package JavaPrograms;

public class SubSequenceCounter {

	public static void main(String[] args) {
		// ;
		String s = "abcde";
		String[] words = { "a", "bb", "abc", "acb", "acd", "ace" };
		int match = numMatchSubSeq(s, words);
		System.out.println(match);
	}

	public static boolean isSequence(String s, String word) {
		int i = 0, j = 0;
		while (i < s.length() && j < word.length()) {
			if (s.charAt(i) == word.charAt(j)) {
				j++;
			}
			i++;

		}
		return j == word.length();
	}

	public static int numMatchSubSeq(String s, String words[]) {
		int count = 0;
		for (String word : words) {
			if (isSequence(s, word)) {
				count++;
			}
		}
		return count;
	}
}
