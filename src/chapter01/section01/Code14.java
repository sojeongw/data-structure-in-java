package chapter01.section01;

import java.util.Scanner;

public class Code14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		// 일단 배열의 크기를 입력받는다.
		int n = kb.nextInt();
		int[] data= new int[n];
		
		// 배열에 들어갈 원소를 입력받는다.
		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		// bubble sort
		// 맨 뒤에서 i=1까지만 i--를 반복한다.
		// for문 한 번이 그림에서의 한 스텝이다.
		for (int i=n-1; i>0; i--) {
			// data[0]에서 data[i] 사이에서 제일 큰 값을 data[i]로 몰아간다.
			// 0에서 i-1까지 쭉 스캔하면서 최대값을 찾아낸다.
			for(int j=0; j<i; j++) {
				if(data[j] > data[j+1]) {
					// swap data[j] and data[j+1]
					// 일단 data[j]값을 다른 곳에 옮겨두고 
					int tmp = data[j];
					// 이제 data[j]에는 마음대로 값을 쓸 수 있으니 data[j+1]을 넣고 
					data[j] = data[j+1];
					// 임시로 저장해뒀던 값을 data[j+1]에 넣으면 된다.
					data[j+1] = tmp;
				}
			}
		}
		
		// 정렬된 값을 출력한다.
		System.out.println("Sorted data: ");
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
	}
}
