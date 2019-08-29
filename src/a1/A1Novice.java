package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		System.out.println("How many customers will be shopping?");
		
		int numCus = scan.nextInt();
		System.out.println();
		
		String [] customers = new String[numCus];
		String [] totalPrice = new String[numCus];
		
		for (int i = 0; i < numCus; i++) {
			double total = 0.0;
			
			System.out.println("What is the first name of the customer?");
			String fName = scan.next();
			
			System.out.println("What is the last name of the customer?");
			String lName = scan.next();
			
			customers[i] = fName.charAt(0) + ". " + lName;
			
			System.out.println("How many items did they buy?");
			
			int numItems = scan.nextInt();
			
			for (int j = 0; j < numItems; j++) {
				System.out.println();
				System.out.println();
				
				System.out.println("How many of that item did they buy?");
				int amt = scan.nextInt();
				
				System.out.println("What item did they buy?");
				String item = scan.next();
				
				
				System.out.println("How much does that item cost?");
				double price = scan.nextDouble()*amt;
				
				total += price;
				
				
			}
			String strTotal = String.format("%.2f", total);
			totalPrice[i] = strTotal;
		}
		
		for (int k = 0; k < numCus; k++) {
			System.out.println(customers[k] + ": " + totalPrice[k]);
		}
	}
}
