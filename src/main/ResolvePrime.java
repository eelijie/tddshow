package main;

import java.util.ArrayList;
import java.util.List;

public class ResolvePrime {
	
	private ResolvePrime(){
		
	}
	
	private static final int FIRST_PRIME = 2;

	public static List<Integer> resolvePrime(int resolvedNumber){
		
		ArrayList<Integer> primes=new ArrayList<>();
		
		if (resolvedNumber<2){
			throw new ArithmeticException("非法输入");
		}
		
		int leftNumber=resolvedNumber;

		while(leftNumber>=FIRST_PRIME){
			leftNumber=extractOnePrime(primes, leftNumber);
		}
				
		return primes;
		
	}

	private static int extractOnePrime(ArrayList<Integer> primes, int resolvedNumver) {
		int j;
		for(int i=FIRST_PRIME;i<=resolvedNumver;i++){
			if (resolvedNumver % i == 0){
				primes.add(i);
				return resolvedNumver/i;
			}
		}
		return -1;
	}

}
