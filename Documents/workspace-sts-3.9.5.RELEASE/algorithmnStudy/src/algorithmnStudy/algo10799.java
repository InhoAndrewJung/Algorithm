package algorithmnStudy;

import java.util.Scanner;

public class algo10799 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String processedInput = input.replaceAll("\\(\\)", "L");
		char[] arr = processedInput.toCharArray();
		
		int barCnt=0;
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == '(') {
				barCnt++;
			} else if(arr[i] == ')') {
				barCnt--;
				result += 1;
			} else {
				result += barCnt;
				
			}
		}
		System.out.println(result);
	}

}
