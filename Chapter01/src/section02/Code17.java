package section02;

public class Code17 {

	public static void main(String[] args) {

		for(int n=1; n<=100000; n++) 
		{
			// isPrime이라는 함수가 true일 때만 정수를 출력한다.
			if(isPrime(n)) 
			{
				System.out.println(n);
			}
		}
		
	}

	 static boolean isPrime(int k) 
	 {		
		// 1은 소수가 아니므로 false 리턴하는 조건을 추가한다.
		// main의 for문을 어떻게 짜느냐에 따르겠지만 흠이 없게 만드는 방법을 설명하는 것이므로 참고.
		if(k<2) return false;
		
		for(int i=2; i*i<=k; i++)
		{
			if(k%i == 0)
			{
				return false;
			}
		}
		
		// for문이 끝나고 이 자리에 왔다는 것은
		// 한 번도 나누어 떨어지지 않았다는 뜻이므로 true를 보낸다.
		return true;
	 }

}
