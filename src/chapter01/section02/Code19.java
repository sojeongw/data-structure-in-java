package chapter01.section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19
{

	public static void main(String[] args)
	{
		// 파일에 있는 내용을 담을 변수
		// 그런데 파일을 읽기 전까지는 배열 크기가 얼마가 될지 알 수가 없다.
		// 그냥 일단 충분히 잡으면 된다.
		String[] name = new String[1000];
		
		// 전화번호가 꼭 숫자가 아니라 대쉬같은 기호가 들어갈 수도 있으므로 String으로 받는다.
		String[] number = new String[1000];
		
		// 사람 수를 담을 변수. 아직 모르므로 0으로 초기화한다.
		int n = 0;
		
		// file 입출력은 예외 처리가 필수적이다.
		try
		{
			// 파일은 키보드 입력처럼 Scanner를 사용한다.
			String fileName = "input.txt";
			Scanner inFile = new Scanner(new File(fileName));
			
			// 지금까지는 for문으로 불러왔지만 그때는 데이터의 개수를 알았기 때문에 가능한 거였다.
			// hasNext는 읽을 내용이 남아있는지 확인하고 남아있으면 true를 리턴한다.
			while(inFile.hasNext()) // detect End of File(EOF)
			{
				// 일단 배열 0번부터 저장하고 
				name[n] = inFile.next();
				number[n] = inFile.next();
			
				// n을 증가시킨다.
				n++;
			}
			
			
			inFile.close();
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(name[i] + ":" + number[i]);
		}
		
		
	}

}
