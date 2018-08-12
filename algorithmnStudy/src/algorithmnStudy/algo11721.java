package algorithmnStudy;

import java.util.Scanner;

public class algo11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		String temp="";
		int inc = 0;
		
		int fullPrintCnt = input.length()/10;
		int remainPrintCnt = input.length()%10;
		
		for(int i=0; i<fullPrintCnt; i++) {
			System.out.println(input.substring(0+inc, 10+inc));
			inc += 10;			
		}
		System.out.println(input.substring(input.length()-remainPrintCnt, input.length()));
		

	}
}
