import java.util.*;
import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a =new ArrayList<String>();
		ArrayList<String> b =new ArrayList<String>();
		ArrayList<String> c =new ArrayList<String>();
		
		a.add("one");
		a.add("two");
		a.add("three");
		
		//elements to be merged
		b.add("one");
		b.add("two");
		b.add("five");
		b.add("six");
		
		// elements to be deleted
		c.add("two");
		c.add("five");
		mergeandremoved(a,b,c);
		
		System.out.println("List is "+a);
		
		String[] final_list = new String[a.size()];
		
		for(int i = 0; i < final_list.length; i++)
			final_list[i] = a.get(i); // copies element one by one from arraylist to String[]

		sort(final_list, final_list.length);
		
		for (int i=0; i<final_list.length; i++) 
		        System.out.print(final_list[i]+" "); 
		
	}
	
	public static void mergeandremoved(List<String> a, List<String> b, List<String> c)
	{
		for(int i = 0; i < b.size(); i++)
		{
			String num = b.get(i);
			if(!a.contains(num))
				a.add(num);
		}
		
		for(int i = 0; i < c.size(); i++)
		{
			String num = c.get(i);
			if(a.contains(num))
			{
				a.remove(a.indexOf(num));
			}
		}
	}
	
	public static void sort(String []final_list, int n)
	{
		for (int i=1 ;i<n; i++) 
	    { 
	        String temp = final_list[i]; 
	  
	        // Insert s[j] at its correct position 
	        int j = i - 1; 
	        while (j >= 0 && temp.length() >= final_list[j].length()) 
	        { 
	        	final_list[j+1] = final_list[j]; 
	            j--; 
	        } 
	        final_list[j+1] = temp; 
	    } 
	}

}

//System.out.println("How many elements you want to add in a?");	
//Scanner obj = new Scanner(System.in);
//int n = obj.nextInt();
//System.out.println("Enter elements (add unique elements) for a");		
//for(int i = 0; i < n; i++)
//{
//	String element = obj.nextLine();			
//	if(!a.contains(element)) // check whether element exists in list or not, if it does not exist, we should add it
//		a.add(element);
//	// else we will not add that element
//}
//
//// second list input from user which we need to merge with a		
//System.out.println("Enter how many elements you want to add in b, later merged in a?");
//n = obj.nextInt();		
//System.out.println("Enter elements (add unique elements) for b");		
//for(int i = 0; i < n; i++)
//{
//	String element = obj.nextLine();			
//	if(!b.contains(element)) // check whether element exists in list or not, if it does not exist, we should add it
//		b.add(element);
//	// else we will not add that element
//}
//
//System.out.println("Enter how many elements you want to delete in a");		
//n = obj.nextInt();
//System.out.println("Enter deleted elements for c, later delete in a");
//for(int i = 0; i < n; i++)
//{
//	String element = obj.nextLine();
//	if(!c.contains(element))
//		c.add(element);
//}
