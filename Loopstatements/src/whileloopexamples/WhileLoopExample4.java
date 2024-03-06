package whileloopexamples;

import java.util.Scanner;

public class WhileLoopExample4 {

	public static void main(String[] args) {
		
Scanner scanner=new Scanner (System.in);
		
		System.out.println("Please enter first value");
		int num1=scanner.nextInt();
		
		System.out.println("Please enter second value");
		int num2=scanner.nextInt();
		
		while(num1>num2)
		{
			if(num1%2==1)
				System.out.println(num1);
			num1--;
		}
	}

}
