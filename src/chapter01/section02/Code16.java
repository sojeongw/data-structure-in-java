package chapter01.section02;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		// 지수는 영어로 power라고 부르므로 power라고 지어봄.
		int result = power(a, b);
		
		System.out.println(result);
		
		kb.close();
	}

	// 함수가 받는 파라미터의 이름은 달라도 상관없다.
	static int power(int n, int m)
	{
		int prod = 1;
		
		// n을 m번 곱한다.
		for(int i=0; i<m; i++) {
			prod *= n;
		}
		
		return prod;
	}


}