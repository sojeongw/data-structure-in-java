package chapter01.section01;

public class Code05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열을 일단 선언해놓고 
		int[] grades;
		
		// 배열의 크기를 지정하면서 생성한다. 실제 배열은 이때 만들어진다.
		// int[] grades = new int[5]; 라고 한 번에 할 수도 있다.
		grades=new int[5];
		
		grades[0]=100;
		grades[1]=200;
		grades[2]=300;
		grades[3]=400;
		grades[4]=500;
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(i+" "+grades[i]);
		}
		
		System.out.println();
		
		int i=0;
		while(i<grades.length) {
			System.out.println(i+" "+grades[i]);
			i++;
		}
	}

}
