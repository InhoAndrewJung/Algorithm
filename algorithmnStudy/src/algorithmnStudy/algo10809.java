package algorithmnStudy;

import java.util.Scanner;

public class algo10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] arr = S.toCharArray();
		int[] result = new int[26];
		
		for(int i=0; i<26; i++) {
			result[i] = -1;
		}
		for(int i=0; i<S.length(); i++) {
			if(result[(int)arr[i]-97] == -1)
				result[(int)arr[i]-97] = i;
		}
		
		for(int i=0; i<26; i++) {
			System.out.print(result[i]+" ");
		}

	}

}
