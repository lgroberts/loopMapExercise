package loopMapExercise;
import java.util.Scanner;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		HashMap<String, String> car = new HashMap<>();
		
		car.put("Element", "Honda");
		car.put("RAV4", "Toyota");
		car.put("Metro", "Geo");
		car.put("Crown Victoria", "Ford");
		car.put("Escort", "Ford");
		
		System.out.print("What model of car are you looking for? ");
		String carModel = scnr.nextLine();
		boolean response = car.containsKey(carModel);
		if (response == true) {
			System.out.println("We have the " + carModel + " in stock!");
		} else {
			System.out.println("We do not have the " + carModel + " in stock. Would you like to search again?");
		}
		
		scnr.close();
	}

}
