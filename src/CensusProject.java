/**
 * W1D1_Homework_Exercise5
 * @author Orgilmaa Mart
 */
public class CensusProject {
	private final int CURRENT_POPULATION = 312132486;
	private int birth;
	private int death;
	private int newimm;
	private int add = 0;
	private int total = 0;
	
	public CensusProject(int n){
		if(n > 0){
			int yearsecond = n*365*24*60*60;

			birth = yearsecond / 10;
			death = yearsecond / 13;
			newimm = yearsecond / 50;
		}else if(n == 0){
			birth = 0;
			death = 0;
			newimm = 0;
		}else{
			throw new IllegalArgumentException("Year must be positive number.");
		}
		add = (birth + newimm)-death;
		total = CURRENT_POPULATION + add;
	}
	
	public int getBirth(){
		return birth;
	}
	
	public int getDeath(){
		return death;
	}
	
	public int getNewImm(){
		return newimm;
	}
	
	public int getAdd(){
		return add;
	}
	
	public int getTotal(){
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		CensusProject cp = new CensusProject(x);
		
		System.out.println(x+ " year birth is "+cp.getBirth());
		System.out.println(x+ " year death is "+cp.getDeath());
		System.out.println(x+ " year new immigrant is "+cp.getNewImm());
		System.out.println(x+ " year add is "+cp.getAdd());
		System.out.println(x+ " year total is "+cp.getTotal());
	}

}
