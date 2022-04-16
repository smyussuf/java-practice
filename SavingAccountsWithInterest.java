package schedule;

import java.util.Scanner;

public class SavingAccountsWithInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char accountType;
		Scanner input = new Scanner(System.in);
		double interestRate = 0.0;
		double saving = 0.0;
		double savingWithInterest = 0.0;
		boolean incorrectRate = true; //loop sentinel
		
		System.out.printf("Enter Account Type, Choose A or B or C or X\n"
				+ "\tA interest rate = 1.5\tminimum balance:$250\n"
				+ "\tB interst rate = 2\tminimum balance:$1000\n"
				+ "\tC interest rate = 1.5\tminimum balance:$250\n"
				+ "\tX interest rate = 5\tminimum balance: $5000\n");
		
		accountType = Character.toUpperCase(input.next().charAt(0)); //Get character at position 0 and change it to uppercase
		System.out.println();
		
		while(incorrectRate) {
			
			System.out.println("Enter amount you want to deposit: ");
			saving = input.nextDouble();
			
			switch(accountType) {
			
			case 'A':
			case 'C':
				if(saving < 250) {
					System.out.printf("Wrong minimum balance. "
							+ "Minimum balance should be more than 250"
							+ " Try Again!");
				}else {
				interestRate = 1.5;
				incorrectRate = false;
				}
				break;
			case 'B':
				if(saving < 1000) {
					System.out.printf("Wrong minimum balance. "
							+ "Minimum balance should be more than 1000"
							+ " Try Again!");
				}else {
				interestRate = 2;
				incorrectRate = false;
				}
				break;
			case 'X':
				if(saving < 5000) {
					System.out.printf("Wrong minimum balance. "
							+ "Minimum balance should be more than 5000"
							+ " Try Again!");
				}else {
				interestRate = 5;
				incorrectRate = false;
				}
				break;
			default:
				System.out.println("No such account type. Select A or B or C or X");
				break;
			} //end case
			
		}//end while
		
		
		
		savingWithInterest = saving + ( saving * interestRate);
		
		System.out.printf("With %15.4f and yearly interest rate of %f, you will earn %15.4f at the end of year",
				saving,interestRate,savingWithInterest);

	}

}