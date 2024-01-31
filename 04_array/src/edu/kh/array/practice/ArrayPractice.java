package edu.kh.array.practice;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] nums = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			nums[i] = i+1;
			System.out.print(nums[i] + " ");
			
			if( i % 2 == 0) {
				sum += nums[i];
			}
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d", sum);
	}
	
	public void practice2() {
		int[] nums = new int[9];
		int sum = 0;
		
		for(int i = 0, j = 9; i < 9; i++, j--) {
			nums[i] = j;
			System.out.print(nums[i] + " ");
			
			if( i % 2 != 0) {
				sum += nums[i];
			}
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d", sum);
	}
	
	public void practice3() {
		int input = sc.nextInt();
		
		int[] numbers = new int[input];
		
		for(int i = 0; i < input; i++	) {
			numbers[i] = i +1;
			System.out.print(numbers[i] + " ");
		}
	}
	
	public void practice4() {
		int[] nums = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("입력 %d : ", i);
			nums[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int num1 = sc.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if(num1 == nums[i]) {
				System.out.printf("인덱스 : %d", i);
				return;
			}
		}
		System.out.println("일치하는 값이 존재하지 않습니다.");
	}
	
	
	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] nums = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			nums[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < num; i++) {
			sum += nums[i];
			System.out.print(nums[i] + " ");
		}
		
		System.out.printf("\n총 합 : %d", sum);
	}
	
	public void practice6() {
		System.out.print("주민등록번호(-포함) : ");

		String str = sc.nextLine();
		char[] nums = new char[14];
		
		for(int i = 0; i < 14; i++) {
			if(i <8) nums[i] = str.charAt(i);
			else nums[i] = '*';
		}
		
		System.out.println(nums);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
