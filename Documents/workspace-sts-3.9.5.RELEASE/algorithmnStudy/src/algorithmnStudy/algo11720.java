package algorithmnStudy;

import java.util.Scanner;

public class algo11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		char[] input = sc.nextLine().toCharArray();
		int temp=0;
		
		for(int i=0; i<cnt; i++) {
			temp += Integer.parseInt(input[i]+"");
		}
		
		System.out.println(temp);
		

	}

}
