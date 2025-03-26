package JavaPrograms;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
 public static void evenORodd()
 {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number: ");
    int num=sc.nextInt();
     
     if(num%2 == 0)
     {
         System.out.println(num+" is even");
     }
     else
         System.out.println(num+" is odd");
 }
 public static void main(String[] args) {
    evenORodd();
 }
}
