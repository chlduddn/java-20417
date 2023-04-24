package s0403;

import java.util.Scanner;

public class 반복문1 {
	public static void main(String[] args) {
		int sum = 0;
		int N;
		//입력
		System.out.println("N을 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		//반복문
		for(int i = 1;i <= N;i++)
			if(i % 2 ==0){
				sum -= i;
				System.out.print("-"+i);
			}
			else{
				sum += i;
				System.out.print("+"+i);
			}
		System.out.println(" = "+sum);;
	}
}
