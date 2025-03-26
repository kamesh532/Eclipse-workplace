package JavaPrograms;

public class SeleniumMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sele d=new Sele();
		String res=d.test("Kamesh");
		String res1=d.test1("Kamesh");
		System.out.println("parent "+res);

		System.out.println("child "+res1);
	}
	public static String test(String a)
	{
		return a="test";
	}
}
class Sele extends SeleniumMethod{
	public static String test1(String a)
	{
		return a="test1"+"test";
	}}
//class Main{
//	
//}


