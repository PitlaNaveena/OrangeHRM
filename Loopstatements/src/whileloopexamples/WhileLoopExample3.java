package whileloopexamples;

import java.util.Scanner;

public class WhileLoopExample3 {
	public static void main(String[] args) {
		
Scanner scanner=new Scanner (System.in);
		
		System.out.println("Please enter first value");
		int num1=scanner.nextInt();
		
		System.out.println("Please enter second value");
		int num2=scanner.nextInt();
		
		
		while(num1<num2)
		{
			if(num1%2==0)
				System.out.println(num1);
		num1++;
			
		}
		
	/////////even numbers///////////
		

		System.out.println("Please enter first value");
		int n1=scanner.nextInt();
		
		System.out.println("Please enter second value");
		int n2=scanner.nextInt();
		
		int sum=0;
		while(n1<n2)
		{
			if(n1%2==0)
				sum+=n1;
				
		n1++;
			
		}
		System.out.println(sum);
	
	}

}
