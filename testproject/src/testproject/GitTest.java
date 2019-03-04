package testproject;

import java.util.*;
public class GitTest {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toString str = new toString("New",1993,20.5);
		System.out.println(str);
		

		Animal anm = new Dog();
		anm.size(25, 2);
		Dog doggy = new Dog();
		doggy.run();
		
		Human human = new Human("Yuki",25,"Male");
		Human human2 = new Human("Sena",24,"Female");
		Human human3 = new Human("Ken",24,"Female","Japan");

		human.Hello();
		human2.Hello();
		human3.Hello();
		
		System.out.println("How many numbers would you like to compare??");

		int num = 0;
		do{
			num = scn.nextInt();
			if(num <= 1){
				System.out.println("the number has to be more than 2");
			}else if(num >=11){
				System.out.println("this system only takes up to 10 numbers");
			}
		}while(num <= 1 || num >= 11);
		
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
