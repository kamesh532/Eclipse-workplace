package JavaPrograms;


	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online
	import java. util.*;
	class FindDupsUsingList {
	    public static void main(String[] args) {
	        int arr[]={1,2,2,3,1,4};
	        System.out.print(Arrays.toString(arr)+" are  " );
	List<Integer> list =new ArrayList<>();
	for(int num:arr)
	{
	if(!list.contains(num))
	{
	list.add(num);
	}
	else
	System.out.println("Duplicate ele "+num);
	}System.out.println("unique ele "+list);
//se
	    }
	}

