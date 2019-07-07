package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c", "d"};
		printArray(arr);
		System.out.println();
		printBackwards(arr);
		System.out.println();
		printOther(arr);
		System.out.println();
		printRand(arr);
		System.out.println();
		
		
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	public static void printArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	public static void printBackwards(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length-1 - i] + " ");
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printOther(String[] arr) {
		for(int i = 0; i < arr.length; i+= 2) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	public static void printRand(String[] arr) {
		Random rand = new Random();
		int derp = arr.length;
		int[] compare = new int[arr.length];
		int temp;
		
		int ree;
		for(int i = 0; i < arr.length;i ++) {
			compare[i] = i;
		}
		for(int i = 0; i < arr.length; i++) {
			ree = rand.nextInt(arr.length);
			temp = compare[derp - i - 1];
			compare[derp - i - 1] = compare[ree];
			compare[ree] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[compare[i]] + " ");
		}
	}
}
