package multithreading;

public class FindTotal {
	
	public int findSum(int var){
		
		int sum = 0;
		
		for(int i = 1;i <= var;i++){
			sum = sum +i;
		}
		
		return sum;
	}
	
}
