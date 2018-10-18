package bonuslab20;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Welcome to Tyree's Market!");
//
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
//
//		System.out.printf("%-15s %15s\n", "Item", "Price");
//		System.out.println("=====================================");
//		for (int i = 0; i < items.size(); i++) {
//			System.out.printf("%-15s %15s\n", items.get(i), prices.get(i));
//		}
//			
//		ArrayList<String> both = new ArrayList<>();
//		both.addAll(items);
//		both.addAll(prices);
//		
		System.out.println("What item would you like to order?");
		sc.hasNextLine();
		String item = "";
		item = sc.nextLine();
		if (item == "apple"){
			System.out.println("yes");
			//System.out.println(both.get(1) + both.get(8));
		}else {
			System.out.println("no");
		}
		
		//System.out.println(both.get(1) + both.get(9));
		
//		String item = sc.nextLine();
//		if (item == "apple" || item == "banana" || item == "cauliflower"|| item == "dragonfruit"|| item == "Elderberry"	|| item == "figs" || item == "Grapefruit" || item == "honeydew") {
//			System.out.println("Adding "+item+" to cart at ");
//		} else{
//			
//		}
//	}

//	public static String getItem(Scanner sc, String prompt, String item) {
//		System.out.print(prompt);
//		// read user entry
//		String s = sc.nextLine();
//		boolean isValid = false;
//		while (!isValid) {
//			if (!s.equalsIgnoreCase("apple") && !s.equalsIgnoreCase("banana") && !s.equalsIgnoreCase("cauliflower")
//					&& !s.equalsIgnoreCase("dragonfruit") && !s.equalsIgnoreCase("Elderberry")
//					&& !s.equalsIgnoreCase("figs") && !s.equalsIgnoreCase("grapefruit")
//					&& !s.equalsIgnoreCase("honeydew")) {
//				System.out.println("Sorry! we don't have those. Please try again.");
//				s = sc.nextLine();
//				isValid = false;
//			} else {
//				isValid = true;
//			}
//		}
//		return s;
	}

}
