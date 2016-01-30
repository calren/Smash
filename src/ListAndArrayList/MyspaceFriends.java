package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyspaceFriends {

	private static List<String> friends = new ArrayList<>();
	
	public static void main(String[] args) {
		
		// 1. add 5 friends to your friends list : Alice, Bob, Carol, Darren, Ed
		System.out.println(friends); // should print [Alice, Bob, Carol, Darren, Ed]
		
		// 2. Implement the unfriend function so that when you pass in a name,
		// it will remove that name from the list friends
		unfriend("Bob");
		System.out.println(friends); // should print [Alice, Carol, Darren, Ed]
		
		// 3. Implement the isMyFriend function so that when you pass in a name
		// it will return whether that person is your friend
		System.out.println(isMyFriend("Bob")); // should print false
		System.out.println(isMyFriend("Alice")); // should print true
		
		// 4. Implement addBestFriend so that when you pass in a name, 
		// it will put that name in the front of the list
		addBestFriend("Zac");
		System.out.println(friends); // should print [Zac, Alice, Carol, Darren, Ed]
		
		// 5. Modify addFriend so that it doesn't add someone if they're already on the list
		addFriend("Alice");
		System.out.println(friends); // should still print [Zac, Alice, Carol, Darren, Ed]	
	}
	
	private static void addFriend(String name) {
		friends.add(name);
		// TODO don't add same friend
	}
	
	// removes the String 'name' from friends
	private static void unfriend(String name) {
		// TODO
	}
	
	// returns true if name is in friends , false otherwise
	private static boolean isMyFriend(String name) {
		// TODO 
	}
	
	// adds the String name to the front of the friends list
	private static void addBestFriend(String name) {
		// TODO
	}
	
	
}
