package whileloopexamples;

import java.util.Scanner;

public class WhileLoopExample5 {

	public static void main(String[] args) {
		
Scanner scanner=new Scanner (System.in);
		
		System.out.println("Please enter first value");
		int num=scanner.nextInt();
		
		
	
	if(num !=1 || num !=2) {
		int i=2;
		while(i<num) {
			if(num%i==0)
			{
				break;
			}
			i++;
				
		}
	}

}
}
