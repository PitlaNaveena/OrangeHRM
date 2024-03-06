package whileloopexamples;

import java.util.Scanner;

public class WhileLoopExample2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Please enter first value");
		int num1=scanner.nextInt();
		
		System.out.println("Please enter second value");
		int num2=scanner.nextInt();
		
		int number=num1;
		while(number<num2)
		{
			System.out.println(number);
		number++;
		}
		
		/////////////////////////
		
		
		System.out.println("Please enter first value");
		int number1=scanner.nextInt();
		
		System.out.println("Please enter second value");
		int number2=scanner.nextInt();
		
		int n=number1;
	while(n<number2)
	{
		if(n%7==0)
			System.out.println(n);
		n++;
	}
		
		
		
		
	}

}
