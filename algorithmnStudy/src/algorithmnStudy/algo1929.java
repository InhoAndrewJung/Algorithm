package algorithmnStudy;

import java.util.Scanner;

public class algo1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		boolean[] filter = new boolean[max+1]; //소수가 아니면   true
		
		for(int i=min; i<=max; i++) {//최소부터 최대까지 
			if(i == 1) filter[i] = true;//1은 소수아닌것 처리 
			int mmax = (int)Math.sqrt(i)+1;//에라토스테네스의 체
			for(int j=2; j<mmax; j++) {//자신의 제곱근 이전까지 계산 
				if(i%j == 0) {//나누어지면(소수가 아니면) 
					filter[i] = true;
					break;
				}
			}
			
			if(filter[i] == false) System.out.println(i);
		}
		
		
		
		
	}

}
