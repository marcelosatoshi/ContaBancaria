package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class ProgramPrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner cs = new Scanner(System.in);

			Account account = new Account();
			
	
			

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = cs.nextInt();
		System.out.print("Holder: ");
		cs.nextLine();
		String holder = cs.nextLine();
		System.out.print("Initial balance: ");
		Double balance = cs.nextDouble();
		System.out.print("Withdraw limit: ");
		Double limit = cs.nextDouble();
		
		account = new Account(number,holder,balance,limit);
		

		System.out.println("Enter amount for withdraw: ");
		Double amount = cs.nextDouble();
		try {
			account.withdraw(amount);
			System.out.println(account);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		cs.close();
	}

}
