package edu.bu.datastructures.list;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int arraySize = 1000;
		for (int i = 0; i < arraySize; i++) {
			list.add(new Random().nextInt(arraySize));
		}
		Collections.sort(list); // sort as we need it later for binary search
		Integer[] a = new Integer[arraySize];
		list.toArray(a); // creates an array with size “arraySize”

		BinarySearch ls = new BinarySearch();
		int low = 0;
		int high = a.length - 1;
		
		long t1 = System.currentTimeMillis();
		ls.findBS(a, 10,low,high);
		long t2 = System.currentTimeMillis();
		
		long time = t2 - t1;

	}

	public Integer findBS(Integer[] data, int key,int low,int high) {
		if(low > high) {
			return -1;
		}
		int mid = (low+high) / 2;
		if(data[mid] == key) {
			return mid;
		}else if(data[mid] < key){
			return findBS(data,key,mid+1,high);
					}
		else {
			return findBS(data,key,low,mid-1);
		}
		
	}
}
