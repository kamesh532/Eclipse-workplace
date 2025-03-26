package JavaPrograms;

public class RemoveSpacesInStr {
public static void removeAllSpaces(String str) {
	System.out.println("Before: "+str);
	str=str.replaceAll(" ", "");
	System.out.println("After: "+str);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="  Kam e sh wa r  ";
removeAllSpaces(str);
	}

}
