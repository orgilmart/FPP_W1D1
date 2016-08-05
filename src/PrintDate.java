import java.util.Date;
/**
 * W1D1_Homework_Exercise6
 * Orgilmaa Mart 
 */
public class PrintDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		String s = "Hello";
		
		System.out.printf("Today's weekday name is: %tA", d);
		System.out.printf("\nToday's time is: %tp", d);
		System.out.printf("\nToday's date is: %tm/%<td/%<tY", d);
		System.out.printf("\nHashcode is: %h", s);
	
	}
}
