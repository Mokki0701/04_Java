package edu.kh.loop.ex;
import java.util.Scanner;

public class LoopEx {
	
	// 필드 (객체의 속성 == 변수)
	// java.util.Scanner
	// Scanner 객체 생성
	Scanner sc = new Scanner(System.in);
	/*
	 * 1 부터 10까지 출력하기 
	 */
	public void method1() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	/*
	 * 첫 번째 입력 받은 수 부터
	 * 두 번째 입력 받은 수 까지
	 * 1씩 증가하며 출력하기
	 */
	public void method2() {
		System.out.print("입력 (1 2) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int i = num1; i <=num2; i++) {
			System.out.println(i);
		}
	}
	
	/*
	 * 10부터 1까지 1씩 감소하며 출력
	 */
	public void method3() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	/*
	 * 두 수를 입력 받아 반복 출력하는 구문을 작성
	 * 
	 * (첫 번째 입력 A, 두 번째 입력 B)]
	 * 
	 * 조건 1 : B가 A보다 큰 경우 -> A ~ B 까지 1씩 증가하며 출력
	 * 조건 2 : A가 B보다 큰 경우 -> A ~ B 까지 1씩 감소하며 출력
	 * 조건 3 : A와 B가 같다면 -> "같은 수 입력됨"
	 */
	public void method4() {
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 == num2){
			System.out.print("같은 수 입력됨");
			return; // 현재 메서드 종료 후 호출한 곳으로 돌아감
		}
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}	else {
			for(int i = num1; i >= num2; i--) {
				System.out.println(i);
			}
		}
	}
	
	
	/*
	 * 두 수를 입력 받아 1씩 증가하며 반복 출력
	 * 
	 * (첫 번째 입력 A, 두 번째 입력 B)
	 * 
	 * - 입력 받은 두 수 중
	 * 	 작은 값이 초기식, 큰 값이 조건식에 사용되게 작성
	 * 	 (같은 경우는 초기식 A, 조건식 B)
	 */
	public void method5() {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 == num2){
			for(int i = num1; i <= num2; i++);
		}
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}	else {
			for(int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		}
	}
	
	public void method5a() {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int min;
		int max;
		
		if(num1 <= num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		
		for(int i = min; i < max; i++) {
			System.out.println(i);
		}
	}
	
	/*
	 * 최대, 최소값 구하기 V2 (Math)
	 * - Java API 이용
	 */
	public void method5b() {
		System.out.print("입력 (1 2) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2); // 두 수 중 작은 값을 반환
		int max = Math.max(num1, num2); // 두 수 중 큰   값을 반환
		
		for(int i = min; i < max; i++) System.out.println(i);
	}
		
	/*
	 * 변수 값 교환(swap)
	 */
	
	public void method5c() {
		System.out.print("입력 (1 2) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i = num1; i <= num2; i++)System.out.println(i);
	}
	
	/*
	 * 1부터 100 사이 7의 배수 개수 세기
	 */
	public void method6() {
		
		int num = 0;
		
		for(int i = 1; i < 100; i++) {
			if(i % 7 == 0) num++; 
		}
		
		System.out.println(num);
	}
	
	public void method6a() {
		int count = 0;
		
		for(int i = 7; i < 100; i+=7) count++;
		System.out.println(count);
	}
	
	/*
	 * 1부터 100 사이 정수 중
	 * 3의 배수의 개수
	 * 3의 배수를 제외한 수들의 합 출력
	 */
	public void method7() {
		int count  = 0;
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) count++;
			else   				 sum += i;
		}
		System.out.println(count);
		System.out.println(sum);
	}
		
	/*
	 * 구구단 5단 출력하기
	 */
	public void method8() {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("5 x %d = %2d \n", i, i*5);
		}
	}
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
