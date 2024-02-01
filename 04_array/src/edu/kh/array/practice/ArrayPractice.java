package edu.kh.array.practice;
import java.lang.reflect.Array;
import java.util.Arrays;
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
		
		// 1) Stack 영역에 int[]을 참조하기 위한 참조형 변수 arr 선언
		
		// 2) Heap 영역에 입력받은 len 만큼의 길이를 가지는 int[] 생성
		//    -> 주소가 할당됨
		
		// 3) 생성된 배열의 주소를 arr 변수에 대입해서 
		//    참조할 수 있는 형태로 만듦
		
		// len == arr.length
		
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
		
		// 문자열.length() : 문자열의 길이를 반환하는 메서드
		
		// 배열.length : 배열 길이를 반환하는 필드
		
		for(int i = 0; i < 14; i++) {
			if(i <8) nums[i] = str.charAt(i);
			else nums[i] = '*';
		}
		
		System.out.println(nums);
	}
	
	public void practice7() {
		int num;
		
		do {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num < 3 || num%2 == 0) System.out.println("다시 입력하세요.");
			else break;
		}while(num < 3 || num%2 == 0);
		
		int[] nums = new int[num];
		
		int count = 0;
		
		for(int i = 0, let = nums.length; i < let; i++) {
			if(i <= let/2) count++;
			else count--;
			nums[i] = count;
		}
		
		// Arrays.toString(배열명)
		// - 배열 내 요소를 "[1,2,3]" 형식의 문자열로 만들어 변환
		System.out.println(Arrays.toString(nums));
	}
	
	public void practice8_9() {
		int[] nums = new int[10];
		int min = 0;
		int max = 0;

		String str = ""; // 빈 문자열
		
		for(int i = 0; i < 10; i++) {
			nums[i] = (int)(Math.random()*10 +1);
			str += nums[i] + " ";
			if(i == 0) { // 첫 반복인 경우 -> 첫 번째 난수를 비교 기준으로 삼음
				max = nums[i];
				min = nums[i];
				continue; // 다음 반복으로 이동
			}
			
			// 첫 반복이 아닌 경우
			if(nums[i] > max) max = nums[i];
			if(nums[i] < min) min = nums[i];
			
		}
				
		System.out.println("발생한 난수 : " + str);
		System.out.printf("최대값 : %d\n최소값 : %d", max, min);
	}
	

	public void practice10() {
		int[] nums = new int[10];
		
		for(int i = 0; i < 10; i++) {
			nums[i] = (int)(Math.random()*10 +1);
			for(int j = i; j >= 0; j--) {
				
				while(true) {
					if(nums[i] == nums[j] && i != j) nums[i] = (int)(Math.random()*10 +1);
					else break;
				}
			}
			System.out.print(nums[i] + " ");
		}
	} // 이 코드가 안되는 이유 : 순차적으로 가면서 이미 지나온게 다시 나올 수 있다. 그럼
	// 뒤쪾에서는 아 되는건데? 하는데 이미 그 앞에 조사한 수에 있는 수 다.
	
	
	
	
	
public void practice10_a() {
		
		int[] randoms = new int[10];
		
		String str = ""; // 빈 문자열
		
		// 난수 생성용 for문 + 중복 제거
		for(int i=0 ; i<randoms.length ; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			
			// * 중복 검사 방법 *
			// 현재 인덱스에 대입된 난수와 같은 값이
			// 앞쪽 인덱스에 존재하면 
			// 다시 현재 인덱스에 새로운 난수를 생성해서 대입
			// (중복이 없을 때 까지 반복)
			
			// 현재 인덱스 앞쪽 까지만 순차 접근하는 for문 작성
			for(int x = 0 ; x < i ; x++) {
				
				// 현재 인덱스에 저장된 값과(지금 발생한 난수와)
				// 앞쪽 인덱스에 저장된 값이(이전에 발생한 난수가)
				// 같을 경우 "중복"으로 판단!
				if(randoms[i] == randoms[x]) {
					i--; // 바깥쪽 for문의 i 값 증가를 막아서
							 // 현재 인덱스 번째 요소에 다시 새로운 난수를 대입하게함
					
					break; // 중복을 발견 했으니 추가적인 검사가 필요 없음
				}
				
			}
			
			
		}
		
		
		// 출력 구문 만들기용 for문
		for(int i=0 ; i<randoms.length ; i++) {
			str += randoms[i] + " ";
		}
		
		System.out.println("발생한 난수 : " + str);
		
	}


public void practice11() {
	int[] nums = new int[6];
	String str = ""; // 빈 문자열
	
	for(int i = 0; i < 6; i++) {
		nums[i] = (int)(Math.random()*45 + 1);
		
		for(int j = 0; j < i; j++) {
			
			if(nums[i] == nums[j]) {
				i--;
				break;
			}
		}
	}
	
	// 3. 오름차순 정렬(선택 정렬)
//	for(int i =0; i < 5; i++) { // 칸 지정(비교 주체)
//		for(int j = i+1; j < 6; j++	) { // 비교 대상
//			
//			// 주체 > 대상 -> 오름 차순
//			// 주체 < 대상 -> 내림 차순
//			
//			if(nums[i] > nums[j]) {
//				int s = nums[i];
//				nums[i] = nums[j];
//				nums[j] = s;
//			}
//		}
//	}
	
	Arrays.sort(nums);
	
	for(int i=0 ; i<nums.length ; i++) {
		str += nums[i] + " ";
	}
	
	System.out.println("발생한 난수 : " + str);
}
	
	public void practice12() {
		int[] nums = new int[6];
		String str = "";
		
		for(int i =0; i < 6; i++) {
			nums[i] = (int)(Math.random()*45 + 1);
			for(int j = 0; j < i; j++) {
				if(nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
