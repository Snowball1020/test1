package testproject;

abstract public class Animal {

	void voice(){
	};
	
	void size(int height, int weight){
		System.out.println(height * weight);
	};
	
}

class Dog extends Animal {
	
	void voice(){
		System.out.println("Bow Bow");
		
	}
	
	void run(){
		System.out.println("Dog is running fast");
	}
	
	
	
}

