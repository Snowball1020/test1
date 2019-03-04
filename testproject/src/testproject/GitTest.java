package testproject;

import java.util.*;
public class GitTest {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How many numbers would you like to compare??");

		int num = scn.nextInt();
		
		int[] numbers = new int[num];
		
		takeNum(numbers);

		System.out.println("the biggest number is: " + maxNum(numbers));
		System.out.println("the smallest number is: " + minNum(numbers));
		System.out.println("the sum of number is: " + sumNum(numbers));
		System.out.println("the multiply of number is: " + mulNum(numbers));
		System.out.println("the sum of multiply number and sum is: " + (sumNum(numbers) + mulNum(numbers)));

		
		
	}
		
	public static int[] takeNum(int[] n){
		
		
		for(int i=0;i<n.length;i++){
			System.out.println("type number " + (i+1));
			n[i]+= scn.nextInt();
		}
		
		
		return n;
	}
	
	
	
	public static int maxNum(int[]n) {
		
		int max = n[0];
		
		for(int i = 0; i<n.length; i++){
			if(n[i]>max){
				max = n[i];
			}
		}
		
		
		return max;
		
	}
	
	public static int minNum(int[]n) {
		
		int min = n[0];
		
		for(int i = 0; i<n.length; i++){
			if(n[i]<min){
				min = n[i];
			}
		}
		
		
		return min;
		
	}
	
	public static int sumNum(int[]n){
		int sum = 0;
		for(int i = 0; i<n.length; i++){
			sum += n[i];
		}
		return sum;
	}
	
	public static int mulNum(int[]n){
		int sum = 1;
		for(int i = 0; i<n.length; i++){
			sum *= n[i];
		}
		return sum;
	}


		
}
