package JavaPrograms;

public class PalindromeOrNot {
	
	    public static void main(String[] args) {
	        String str="madama"; int l=0,r=str.length()-1;boolean f=true;
	        while(r>l)
	        {
	            if(str.charAt(l++)!=str.charAt(r--))
	                f=false;
	            else
	                f=true;
	                       }
	        if(f==true)
	            System.out.println(" palindrome");
	        else
	        System.out.println("not palindrome");
	    }
	}