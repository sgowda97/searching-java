package linear;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int element) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element)
				return i;
		}
		
		return -1;
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

		System.out.println();
		System.out.println(key + " is found at position "+linearSearch(elements, key));

		sc.close();
	}
}
