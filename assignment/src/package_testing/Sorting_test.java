package package_testing;

import java.util.ArrayList;

import DataStructures.Sorting;
import entity_package.Credits;
import entity_package.Movie;

public class Sorting_test {
	public static void test_bubbleSort(ArrayList<Movie> movies, ArrayList<Credits> credits) {
		Sorting.bubbleSortMovies(movies);
		Sorting.bubbleSortCredits(credits);
	}
	
	public static void test_quickSort(ArrayList<Movie> movies, ArrayList<Credits> credits) {
		Sorting ss = new Sorting();
		ss.QuickSortMovie(movies);
	}
	
	public static void test_insertSort(ArrayList<Movie> movies, ArrayList<Credits> credits) {
		Sorting.insertSortMovies(movies);
		Sorting.insertSortCredits(credits);
	}
}
