package lab01;

import java.util.Scanner;

public class FirstJavaApp {

	public static void main(String[] args) {

		//Printing of a simple Hello World Message!
		System.out.println("Hello World!");
		
		//Using a variable in the print method
		String name = "Efstathios";
		System.out.println("Hello "+name);
		
		double price = 5.68;
		String product = "cookies";
		System.out.println("The price of "+product+" is "+price+" euros");
		
		//Calculation of a circle's area
		double radius = 15.62;
		double area = 3.14159 * Math.pow(radius, 2);
		System.out.format("The area of the circle is %1$5.2f  \n", area);

		//Simple array usage
		final int size = 10;
		long[] packages = new long[size];
		for(int i=0; i< size; i++){
			double random = Math.random();
			long randomLong = Math.round(random * 100);
			packages[i] = randomLong;
		}
		
		//Calculation of the average package weight
		double average = 0;
		double sum = 0;
		for(int i=0; i<size; i++) {
			sum += packages[i];
		}
		average = sum/size;
		System.out.format("Average package weight is %1$5.3f  \n", average);
		
		
		//Calculation of Body Mass Index with user input data.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your height: ");
		double height = scanner.nextDouble();
		System.out.print("Enter your weight: ");
		double weight = scanner.nextDouble();
		double bodyMassIndex = weight / Math.pow(height, 2);
		System.out.format("Your body mass index is %1$5.2f  \n", bodyMassIndex);
		scanner.close();   //Scanner should be closed to prevent memory leakage

	}

}
