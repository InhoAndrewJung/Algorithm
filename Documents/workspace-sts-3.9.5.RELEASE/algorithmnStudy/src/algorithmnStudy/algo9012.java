package algorithmnStudy;

import java.util.Scanner;
import java.util.Stack;

public class algo9012 {
static int flag = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for(int i=0; i<T; i++) {
			Stack<String> stack = new Stack<>();
			
			String input = sc.nextLine();
			char[] arr = input.toCharArray();

			for(int k=0; k<arr.length;k++) {				
				if(arr[k] == '(') stack.push("(");
				else {
					if(stack.isEmpty()) {
						System.out.println("NO");
						flag = 1;
						break;
					} else stack.pop();
				}				
			}
			if(flag == 0) {
			if(stack.empty()) System.out.println("YES");
			else System.out.println("NO");
			}
			flag = 0;
			
		}
	}

}
