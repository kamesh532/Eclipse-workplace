package JavaPrograms;

import java.util.Random;

public class RandomChar {
public static void randomChar(int len)
{
	String str="[^a-zA-Z]";
StringBuilder sb= new StringBuilder();
Random rd= new  Random();

for(int i=0; i<len; i++)
{
int index=rd.nextInt(str.length());

sb.append(str.charAt(index));

}
System.out.println("random string: "+sb.toString());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int len=8;
randomChar(len);
	}

}
