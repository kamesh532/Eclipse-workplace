package JavaPrograms;

public class CountCharacterInStr {

	public static void countChar(String s) {// s=Kameshwar
String st=s.replaceAll("[^a-zA-Z]", "");
		int c = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) != ' '){
				c++;
			}
		}
		System.out.println("total characters in " + st + ": " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kames0hwar";
		countChar(s);

	}

}
