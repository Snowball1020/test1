package testproject;

public class Human {

	private String name;
	private int age;
	private String gender;
	private String country;
	
	Human(String n, int a, String g){
		this.name = n;
		this.age = a;
		this.gender = g;
		
	}
	
	Human(String n, int a, String g, String c){
		this.name = n;
		this.age = a;
		this.gender = g;
		this.country = c;
		
	}

	
	void Hello(){
		if(this.country==null){
			System.out.println("Hi, I'm " + this.name + " My age is " + this.age + " and my gender is " + this.gender );			
		}else{
			System.out.println("Hi, I'm " + this.name + " My age is " + this.age + " my gender is " + this.gender + " and i am from " + this.country);						
		}
	}
		
	
}
