package algorithmnStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a = 0;
		int b = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		
		for(int i =0; i<T;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			queue.add(a*b/gcd(a,b));
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}

}
