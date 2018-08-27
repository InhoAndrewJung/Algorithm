package algorithmnStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class algo1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Queue q = new LinkedList();
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			q.add(sc.nextInt());
		}
		
		Set filter = new TreeSet();
		int a = 2;
		
		
		filter.add(0); filter.add(1);
		int temp=0;
		while(a*2 < 1001) {
			temp = a * 2;
			filter.add(temp);
			a++;
		}
		a = 2;
		while(a*3 < 1001) {
			temp = a * 3;
			filter.add(temp);
			a++;
		}
		a = 2;
		while(a*5 < 1000) {
			temp = a * 5;
			filter.add(temp);
			a++;
		}
		a = 2;
		while(a*7 < 1001) {
			temp = a * 7;
			filter.add(temp);
			a++;
		}

		for(int i=0; i<N; i++) {
			if(!filter.contains(q.poll())) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	

}
