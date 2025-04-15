package JavaPrograms;

import org.testng.reporters.jq.Main;

public class NonRepeatingElements {
	 public static void main(String[] args) {
	      String str="swiss";
	      for(char ch:str.toCharArray())
	      {
	          if(str.indexOf(ch)==str.lastIndexOf(ch))
	            {
	                System.out.println("First Non-Repeating: " + ch);
	                break;
	            }
	      }
	         
	    }

}
