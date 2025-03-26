package JavaPrograms;

public class Capitalised {

	public static void main(String[] args) {
		String str="kamesh kumar war";
		sub(str);
	}
	public static void sub(String str) {
		String[] strspl=str.split(" ");String res="";
		for(int i=0; i<strspl.length; i++)
		{
			
				res+=strspl[i].substring(0, 1).toUpperCase()+strspl[i].substring(1).toLowerCase()+" ";
				
				
		}
		System.out.println(res.trim());
	}

}
