package main_package;

import csv_read_package.CSV_READ;
import entity_package.Credits;
import package_testing.Sorting_test;

import java.util.ArrayList;

import DataStructures.Stack;
import DataStructures.BinaryTreeMovies;
import DataStructures.LinkListGenric;

public class program {

	public static void main(String[] args) {
		System.out.println("*** reading CSV ** credits into link list ***");
		LinkListGenric<Credits> creditsList =	CSV_READ.readCsvBufferReaderCredits("tmdb_5000_credits.csv");
		System.out.println("***reading CSV ** credits into linklist end ***\n\n");
		
		///getting tmdb_5000_movies.csv to binarytree of movies
		System.out.println("*** reading CSV ** movies into binary tree ***");
		BinaryTreeMovies moviesBTree =	CSV_READ.readCsvBufferReaderMovie("tmdb_5000_movies.csv");
		System.out.println("*** reading CSV ** movies into binary tree end ***");

		System.out.println("test case bubble sort ");
		Sorting_test.test_bubbleSort(moviesBTree.toArray(), creditsList.toArray());
		System.out.println("test case bubble sort end\n\n");
		
		System.out.println("test case quick sort ");
		Sorting_test.test_quickSort(moviesBTree.toArray(), creditsList.toArray());
		System.out.println("test case quick sort end");
		
		System.out.println("test case insert sort ");
		Sorting_test.test_insertSort(moviesBTree.toArray(), creditsList.toArray());
		System.out.println("test case insert sort end\n\n");
		
		
		///////// Stack check //////////
		Stack<Credits> stack = new Stack<Credits>();
		ArrayList<Credits> arrayList = creditsList.toArray();
		for(int i = 0; i < arrayList.size(); i++) {
			stack.push(arrayList.get(i));
		}
	}

}
