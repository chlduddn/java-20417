package s0403;

import java.util.Scanner;

public class 반복문2 {
	public static void main(String[] args) {
		
		for(int i = 1;i <= 3;i++){
			for(int j = 7;j <= 9;j++) 
				System.out.print(j + "\t");
			System.out.print("\n");
			}
		
		System.out.println("-----예제28-----");
		
		for(int i = 1;i <= 4;i++){
			for(int j = 1;j <= i+1;j++)
				System.out.print(j+"\t");
			System.out.print("\n");
			}
			
		System.out.println("-----예제29-----");
		
		for(int i = 1;i <= 3;i++){
			for(int j = 1;j <= i;j++)
				System.out.print('*'+"\t");
			System.out.print("\n");
			}
		System.out.println("-----예제30-----");

		for(int i = 3;i >= 1;i--){
			for(int j = 1;j <= i;j++)
				System.out.print('*'+"\t");
			System.out.print("\n");
			}
		
		
	
	
	
	}
}