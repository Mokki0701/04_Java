package edu.kh.loop.ex;
import java.util.Scanner;
/*
 * 중첩 반복문
 */


public class LoopEx2 {
	
	Scanner sc = new Scanner(System.in);
	/*
	 * 1234
	 * 1234
	 * 1234
	 */
	public void method1() {
		
		for(int i = 0; i < 3; i++) { // 3번 반복
			
			for(int j = 1; j <=4; j++) { // 1234 반복
				System.out.print(i);
			}
			
			System.out.print("\n"); // 줄 바꿈
		}
	}
	
	/*
	 * 다음 모양 출력하기
	 * 
	 * 4321
	 * 4321
	 */
	public void method2() {
		for(int i = 0; i < 2; i++) {
			
			for(int j = 4; j >= 1; j--) System.out.print(j);
			
			System.out.println();
		}
	}
	
	/*
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 *  
	 */
	public void method3() {
		for(int i = 0; i < 3; i++) { // 세로 0,1,2
			
			for(int j = 0; j <3; j++) { // 가로 0,1,2
				System.out.printf("(%d,%d) ", i,j);
			}
			
			System.out.println(); // 줄 바꿈
		}
	}
	
	/*
	 * 다음 모양 출력하기
	 * (2,2) (2,1) (2,0)
	 * (1,2) (1,1) (1,0)
	 * (0,2) (0,1) (0,0)
	 * 
	 */
	
	public void method4() {
		for(int i = 2; i >= 0; i--) {
			for(int j = 2; j >= 0; j--) {
				System.out.printf("(%d,%d) ", i,j);
			}
			System.out.println();
		}
	}
	
	/**
	 * 2단 부터 9단까지 모두 출력
	 * 
	 * 2x1= 2  2x2= 4  2x3= 6 ... 2x9=18
	 * 3x1= 3  3x2= 6  3x3= 9 ... 3x9=27
	 * ...
	 * 9x1= 9  9x2=18  9x3=27 ... 9x9=81
	 */
	
	public void method5() {

		for(int i = 2; i <= 9; i++) { // 행(==단, 2~9)
			for(int j = 1; j <= 9; j++) { // 열(== 곱해지는 수, 1~9)
				System.out.printf("%dx%d= %2d ", i, j, i*j); // 구구단 한 줄 출력
			}
			System.out.println(); // 줄 바꿈
		}
	}
	
	/**<pre>
	 * 입력 받은 단 부터 9단까지 구구단 출력하기
	 * 
	 * 단, 입력 값이 2~9 사이가 아니면 "잘못 입력" 출력
	 * 
	 * ex)
	 * 단 입력 (2~9사이) : 7
	 * 
	 * ===== 7단 =====
	 * 7 x 1 =  7
	 * 7 x 2 = 14
	 * ...
	 * 7 x 9 = 63
	 * 
	 * ===== 8단 =====
	 * ...
	 * 
	 * 
	 * ===== 9단 =====
	 * 
	 * </pre>
	 */
	
	public void method6() {
		
		System.out.print("단 입력 (2~9사이) : ");
		int input = sc.nextInt();
		
		// 입력 받은 단이 2~9 사이가 아닐 경우
		if(input < 2 || input >9) {
			System.out.println("잘못입력");
			return;
		}
		
		for(int i = input; i <= 9; i++) { // 행(==단, input~9)
			System.out.printf("==== %d단 ====\n", i);
			for(int j = 1; j <= 9; j++) { // 열(== 곱해지는 수, 1~9)
				System.out.printf("%dx%d= %2d \n", i, j, i*j); // 구구단 한 줄 출력
			}
		}
		
	}
	
	/*
	 * 
	 */
	public void method7() {
		
		int num = 1;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
	
	
	public void method8() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method8a() {
		for(int i = 0; i < 4; i++) {
			System.out.println("****");
			System.out.println();
		}
	}
	
	/** <pre>
	 * 
	 *    *
	 *    **
	 *    ***
	 *    ****
	 * 
	 * </pre>
	 */
	
	public void method9() {
		for(int i = 1; i <= 4; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/** <pre>
	 * 
	 *    ****
	 *    ***
	 *    **
	 *    *
	 * 
	 * </pre>
	 */
	
	public void method10() {
		for(int i = 1; i <= 4; i++) {
			for(int j = i; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
