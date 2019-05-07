package section01;

public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		// 1~100000 사이의 숫자 입력
		// 1은 소수가 아니므로 굳이 하지 않고 2부터 시작한다.
		for(int n=2; n<=100000; n++) {
			
//			int n= 10111;
			boolean isPrime=true;
		
		/*
		 소수란 1과 자신 외의 약수를 갖지 않는 수이다.
		 2, 3, ..., n-1 사이의 정수로 나누어 떨어지면 소수가 아니다.
		 하지만 굳이 n-1까지 갈 필요가 없다. 약수는 n/2 보다 클 수 없기 때문이다.
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {	// not prime number
				isPrime=false;
				break; // 이미 소수로 판정났다면 불필요한 반복을 피하기 위해 빠져나온다.
			}
			
		}	// for
		
		 혹은 빠져나올 조건을 for문에 추가한다.
		for(int i=2; i<=n/2 & isPrime; i++) {
			if(n % i == 0) {	// not prime number
				isPrime=false;
				break; // 이미 소수로 판정났다면 불필요한 반복을 피하기 위해 빠져나온다.
			
		}	// for
		*/
		
		// 루트 n까지만 계산하는 방법.
		// 루트니까 i랑 i를 곱해서 n보다 작거나 같아야 한다는 조건을 넣는다.
		for(int i=2; i*i <= n & isPrime; i++) {
			if(n % i == 0) {	// not prime number
				isPrime=false;
			}

		}	// for
		
		if(isPrime) {	// 소수이면 출력 
			System.out.println(n);
		}
		}
	}
	
}
