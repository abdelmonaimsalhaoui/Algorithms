/*
 * The 3*n+1 Problem
 * Written By : SALHAOUI Abdelmonaim
 * 2019-2020
 */

package the_3n_plus_1_problem;

public class the_3n_plus_1_problem {
	
	private static  int sum = 0;

	public static void main(String[] args) {
		
		int max  = 0;
		
		for(int i=900;i<=1000;i++) {
			sum=0;
			algo(i);	
			if(sum>max) {
				max = sum;
			}
			
		}
		System.out.println(max);
		
	}
	
	public static int algo(int n) {						
				
		if(n==1) {
			sum++;
			return n;
		}
		
		if(n%2!=0) {
			sum++;
			return algo(3*n+1);
		}
		
		else {
			sum++;
			return algo(n/2);
		}
				
	}

}
