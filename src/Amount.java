/**
 *W1D1_Homework_Exercise1
 * @author Orgilmaa Mart
 */
public class Amount {
	private int amount;
	private int dollar;
	private int quarter;
	private int dime;
	private int nickel;
	private int pennie;
	
	public Amount(double amt){
		amount=(int)(amt*100);
		
		if(amt < 0){
			throw new IllegalArgumentException("Amount should be positive.");
		}else if(amt == 0){
			dollar = 0;
			quarter = 0;
			dime = 0;
			nickel = 0;
			pennie = 0;
		}else{
			dollar = amount/100;
			quarter = (amount-dollar*100)/25;
			dime = (amount - dollar*100 - quarter*25)/10;
			nickel = (amount - dollar*100 - quarter*25 - dime*10)/5;
			pennie = (amount - dollar*100 - quarter*25 - dime*10 - nickel*5);
		}
	}

	public int dollars(){
		return dollar;
	}
	
	public int quarters(){
		return quarter;
	}
	
	public int dime(){
		return dime;
	}
	
	public int nickels(){
		return nickel;
	}
	
	public int pennies(){
		return pennie;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 11.56;
		System.out.println("amount is "+d);
		
		Amount mnt = new Amount(d);
		System.out.println("dollars are "+mnt.dollars());
		System.out.println("quarters are "+mnt.quarters());
		System.out.println("dimes are "+mnt.dime());
		System.out.println("nickels are "+mnt.nickels());
		System.out.println("pennies are "+mnt.pennies());
		System.out.println("------------------------------");
		
		d = 0;
		System.out.println("amount is "+d);
		
		Amount mnt1 = new Amount(d);
		System.out.println("dollars are "+mnt1.dollars());
		System.out.println("quarters are "+mnt1.quarters());
		System.out.println("dimes are "+mnt1.dime());
		System.out.println("nickels are "+mnt1.nickels());
		System.out.println("pennies are "+mnt1.pennies());
		System.out.println("------------------------------");
		
		d=-11.56;
		System.out.println("amount is "+d);
		Amount mnt2 = new Amount(d);
		System.out.println(mnt2);

	}

}
