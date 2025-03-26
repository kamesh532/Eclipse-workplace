package JavaPrograms;

public class SwapTwoStrings {
	
	  public static void main(String[] args) {
	       String s1="Kamesh",s2="War";
	       System.out.println("before swapp s1: "+s1+" s2: "+s2); 
	       s1=s1+s2;
	       System.out.println("length of s1 and s2 strings "+s1.length());
	       s2=s1.substring(0,s1.length()-s2.length());
	      s1=s1.substring(s2.length());
	      System.out.println("after swapp s1: "+s1+" s2: "+s2);
	    }

}
