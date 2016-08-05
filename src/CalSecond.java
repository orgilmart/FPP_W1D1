import java.util.Scanner;
/**
 * W1D1_Homework_Exercise2
 * @author Orgilmaa Mart
 */
public class CalSecond {
	private int hour;
	private int minute;
	private int second;
	
	public CalSecond(int n){
		if(n < 0){
			throw new IllegalArgumentException("Second should be positve.");
		}else if(n == 0){
			hour = 0;
			minute = 0;
			second = 0;
		}else{
			hour = n/3600;
			minute = (n-(hour*3600))/60;
			second = n-hour*3600-minute*60;
		}
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int sec = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input second: ");
		sec = input.nextInt();
		System.out.println("You wrote: "+sec +" seconds");
		input.close();
		
		CalSecond cs = new CalSecond(sec);
		System.out.println("Hours are: "+cs.getHour());
		System.out.println("Minutes are: "+cs.getMinute());
		System.out.println("Seconds are: "+cs.getSecond());
		System.out.println("----------------------------");
		//test zero input
		CalSecond cs1 = new CalSecond(0);
		System.out.println("Hours are: "+cs1.getHour());
		System.out.println("Minutes are: "+cs1.getMinute());
		System.out.println("Seconds are: "+cs1.getSecond());
		System.out.println("----------------------------");
		//test negative input
		CalSecond cs2 = new CalSecond(-12500);
		cs2.getHour();
	}
}
