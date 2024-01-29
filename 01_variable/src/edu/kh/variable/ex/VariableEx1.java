package edu.kh.variable.ex;

public class VariableEx1 {
	
	public static void main(String[] args) {
		
		// 변수 : 메모리에 값을 저장하기 위한 공간
		// 				이 때, 저장되는 값이 변할 수 있어 변수
		
		// 자료형 (data type)
		// - 변수 또는 값의 크기와 형식
		
		/* **** 자바 기본 자료형(Java Primitive Types) ****
		 * 
		 * [논리형]
		 * boolean (1byte) - true/false
		 * 
		 * [정수형]
		 * byte 	(1byte)
		 * short 	(2byte)
		 * int		(4byte)		* 정수 기본형 *
		 * long 	(8byte)		- 숫자 뒤에 L
		 * 
		 * [실수형]
		 * float 	(4byte)		- 숫자 뒤에 f
		 * double (8byte)		* 실수 기본형 * 
		 * 
		 * [문자형]
		 * char 	(2byte)		- 문자 하나, 문자 양 옆에 ''
		 * 
		 */
		
		// 변수 선언 : 메모리에 공간 할당
		
		boolean isTrue; // 메모리에 boolean 저장 공간 1byte 할당하고
										// 그 공간을 isTrue 라고 부르겠다.
		
		double number1; // 메모리에 double 저장 공간 8byte 할당하고
										// 그공간을 number1 이라고 부르겠다.
		
		// 값 대입 : 변수에 값을 집어 넣는 것
		//					(이미 값이 있는 변수에 대입하면 --> 덮어쓰기)
		isTrue = true;
		
		// 변수 선언 + 초기화 + 값의 범위 확인
		int number2 = 21000000; // 21억 오류 x
				
		long number3 = 2200000000L; // 22억 오류
		// The literal 2200000000 of type int is out of range
		// -> int 범위 초가
		
		// [해결방법] : int보다 범위가 큰 자료형으로 변경
		// -> 자료형을 long, 숫자 뒤에 'L' 리터럴 표기법 추가
		
		// 'L' 같은 리터럴 표기법은
		// 컴퓨터가 자료형을 구분하기 위한 기호일뿐
		// 출력 시 보여지지는 않는다.
		System.out.println("number : " + number2);
		System.out.println("number : " + number3);
		
		/* 다른 리터럴 표기법 확인 */
		char temp = 'A';
		float temp2 = 1.24f;
		double temp3 = 3.14;
		
		// -----------------------------------------------------
		
		/* String(문자열)
		 * - 기본 자료형이 아닌 객체
		 * - String을 저장하는 변수는 객체 대신 주소를 저장하기 때문에
		 *   "참조형" 이라고 한다
		 *   
		 *   (저장된 주소에 위치한 객체를 참조)
		 *
		 * - String의 리터럴 표기법 : 쌍따옴표("")
		 *  */
		
		String str = "쌍따옴표가 String 리터럴 표기법";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
