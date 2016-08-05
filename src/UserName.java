/**
 * W1D1_Homework_Exercise4
 * @author Orgilmaa Mart
 */
public class UserName {
	private String firstname;
	private String lastname;
	private String username;
	
	public UserName(String firstname, String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String create()
	{
		int x =(int)(Math.random()*1000);
		username = firstname.toLowerCase().charAt(0)+lastname.toLowerCase().substring(0,5)+x;
		return username;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserName name = new UserName("Kale","Artur");
		String key = name.create();
		System.out.println(key);
	}
}
