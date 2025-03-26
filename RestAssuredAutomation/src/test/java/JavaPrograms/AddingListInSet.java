package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//list ele
public class AddingListInSet {
public static List<String> listItems() {
	List<String> list=new ArrayList<>();
	list.add("Kamesh");
	list.add("Ramesh");
	System.out.println(list);
	return list;
}


//Set ele, adding list ele in set
public static void setItems(List<String> list1) {
	Set<String> set=new HashSet<>();
	set.add("Somesh");
	set.add("Deepak");
	set.addAll(list1);
	System.out.println("Before "+set);
	System.out.println(set.remove("Somesh"));
	System.out.println("After "+set);
}

public static void listItems(int arr1[],int arr2[]) {
	Set<Integer> set=new HashSet<Integer>();
	Set<Integer> common=new HashSet<Integer>();
	
	for(int a1:arr1) { set.add(a1);}
	for(int a2:arr2) { 
		if(set.contains(a2))
			common.add(a2);
		
	}
	System.out.println("Common element in "+Arrays.toString(arr1)+" and "+Arrays.toString(arr2)+" is "+common);
		
	}

//find last char in array of string
public static List<Character> findLastChar(List<String> ai){
	List<Character> list=new ArrayList<Character>();
	for(String word:ai)
	{
		list.add(word.charAt(word.length()-1));
	}
	System.out.println("Last char in Array "+list);
	return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//listItems();
		int arr[]={1,2,3,3,4,6},arr2[]={1,2,5};String []a= {"Kamesh,Ramesh,Someg"};
		List<String> ai=Arrays.asList(a);
List<String> list1=listItems();
setItems(list1);
listItems(arr, arr2);
findLastChar(ai);
	}

}
