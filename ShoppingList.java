package bonuslab20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Tyree's Market!");

//		ArrayList<String> items = new ArrayList<>();
//		items.add("apple");
//		items.add("banana");
//		items.add("cauliflower");
//		items.add("dragonfruit");
//		items.add("Elderberry");
//		items.add("figs");
//		items.add("grapefruit");
//		items.add("honeydew");
//		ArrayList<String> prices = new ArrayList<>();
//		prices.add("$0.99");
//		prices.add("$0.59");
//		prices.add("$1.59");
//		prices.add("$2.19");
//		prices.add("$1.79");
//		prices.add("$2.09");
//		prices.add("$1.99");
//		prices.add("$3.49");
		
		Map<String, Double> items = new HashMap<>();
		
		items.put("apple", 0.99);
		items.put("banana", 0.59);
		items.put("cauliflower", 1.59);
		items.put("dragonfruit", 2.19);
		items.put("Elderberry", 1.79);
		items.put("figs", 2.09);
		items.put("grapefruit", 1.99);
		items.put("honeydew", 3.49);

		System.out.printf("%-15s %15s\n", "Item", "Price");
		System.out.println("=====================================");
		
		System.out.println(items.get("apple"));
//		for (int i = 0; i < items.size(); i++) {
//			System.out.printf("%-15s\n", items);
//		}
		
		ArrayList<String> food = new ArrayList<>();
		ArrayList<String> cost = new ArrayList<>();
		
		System.out.println("What would you like to order?");
		String choice = sc.nextLine();
		
		
//			if (choice.equalsIgnoreCase("apple")) {
//				System.out.println("Adding " + choice + " to cart at " + prices.get(0));
//				food.add(items.get(0));
//				cost.add(prices.get(0));
//			} else if (choice.equalsIgnoreCase("banana")) {
//				System.out.println("Adding " + choice + " to cart at " + prices.get(1));
//				food.add(items.get(1));
//				cost.add(prices.get(1));
//			} else if (choice.equalsIgnoreCase("cauliflower")) {
//				System.out.println("Adding " + choice + " to cart at " + prices.get(2));
//				food.add(items.get(2));
//				cost.add(prices.get(2));
//			} else if (choice.equalsIgnoreCase("dragonfruit")) {
//				System.out.println("Adding " + choice + " to cart at " + prices.get(3));
//				food.add(items.get(3));
//				cost.add(prices.get(3));
//			} else if (choice.equalsIgnoreCase("Elderberry")) {
//				System.out.println("Adding " + choice + " to cart at " + prices.get(4));
//				food.add(items.get(4));
//				cost.add(prices.get(4));
//			} else if (choice.equalsIgnoreCase("figs")) {
//				System.out.println("Adding " + choice + " to cart at " + prices.get(5));
//				food.add(items.get(5));
//				cost.add(prices.get(5));
//			} else if (choice.equalsIgnoreCase("grapefruit")) {
//				System.out.println("Adding " + choice + " to cart at " + prices.get(6));
//				food.add(items.get(6));
//				cost.add(prices.get(6));
//			} else if (choice.equalsIgnoreCase("honeydew")) {
//				System.out.println("Adding " + choice + " to cart at " + prices.get(7));
//				food.add(items.get(7));
//				cost.add(prices.get(7));
//			} else {
//				System.out.println("Sorry, we don't have those. Please try again.");
//				sc.next();
//			}
	}

}
