package algorithmnStudy;

import java.util.LinkedList;
import java.util.Scanner;

public class algo1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> result = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			list.add(i);
			
			
		}
		
		int idx = 0; 
		while(!list.isEmpty()) {
			idx = (idx+M-1) % list.size();
			result.add(list.remove(idx));
			
		}
		String ans = result.toString();
		
		ans = ans.replaceAll("\\[","<");
		ans = ans.replaceAll("\\]", ">");
		System.out.println(ans);
		
	}
}
