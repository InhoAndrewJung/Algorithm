package algorithmnStudy;

import java.util.Scanner;

public class algo10824 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String D = sc.next();
		sc.close();
		String temp1 = A+B;
		String temp2 = C+D;
		
		long rlt = Long.parseLong(temp1) + Long.parseLong(temp2);
		System.out.println(rlt);
		
		

	}

}
