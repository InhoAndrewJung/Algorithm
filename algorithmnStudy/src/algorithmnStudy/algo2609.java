package algorithmnStudy;

import java.util.Scanner;

public class algo2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//최대 공약수
		int gcd = gcd(a,b);
		System.out.println(gcd);
		//최소 공배수
		System.out.println(a*b/gcd);
	}
	
	public static int gcd(int a, int b) {
		if (b==0) return a;
		return gcd(b,a%b);
	}

}
