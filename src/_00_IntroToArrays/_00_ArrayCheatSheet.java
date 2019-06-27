package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] derp = {"a","s","d","f","j"};
		//2. print the third element in the array
			System.out.println(derp[2]);
		//3. set the third element to a different value
			derp[2] = "k";
		//4. print the third element again
			System.out.println(derp[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < derp.length; i++) {
			derp[i] = "REEEEEEEEEE";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < derp.length; i++) {
			System.out.println(derp[i]);
		}
		//7. make an array of 50 integers
int[] rand = new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random herp = new Random();
for(int i = 0; i < rand.length; i++) {
	rand[i] = herp.nextInt(100);
}
		//9. without printing the entire array, print only the smallest number on the array
int min = rand[0];
for(int i = 0; i < rand.length; i++) {
	if (min > rand[i]) {
		min = rand[i];
	}
}
System.out.println("The smallest number in the random array is: " +min);
		//10 print the entire array to see if step 8 was correct

for(int i = 0; i < rand.length; i++) {
	System.out.println(rand[i]);
}

		//11. print the largest number in the array.
int max = rand[0];
for(int i = 0; i < rand.length; i++) {
	if (max < rand[i]) {
		max = rand[i];
	}
}
System.out.println("The largest number in the random array is: " +max);
		//12. print only the last element in the array
System.out.println(rand[rand.length - 1]);
	}
}
