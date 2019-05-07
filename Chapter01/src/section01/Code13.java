package section01;

import java.util.Scanner;

public class Code13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		
		// 먼저 해당 구간을 붙여 정수를 만들고
		// 그것이 소수인지 판단한 후,
		// 내가 갖고있는 max보다 큰지 판단하면 된다.
		
		for(int i=0; i<n; i++) {
			// 구간의 끝점인 j은 i보다 앞에 있을 수 없으므로 i부터 시작
			for(int j=i; j<n; j++) {
				
			}
		}
		

	}
}
