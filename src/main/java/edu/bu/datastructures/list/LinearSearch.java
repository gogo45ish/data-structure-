package edu.bu.datastructures.list;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int arraySize = 1000;
		for (int i = 0; i < arraySize; i++) {
			list.add(new Random().nextInt(arraySize));
		}
		Collections.sort(list); // sort as we need it later for binary search
		Integer[] a = new Integer[arraySize];
		list.toArray(a); // creates an array with size “arraySize”

		LinearSearch ls = new LinearSearch();
		ls.find(a, 1000);

	}

	public Integer find(Integer[] data, int key) {
		int i;
		for (i = 0; i < data.length - 1; i++) {
			if (data[i] == key) {
				return i;
			}
		}
		return null;
	}
}
