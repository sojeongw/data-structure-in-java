package lesson01;

import java.util.Scanner;

public class Code11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		int[] data=new int [n];
		
		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		// n개의 데이터에 대해 모든 쌍을 비교한다. 같은 값이면 무시하도록 한다.
		// 쌍을 검사하는 것은 항상 두 개의 중첩 for문을 사용한다.
		int count =0;
		
		/*
		for(int i=0; i<n; i++) {	// 쌍의 첫번째 
			for(int j=0; j<n; j++) {	// 두번째 
				// data[i] data[j]
				if(data[i]==data[j]) {
					count ++;
				}
			}
		}	 // for
		
		 하지만 이렇게 하면 1, 2, 3을 넣어도 3이 출력된다.
		 i가 0일 때 j가 0 인 상황 등 꼭 겹쳐지게 되기 때문이다.
		 */
		
		/*따라서 인덱스가 다르더라도 원소가 같은 경우라는 조건을 넣어준다.
		for(int i=0; i<n; i++) {	// 쌍의 첫번째 
			for(int j=0; j<n; j++) {	// 두번째 
				// data[i] data[j]
				if(i!=j && data[i]==data[j]) {
					count ++;
				}
			}
		}	 // for
		
		하지만 이 코드를 실행하면 또 다른 오류가 생긴다.
		1, 1, 2를 입력하면 1이 아니라 2가 출력된다. i=1 j=2 / i=2 j=1 처럼.
		*/
		
		// j를 i+1부터 시작하면 해결된다.
		// 순서쌍은 i보다 j가 클 경우만 검사해도 충분하기 때문이다.
		for(int i=0; i<n; i++) {	// 쌍의 첫번째 
			for(int j=i+1; j<n; j++) {	// 두번째 
				// 인덱스에 대한 조건도 없어진다.
				if(data[i]==data[j]) {
					count ++;
				}
			}
		}	 // for
		
		System.out.println(count);

	}

}
