package JavaPrograms;

	 public class PrintCamelCase {
		 public static void main(String args[]) {
		 String str="kamesh war Rao";
		 String words[]=str.split(" ");
		 StringBuilder sb=new StringBuilder();
		 for(int i=0; i<words.length; i++)
		 {
		     String word=words[i];
//		     if(i==0)
//		     {
		     	 sb.append(word.substring(0,1).toUpperCase())
		         .append(word.substring(1).toLowerCase());
		     	
		  //   }
		    // System.out.println(sb+"--- first");
//		     else
//		     sb.append(word.substring(0,1).toUpperCase())
//		     .append(word.substring(1).toLowerCase());
		 }
		 System.out.println(sb);

		 }
}
