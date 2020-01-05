package chapter01.section01;

import java.util.Scanner;

public class Code09 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		
		int n=kb.nextInt();
		int[] data= new int[n];
		
		for(int i=0; i<n; i++) {
			data[i]=kb.nextInt();
		}
		kb.close();
		
		// 맨 마지막 원소만 따로 빼서 저장하면 뒤로 밀려도 지워지지 않는다.
		int tmp=data[n-1];
		// 맨 뒤부터 땡겨서 저장한다.
		for(int i=n-2; i>=0; i--) {
			data[i+1]=data[i];
			
		}
		data[0]=tmp;
		
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
	}

}
