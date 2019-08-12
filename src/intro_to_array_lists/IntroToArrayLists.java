package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> hi = new ArrayList<String>();
		//2. Add five Strings to your list
		hi.add("hi");
		hi.add("hello");
		hi.add("hellow");
		hi.add("helpo");
		hi.add("hi mommy");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0;i<hi.size();i++) {
			System.out.println(hi.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s : hi) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0;i<hi.size();i++) {
			if(i==1||i==3||i==5||i==7||i==9) {
				System.out.println(hi.get(i));
			}
			
		}
		//6. Print all the Strings in reverse order.
		for(int i = hi.size()-1;i>-1;i--) {
			System.out.println(hi.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0;i<hi.size();i++) {
			if(hi.get(i).contains("e")) {
				System.out.println(hi.get(i));
			}
			
		}
	}
}
