package JavaPrograms;

public class CharPairing {

	public static void main(String[] args) {
	      String str="Company is not mine".replaceAll(" ", "");
	     // String []splitstr=str.split(" ");
	      System.out.println(str);
	      for(int i=0; i<str.length(); i++)
	          {
	              for(int j=0; j<str.length(); j++){
	                  if(i!=j&& str.charAt(j)!=' '){
	                     System.out.print(str.charAt(i)+ "" + str.charAt(j) + ", ") ;
	                  }
	              }
	          }
	     // 
	      
	      
	    }
	}
