/**
 * W1D1_Homework_Exercise3
 * @author Orgilmaa Mart
 */
public class CheckLeap {
	private boolean ch = false;
	
	public CheckLeap(int n){
		if(n < 0 || n == 0){
			throw new IllegalArgumentException("Year should be positive.");
		}else{
			if(n % 4 == 0 && n % 100 > 0 && n % 400 > 0){
				 ch = true;
			}
		}
	}
	
	public boolean check(){
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckLeap leap = new CheckLeap(2016);
		System.out.println("Is year 2016 leap -> "+leap.check());
		
		CheckLeap leap1 = new CheckLeap(2015);
		System.out.println("Is year 2015 leap -> "+leap1.check());
		
		CheckLeap leap2 = new CheckLeap(-2015);
		System.out.println("Is year -2015 leap -> "+leap2.check());
		
		CheckLeap leap3 = new CheckLeap(0);
		System.out.println("Is year 0 leap -> "+leap3.check());
	}

}
