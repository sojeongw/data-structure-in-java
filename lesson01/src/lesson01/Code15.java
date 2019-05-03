package lesson01;

import java.util.Scanner;

public class Code15 {
public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		// 일단 배열의 크기를 입력받는다.
		int n = kb.nextInt();
		int[] data= new int[n];
		
		for(int i=0; i<n; i++) {
			// 배열에 바로 넣지 않고 임시로 갖고 있다가 비교한다.
			int tmp = kb.nextInt();
			
			// 배열 데이터가 i개라면 인덱스는 i-1이므로 
			int j=i-1;
			
			// tmp보다 작거나 같은 애가 나타날 때까지
			while(j>=0 && data[j] > tmp) {
				// data j를 뒤로 보낸다.
				data[j+1] = data[j];
				
				// i는 현재까지 입력된 데이터의 개수이다.
				// 입력된 값이 6개면 i=6이다.
				// 그럼 인덱스는 5부터 쭉 감소해간다.
				j--;
			}
			
			// data[j]가 tmp보다 작아지면 while을 빠져나온다.
			// 비어있는 j+1에 tmp를 넣는다.
			data[j+1] = tmp;
			
			// 출력하는 코드
			// i개에서 1개를 더 추가했으므로 데이터의 개수는 i+1이다.
			// 따라서 인덱스 i까지 반복한다.
			for(int k=0; k<=i ;k++) {
				System.out.print(data[k] + " ");
			}
			System.out.println();
			
		}
		
		kb.close();

	}
}
