package binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first+last)/2;
		
		while(first <= last) {
			if(arr[mid] < key)
				first = mid + 1;
			else if(arr[mid] == key) {
				System.out.println(key+" is found at position "+mid);
				break;
			}
			else
				last = mid - 1;
			
			mid = (first+last)/2;
		}
		
		if(first > last)
			System.out.println("Element not found");
	}
	
	public static void main(String[] args) {
		
		final Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of the elements:");
		final int length = sc.nextInt();
		final int[] elements = new int[length];
		
		System.out.println("Enter the elements:");
		for (int i = 0; i < length; i++) {
			elements[i] = sc.nextInt();
		}

		System.out.println("Enter the element to find:");
		int key = sc.nextInt();
		
		Arrays.sort(elements);
		binarySearch(elements,0,elements.length-1,key);
		
		sc.close();
	}

}
