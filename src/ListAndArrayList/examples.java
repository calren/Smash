package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class examples {

	public static void main(String[] args) {
		arrayListFunctions();
	}

	/*
	 * forgetting that set replaces the item at the index
	 *
	 * forgetting that remove at an index moves all items that were to the right
	 * of that index left one index
	 *
	 * forgetting that add at an index moves everything that was at the index
	 * and greater to the right one index
	 *
	 * incrementing an index when looping through a list even though you removed
	 * an item from the list
	 *
	 * using nameList[0] instead of nameList.get(0).
	 *
	 * using nameList.length instead of nameList.size() to get the number of
	 * elements in a list
	 */

	public static void arrayListFunctions() {
		List<String> myStrings = new ArrayList<String>();
		myStrings.add("this");
		myStrings.add("is");
		myStrings.add("a bunch of strings");
		myStrings.add("of");
		myStrings.add("strings");
		System.out.println(myStrings.toString());
		myStrings.set(3, "test");
		System.out.println(myStrings.toString());
		myStrings.remove(3);
		System.out.println(myStrings.toString());
	}

	/*
	 * int size() returns the number of elements in the list
	 *
	 * boolean add(E obj) appends obj to the end of the list and returns true
	 *
	 * void add(int index, E obj) moves any current objects at index or beyond
	 * to the right (to a higher index) and inserts obj at the index
	 *
	 * E get(int index) returns the item in the list at the index
	 *
	 * E set(int index, E obj) replaces the item at index with obj
	 *
	 * E remove(int index) removes the item at the index and shifts remaining
	 * items to the left (to a lower index)
	 */

}
