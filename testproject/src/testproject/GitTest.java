package testproject;

public class GitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello();
		Dance(3);
		Multiply(2.5,5.5);
		
	}

	public static void Hello(){
		System.out.println("Hi Git This is from yuki");
		System.out.println("Can you hear me? Again");

	}
	
	public static void Dance(int times){
		
		System.out.println("We dance for " + times + "times today" );
		
	}
	
	public static double Multiply(double d, double e){
		double x = d * e;
		return x;
	}
	
	
}
