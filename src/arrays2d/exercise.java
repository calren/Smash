package arrays2d;

import java.util.ArrayList;

public class exercise {

	/*
	 * In this exercise, we create a 2D array that holds songs titles and the
	 * corresponding artist
	 *
	 * After initialization, the array would look something like this:
	 * [Taylor Swift}, [Drake],         [Beyonce],       [Coldplay], [Taylor Swift]
	 * [Blank Space],  [Hotline Bling], [Single Ladies], [Yellow],   [Love Story]
	 * 
	 * There's also a method called prettyPrint2DArray available for you
	 */
	public static void main(String[] args) {
		String[][] songs = new String[2][5];
		songs[0][0] = "Taylor Swift";
		songs[1][0] = "Blank Space";

		songs[0][1] = "Drake";
		songs[1][1] = "Hotline Bling";

		songs[0][2] = "Beyonce";
		songs[1][2] = "Single Ladies";

		songs[0][3] = "Coldplay";
		songs[1][3] = "Yellow";

		songs[0][4] = "Taylor Swift";
		songs[1][4] = "Love Story";
		
		
		// TODO add your favorite song to our 2D array
		// follow the same format of the other songs, with the Artist and the Song Title

		System.out.println("Song list after adding my favorite song");
		prettyPrint2DArray(songs); // this should print out the songs, now with your favorite song added
		
		
		// TODO use a for loop to print out all the Taylor Swift songs
		System.out.println("Best Taylor Swift songs:");
		
		// TODO print out all the artists without any repeats
		// So we want to print out Taylor Swift, Drake, Beyonce, Coldplay
		// but we don't want to print out Taylor Swift twice
		// It could be helpful to use ArrayList<String> here
		System.out.println("Artists:");
		ArrayList<String> artists = new ArrayList<String>();
		for (int i = 0; i < songs[0].length; i++) {
			if (!artists.contains(songs[0][i])) {
				artists.add(songs[0][i]);
			}
		}
		System.out.println(artists.toString());

		

//		for (int i = 0; i < songs.length; i++) {
//			if (songs[0][i] == "Taylor Swift") {
//				System.out.println(songs[1][i]);
//			}
//		}
	}
	
	private static void prettyPrint2DArray(String[][] array) {
		for(int i=0; i<array.length; i++){
	        for(int j=0; j<array[0].length; j++){
	            System.out.print(String.format("%20s", array[i][j]));
	        }
	        System.out.println("");
	    }
	}

}
