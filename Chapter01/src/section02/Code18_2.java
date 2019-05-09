package section02;

import java.util.Scanner;

public class Code18_2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<n; i++)
		{
			data[i] = kb.nextInt();
		}
		
		kb.close();
		
		// 배열을 한번에 넘긴다.
		bubbleSort(n, data);
		
		System.out.println("Sorted data");
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
		

	}

	static void bubbleSort(int n, int[] data)
	{
		for(int i=n-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				if(data[j]>data[j+1])
				{
					swap(data[j], data[j+1]);
				}
			}
		}

	}
	
	static void swap(int a, int b) 
	{
		int tmp = a;
		a = b;
		b = tmp;
		// 이미 바꿨기 때문에 return할 필요는 없음.
	}

}
