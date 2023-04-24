package s0403;

import java.util.Scanner;

public class 반복문3 {
	public static void main(String[] args) {
		System.out.println("-----test-----");
		
		int N;
		int i = 1;
		System.out.println("N을 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		while(true) {
			
			if(i%3==0)
				i++;
				continue;
		}
	}
}

