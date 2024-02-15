package myProject28;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int number,addrem=0;
		System.out.print("Please enter a number:");
		number=input.nextInt();
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				addrem+=i;
				
			}
		}
		if(number==addrem) {
			System.out.println(number+" is a perfect number!");
		}
		else {
			System.out.println(number+" is not a perfect number!");
		}
		
	}

}
