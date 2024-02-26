package Mission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Mission12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇게임? ");
		int game = sc.nextInt();
		
		// 번호 생성
		for (int i = 0; i < game; i++) {
			HashSet<Integer> lotto = new HashSet<Integer>();
			while(lotto.size() < 6) {
				int num = (int) (Math.random()*45+1);
				lotto.add(num);
			}
			
			ArrayList<Integer> arr = new ArrayList<Integer>(lotto);
			int res = 0;
			for (int j = 0; j < arr.size(); j++) {
				res = arr.get(j);
			}
			Collections.sort(arr);
			System.out.println("["+i+" 게임]"+arr);
		}
		sc.close();
	}
}