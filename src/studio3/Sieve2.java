package studio3;

import java.util.Scanner;

public class Sieve2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the number of your choice?");
		int n = in.nextInt();	
		int[] numbers = new int [n]; // made an array
		
		for (int i = 0; i < (numbers.length-1); i++) { // 
		numbers [i]	= i;
		
		
	}
		int d = 2;
		while (d <= (n/2)) {
			for (int i = 2; (d*i) <= (numbers.length-1); i++) {
				numbers[d*i] = 0;
				

			}
			d++;
			
		}
		
		for (int i = 0; i < (numbers.length-1); i++) { // 
			if (numbers [i] != 0)
				System.out.print(numbers[i]+ " ");
	}
}
}
