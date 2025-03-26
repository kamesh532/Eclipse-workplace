package JavaPrograms;

public class ReverseFirstThree {

	 public static void main(String[] args) {
	      String str="Company is not mine";
	      int len=str.length();
	      String sub=new StringBuilder(str.substring(0,len/2)).reverse().toString();
	      
	      String remainstr=str.substring(3);
	      System.out.println(sub+remainstr);
	    }
	}
