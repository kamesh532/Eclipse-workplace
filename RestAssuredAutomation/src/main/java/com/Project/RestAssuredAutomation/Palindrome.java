package com.Project.RestAssuredAutomation;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="level";String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev+=str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("this is Palindrome");
		}
		else
			System.out.println("this is not Palindrome");

	}

}
