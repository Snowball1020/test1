package testproject;

import java.util.*;
public class GitTest {

	static Scanner scn = new Scanner(System.in);

	static String x;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("what is your name??");
		getInput();
		askTime(x);
	}
		
	
	public static void getInput(){
		
		x = scn.nextLine();
		System.out.println("Welcome " + x + " How are you doing today??");
	}
		
	
	public static void askTime (String x){
		System.out.println("so, " + x + " what is your plan for tonight??");
	}
	
}
