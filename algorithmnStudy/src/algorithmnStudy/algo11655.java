package algorithmnStudy;

import java.util.Scanner;

public class algo11655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] arr = S.toCharArray();
		char[] result = new char[S.length()];
		
		for(int i=0; i<S.length(); i++) {
			if((int)arr[i]>=(int)'A'&& (int)arr[i]<=(int)'Z') {
				int temp = ((int)arr[i]+13);
				result[i] = (char)(temp>90? temp-26 : temp);
			}else if((int)arr[i]>=(int)'a'&& (int)arr[i]<=(int)'z'){
				int temp = ((int)arr[i]+13);
				result[i] = (char)(temp>122? temp-26 : temp);
			}else {
				result[i] = arr[i];
			}
		}
		
		for(int i=0; i<result.length;i++)
		System.out.print(result[i]);

	}

}
