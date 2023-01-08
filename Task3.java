package assingment.week3;

import java.util.Iterator;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter Number of Number of Students");
		int NumStudent=sc.nextInt();
		
		for (int i = 1; i <=NumStudent ; i++)
		{
			System.out.println("Please Enter Name");
			String Name= sc.next();
			
			System.out.println("Please Enter Email");
			String email=sc.next();
		}	
	}

}
