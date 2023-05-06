// The methods in this package are adapted from the code provided with:
//   Java Foundations (2nd & 3rd ed) by  Lewis, DePasquale, & Chase
//   Algorithms (4th ed) by Sedgewick & Wayne

package projects.project7sorting.csc205;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

	// Helper methods
	// These operations will occur multiple times in our sorting methods,
	//   so we add methods for them here
	private static <T extends Comparable<T>> boolean less_than(T a, T b) {
		return (a.compareTo(b) < 0);
	}
	private static <T extends Comparable<T>> boolean less_than_equal(T a, T b) {
		return (a.compareTo(b) <= 0);
	}
	private static <T extends Comparable<T>> boolean greater_than(T a, T b) {
		return (a.compareTo(b) > 0);
	}
	private static void swap(Object[] a, int ii, int jj) {
		Object swap = a[ii];
		a[ii] = a[jj];
		a[jj] = swap;
	}
	public static <T extends Comparable<T>> 
	boolean isSorted(T[]data){
		return isSorted(data, 0, data.length-1);
	}
	public static <T extends Comparable<T>> 
	boolean isSorted(T[]data, int min, int max){
		for (int ii=min+1; ii<=max; ii++) {
			if (less_than(data[ii], data[ii-1]))
				return false;
		}
		return true;
	}

	public static <T extends Comparable<T>> 
	void selectionSort(T[] data) {
		selectionSort(data, 0, data.length-1);
	}

	public static <T extends Comparable<T>> 
	void selectionSort(T[] data, int min, int max) {
		int indexOfSmallest;		// Index of the smallest element this pass
		
		// Make sure that min isn't too small and max isn't too big
		min = Math.max(min,  0);
		max = Math.min(max, data.length-1);
		
		// next is the starting point for each pass 
		// it is the index of where the smallest element will go
		for(int next=min; next <= max; next++) {
			indexOfSmallest = next;
			for(int scan=next+1; scan <= max; scan++) {
				if ( less_than(data[scan], data[indexOfSmallest])) {
					indexOfSmallest = scan;
				}
			}
			swap(data, indexOfSmallest, next);
		}
	}
	
    public static <T extends Comparable<T>> 
	void insertionSort(T[] data) {
    	insertionSort(data, 0, data.length-1);
    }

    public static <T extends Comparable<T>> 
	void insertionSort(T[] data, int min, int max) {
    	int start = Math.max(min,  0);
    	int end = Math.min(max,  data.length-1);
    	
    	// Current is the length of the sorted sub-list at the start of the array
    	for (int current=start; current<=end; current++) {
    		int position = current;
    		
    		// shift larger values to the right
    		while (position > start && greater_than(data[position-1], data[position])) {
    			swap(data, position, position-1);
    			position --;
    		}
    	}
    }

    public static <T extends Comparable<T>> 
	void bubbleSort(T[] data) {
    	bubbleSort(data, 0, data.length-1);
    }
    public static <T extends Comparable<T>> 
	void bubbleSort(T[] data, int min, int max) {
    	
    	int start = Math.max(min,  0);
    	int end = Math.min(max,  data.length-1);
    	
    	int position, scan;
    	
    	// position is the "stopping point" point for each pass
    	for (position=end; position>=start; position--) {
    		for (scan=0; scan<position; scan++) {
    			if(greater_than(data[scan], data[scan+1])) {
    				swap(data, scan, scan+1);
    			}
    		}
    	}
    }
    
	public static <T extends Comparable<T>>
	void mergeSort(T[] data) {
		mergeSort(data, 0, data.length-1);
	}

	private static <T extends Comparable<T>>
	void mergeSort(T[] data, int min, int max) {
		if (min < max) {
			int mid  = min + ((max - min) / 2);
			mergeSort(data, min, mid);
			mergeSort(data, mid+1, max);
			merge(data, min, mid, max);
		}
	}
	
	private static <T extends Comparable<T>> 
	void merge(T[] data, int min, int mid, int max) {
		
		T[] temp = (T[]) (new Comparable[data.length]);   // temp array
		
		//      Half 1            Half 2
		// [min| .... |mid][mid+1| .... |max]
		int first1 = min,   last1 = mid;    // endpoints of the first subarray
		int first2 = mid+1, last2 = max;    // endpoints of the second subarray
		int index = first1;    // index into the temp array
		
		// Copy the smaller item from each subarray until one of the subarrays is empty
		
		// While both subarray have at least one item left
		while ( (first1 <= last1) && (first2 <= last2) ) {
			if (less_than(data[first1], data[first2])) {
				// Move first 1 to the temp array
				temp[index] = data[first1];
				first1++;
			}
			else {
				// Move first2 to the temp array
				temp[index] = data[first2];
				first2++;
			}
			index++;  // Move the index of the next available cell the temp array
		}
		
		// At this point one the subarrays is empty
		// Copy the remaining elements to temp - only one of these loops will run
		while (first1 <= last1) {
			temp[index] = data[first1];
			first1++;
			index++;
		}
		while (first2 <= last2) {
			temp[index] = data[first2];
			first2++;
			index++;
		}
		
		// Copy the merged data into the original array
		for (index=min;index<=max;index++) {
			data[index] = temp[index];
		}
	}

	public static <T extends Comparable<T>> 
	void quickSort(T[] data) {
		quickSort(data, 0, data.length-1);
	}

	private static <T extends Comparable<T>> 
	void quickSort(T[] data, int min, int max) {
		if (min < max) {
			// Create a partition
			int indexOfPartition = partition(data, min, max);
			
			// sort the left partition (lower values)
			quickSort(data, min, indexOfPartition - 1);
			
			// sort the right partition (higher values)
			quickSort(data, indexOfPartition + 1, max);
		}
	}
	
	private static <T extends Comparable<T>> 
	int partition(T[] data, int min, int max) {
		T partitionElement; 
		int left = Math.max(min,  0);
		int right = Math.min(max,  data.length-1);
		
		// Use the middle data as the partition element
		int middle = min + ((max - min) / 2);
		partitionElement = data[middle];
		// move the middle element out of the way for now
		swap(data, middle, min);

		while (left < right) {
			// search for an element that is > than the partition element 
			while ((left < right) && (less_than_equal(data[left], partitionElement))) {
				left ++;
			}
			// search for an element that is < the partition element
			while (greater_than(data[right], partitionElement)) {
				right--;
			}
			// swap the elements at left & right
			if (left < right) {
				swap(data, left, right);
			}
		}
		
		// move the partition element back into place
		// right will be the index of the partition element
		swap(data, min, right);
		return right;
	}
	
	// Project 7
	
	public static <T extends Comparable<T>> 
	void sort(T[] data) {
		// To be completed as part of Programming Project
	}
	
	public static <T extends Comparable<T>> 
	void cutoffQsort(T[] data) {
		// To be completed as part of Programming Project
	}

	private static <T extends Comparable<T>> 
	void cutoffQsort(T[] data, int min, int max) {
		// To be completed as part of Programming Project
	}
	
	public static <T extends Comparable<T>> 
	List<T> closestPair(T[] data) {
		// To be completed as part of Programming Project
		return null;
	}
	
	public static <T extends Comparable<T>> 
	List<T> firstN(T[] data, int n) {
		// To be completed as part of Programming Project
		return null;
	}
}
