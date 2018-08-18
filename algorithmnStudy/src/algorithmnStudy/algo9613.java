package algorithmnStudy;

import java.util.Scanner;

public class algo9613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] inputArr = new int[101];
		for(int i=0; i<t; i++) {
			long gcdSum = 0;
			int n = sc.nextInt();
			
			for(int i1=0; i1<n; i1++) {
				inputArr[i1] = sc.nextInt();
			}
			
			for(int k=0; k<n-1;k++) {
				for(int j=k+1;j<n;j++) {
					
					gcdSum += gcd(inputArr[k], inputArr[j]);
				}
			}
			
			System.out.println(gcdSum);
		}
	}
	
	public static long gcd(int a, int b) {
		if(b == 0) return  a;
		return gcd(b, a%b);
	}

}
