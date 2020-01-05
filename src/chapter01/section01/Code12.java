package chapter01.section01;

import java.util.Scanner;

public class Code12 {
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
		
		// 그냥 처음부터 끝까지 더하면 되는 것 아니냐 할 수 있지만
		// 음수가 존재하므로 그렇지 않다.
		
		/*
		 제일 먼저 생각해볼 수 있는 방법은 많은 경우의 수로 다 더해보는 것이다.
		 더할 구간 각각의 시작점과 끝점을 구해보자.
		
		 일단 최대값을 0으로 초기화 해놓는다. 0개 이상을 선택할 수 있으므로 최대값을 0으로 초기화해도 무방하다.
		 또한 어떤 값을 더해도 최대값이 0보다 작아질 수는 없기 때문이다.
		int max = 0; 
		
		시작점은 i가 된다.
		for(int i=0; i<n; i++) {	
			 끝점은 j가 된다. 이때 끝점은 반드시 i보다 크거나 같으므로 0이 아니라 i부터 시작한다.
			for(int j=i; j<n; j++ ) {	
				
				int sum = 0;
				for(int k=i; k<=j; k++) {	// i부터 j까지 반복
					sum += data[k];
				}
				
				if(sum > max) {	// 만약 지금 더한게 더 크다면 
					max=sum;	// 지금 sum이 최대값이 된다.
				}
			}
		}	// for
		
		 하지만 위의 방법은 불필요한 중복을 포함하고 있다.
		 앞에 구했던 최대값에 다음 원소만 더해주면 되는데 반복문을 또 수행해야 하기 때문이다.
		 */
		
		int max = 0; 
		for(int i=0; i<n; i++) {	
			
			// i가 바뀔 때 sum이 초기화 되도록 한다.
			int sum = 0;
			
			for(int j=i; j<n; j++ ) {	
				
				// j가 바뀌는 동안에는 새로 sum을 구하지 않고
				// 같은 시작점에서 계속 더하는 동안 생긴 sum에 추가만 한다.
				sum += data[j];
				
				if(sum > max) {	// 지금 sum이 최대값이 된다.
					max=sum;
				}
			}	// for
		}	// for
		
		System.out.println(max);
		
		

	}
}
