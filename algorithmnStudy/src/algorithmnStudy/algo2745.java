package algorithmnStudy;

import java.util.Scanner;

public class algo2745 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int B = sc.nextInt(); //n은b 진법 수
		
		System.out.println(convert(N, B));
	}

	private static int convert(String n, int b) {

		char[] store = n.toCharArray();
		int size = store.length;
		
		int result = 0;
		int M; //10의 제곱수를 표현하기 위한 것
	
		for(int i = 0; i < size; i++) {
			if(store[i] >= '0' && store[i] <='9') {
				M = (int) Math.pow(b, size - (i + 1));
				result = result + (store[i] -'0') * M;
			} else {
				M = (int) Math.pow(b,  size- (i + 1));
				result = result + (store[i] - 'A' + 10) * M;
			}
		}
		
		return result;
	}

}
