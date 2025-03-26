package JavaPrograms;

import java.util.Scanner;

public class Fibbonaci {
	public static void fibbo()
	{
		int a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=2; i<num; i++){
			c=a+b;
			System.out.print(" "+c+",");
			a=b;
			b=c;

		}

	}


	public static void main(String[] args) {
		fibbo();
	}

}
