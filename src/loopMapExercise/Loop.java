package loopMapExercise;
import java.util.*;
import java.util.Scanner;

public class Loop {
	
	public static Integer sum(ArrayList<Integer> calculator) {
		int sum = 0;
		for (int i : calculator) {
			sum += i;
		}
		
		return sum;
	}
	
	public static Integer product(ArrayList<Integer> calculator) {
		int product = 1;
		for (int i : calculator) {
			product = product * i;
		}
		
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> calculator = new ArrayList<Integer>(5);
		int largest = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Please enter a number: ");
			int newNum = Integer.parseInt(scnr.nextLine());
			calculator.add(newNum);
			if (newNum > largest) {
				largest = newNum;
			}
		}
		
		
		System.out.print(calculator);
		System.out.println("\n" + sum(calculator));
		System.out.println(product(calculator));
		System.out.println(largest);
		System.out.println(Collections.min(calculator));
		
		scnr.close();
	}

}
