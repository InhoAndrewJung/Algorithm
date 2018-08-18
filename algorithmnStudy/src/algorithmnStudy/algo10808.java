package algorithmnStudy;

import java.util.Scanner;

public class algo10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] arr = S.toCharArray();
		int[] ans = new int[26];

		for(int i =0; i<S.length();i++) {
			ans[(int)arr[i]-97] +=1;
		}
		
		for(int i=0; i<26;i++) {			
			System.out.print(ans[i]+" ");
		}
		

	}

}
