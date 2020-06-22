

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {
		
	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<Integer>();	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of student");
		int n=sc.nextInt();
		System.out.println("Enter the marks of student");
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			al.add(x);
		}
		//Highest Marks
		System.out.print("Highest marks:");
		ArrayList<Integer> all=new ArrayList<Integer>();
		all.addAll(al);
		Collections.sort(al);
		System.out.print(al.get(n-1)+"\n");
		
		//Average Marks
		float avg=0;
		for(int i=0;i<n;i++)
		{
			avg=avg+al.get(i);
		}
		System.out.print("Average of marks:");
		System.out.println(avg/n);
		System.out.print("Marks  :   ");
		for(int i=0;i<n;i++) 
		{
		 System.out.print(i+1+"-"+all.get(i)+"  ");
		}
		System.out.println("\nThird Student Marks: "+all.get(2));
		System.out.print("Sorted  : ");
		for(int i=0;i<n;i++)
		{
		System.out.print(i+1+"-"+al.get(i)+"  ");
		}
		
		sc.close();
		
	}
}