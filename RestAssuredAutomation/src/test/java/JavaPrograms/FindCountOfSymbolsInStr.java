package JavaPrograms;

public class FindCountOfSymbolsInStr {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	
	    public static void main(String[] args) {
	         String input = "Hello@123#World!$"; int c=0;
	         for(int i=0;i<input.length(); i++)
	         {
	             char ch=input.charAt(i);
	             if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
	             c++;}
	         }
	        System.out.println(c);
	    }
	}
