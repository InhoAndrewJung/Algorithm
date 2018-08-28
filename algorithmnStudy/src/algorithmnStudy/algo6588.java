package algorithmnStudy;

import java.util.Scanner;

public class algo6588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[1000000];
		int temp = 0;
		while(true) {
			int i=0;
			temp = sc.nextInt();
			if(temp == 0) break;
			input[i] = temp;
			i++;
		}
		System.out.println(input[3]);
		
	}

}
