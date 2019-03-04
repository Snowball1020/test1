package testproject;

public class toString {

	String model;
	int year;
	double price;
	
	toString(String m, int y, double p){
		model = m;
		year = y;
		price = p;
			
		
	}
		
	public String toString(){
		return String.format("Model: %s Issued Year: %d Price: %.2f",model,year,price);
		
	}
	
	
}
