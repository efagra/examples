package lab01.products;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Product best = new Product();
		
		boolean more = true;
		while(more) {
			
			Product current = new Product();
			
			current.read();
			
			if(current.is_better_than(best))
				best = current;
			
			System.out.println("More products? (1=YES, 2=NO)");
			int answer = in.nextInt();
			if(answer != 1)
				more = false;
			in.nextLine();      //flushes the input buffer
		}
		in.close();
		
		System.out.println("Best Product: ");
		best.printData();

	}

}
