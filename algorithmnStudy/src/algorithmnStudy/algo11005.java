package algorithmnStudy;

import java.util.Scanner;

public class algo11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int B = sc.nextInt();
	
		sc.close();
		
		System.out.println(convert(N, B));
	
	}

	private static String convert(int n, int b) {
		
		String result = "";
		
		while(n > 0) {
			if(n % b < 10) {
				result = (n % b) + result; //오른쪽에서 왼쪽으로 저
				n = n/b;
			} else {
				int temp = (n % b) + 55; //A의 아스키 코드는 65 이므로 55를 더해
				result = (char)temp + result;
				n = n/b;
			}
		}
		
		return result;
	}

}
