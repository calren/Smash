package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class MySpotify {
	
	/*
	 * Suppose we have a program that keeps track of all the songs we play on Spotify
	 * 
	 * We have an arrayList named songs, and it contains all the songs we've played
	 * 
	 * We also have an integer array named numberOfTimesPlayed that tells us how many times
	 * we've played each song
	 * 
	 * In the example below, "Hotline Bling" was played 5 times, "Blank Space" was played 12 times
	 * "Single Ladies" was played 6 times, and so on.
	 * 
	 * There are 2 TODOs below that we want to complete
	 */
	public static void main(String[] args) {
		
		List<String> songs = new ArrayList<>();
		songs.add("Hotline Bling");
		songs.add("Blank Space");
		songs.add("Singles Ladies");
		songs.add("Stitches");
		songs.add("Hello");
		
		int[] numberOfTimesPlayed = {5, 12, 6, 20, 10};
		
		// TODO #1
		// print out all the songs that startwith H
		// use a for-each loop for simplicity
		// http://interactivepython.org/runestone/static/JavaReview/ListBasics/listLoop.html
		for (String s: songs) {
			if (s.startsWith("H")) {
				System.out.println(s);
			}
		}
		
		// TODO #2
		// print out all the songs that have been played 10 or more times
		for (int i = 0; i < songs.size(); i++) {
			if (numberOfTimesPlayed[i] >= 10) {
				System.out.println(songs.get(i));
			}
		}
	}
}
