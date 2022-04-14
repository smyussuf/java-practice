package schedule;

import java.util.Scanner;

public class HextoDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter HEX number");
		
		String s = input.nextLine();
		
		System.out.println("The length of string " + s + " is " + s.length());
		
		int powerCount = s.length();
		int digit = 0;
		int powerIndex = 0;
		int ans = 0;
		
		while(powerCount > 0) {
			
			switch(Character.toUpperCase(s.charAt(powerCount-1))) {
			case '0' :
				digit = 0;
				break;
			case '1':
				digit = 1;
				break;
			case '2':
				digit = 2;
				break;
			case '3':
				digit = 3;
				break;
			case '4':
				digit = 4;
				break;
			case '5':
				digit = 5;
				break;
			case '6':
				digit = 6;
				break;
			case '7':
				digit = 7;
				break;
			case '8':
				digit = 8;
				break;
			case '9':
				digit = 9;
				break;
			case 'A':
				digit = 10;
				break;
			case 'B':
				digit = 11;
				break;
			case 'C':
				digit = 12;
				break;
			case 'D':
				digit = 13;
				break;
			case 'E':
				digit = 14;
				break;
			case 'F':
				digit = 15;
				break;
			}
			
			ans = (int) Math.pow(16, powerIndex) * digit + ans;
			powerCount -= 1;
			powerIndex += 1;
			
			//System.out.println(digit);
			//System.out.println(ans);
			
			//Use hex to dec table as array?
			// Loop and inner loop?
			// compare charAt() with the table
			// use switch()? to compare
			//link https://owlcation.com/stem/Convert-Hex-to-Decimal
			
		}
		
		System.out.println("Hex number: " + s + " is equivalent to decimal " + ans);

	}

}
