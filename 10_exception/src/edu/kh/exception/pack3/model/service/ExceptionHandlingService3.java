package edu.kh.exception.pack3.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import edu.kh.exception.pack3.model.exception.MoreThanAHundredException;

public class ExceptionHandlingService3 {

	/* Checked Exception / Unchecked Exception
	 * 
	 * Check : 확인하다

	 * 
	 * - Checked Excoption : 반드시 확인해야 되는 예외
	 *  -> 예외 처리 구문(try-catch, throws)을
	 *     반드시!! 작성해야 되는 예외
	 * 
	 * - UnChecked Exception : 확인 안해도 되는 예외
	 *  -> 예외 처리 구문(try-catch, throws)을
	 *     써도 그만, 안써도 그만인 예외
	 *     
	 */
	
	
	/*
	 * Checked / UnChecked 구분하기
	 */
	public void method1() {
		
		/* UnChecked Exception */
		// RuntimeExcpetion 또는 
		// RuntimeExcpetion의 자식 예외 강제 발생
		
		int result = 1;
		
		if(result == 1) {
		 throw new RuntimeException(); // 빨간줄 안뜸
		}
		// --------------------------------------------------------------------

		/* Checked Exception */
		// RuntimeException, RuntimeException의 자식 제외
		// 나머지 예외 강제 발생
		else {
			
			try {
				throw new IOException(); // 빨간줄 뜸
			}catch(IOException e) {
				System.out.println("예외 처리 필수!!");
			}
			// Unhandled exception type IOException
			// -> IOException 예외 처리가 안되어 있음
			// --> 예외처리 꼭 해라
		}
		
		
	}
	
	/*
	 * Checked Exception 확인하기
	 * - 이미 만들어져 있는 Java 코드 이용 시
	 *   예외 처리가 꼭 필요한 경우(Checked)
	 */
	public void method2() {
		
		// BufferedReader : 빨리, 효율적으로 읽어오는 객체(+빠름)
		// InputStreamReader(System.in) : 키보드 입력을 읽는 객체
		// System.in : 키보드
		
		// -> Scanner 보단 기능이 부족하지만
		//   속도가 압도적으로 빠름
		
		// -> 부족한 기능(int, double 입력 받기)은
		//   Integer.parseInt(문자열), Double.parseDouble(문자열) 이용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("문자열 입력 : ");
		
		// br.readLine() : 입력된 한 줄 읽어오기(엔터 까지 읽어오기)
		
		// public String readLine() throws IOException
		// -> IOException 예외 처리 구문이 필수적으로 작성 되어야 함!!
		
		try { // br.readLine() 때문에  작성한 예외 처리 구문!!!
			String input = br.readLine();
			
			System.out.println("입력 받은 문자열 : " + input);
			
		} catch(IOException e) {
			System.out.println("예외 잡아서 처리");
		}
		
	}
	
	/*
	 * CheckedException, UnChecked Exception
	 * 두 종류 예외가 섞인 예제
	 */
	public void method3() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null; // null은 참조형 변수의 기본 값
		
		try {
			System.out.print("아무거나 입력 : ");
			input = br.readLine(); // Checked Exception
			
			// 입력 받은 내용이 정수 -> x 2 해서 출력하기
			// 입력 받은 내용이 문자열 -> 앞 뒤에 ### 붙이기
			
			// 입력 받은 문자열 input을 정수로 변환
			int temp = Integer.parseInt(input); // UnChecked Exception
					
			// java.lang.NumberFormatException 발생
			// -> 파싱하려는 문자열 input이 숫자의 형태가 아니라서 예외 발생
			
			System.out.println(temp*2);
			
		
		} catch(IOException e) {
			System.out.println("IOException 처리");
		} catch(NumberFormatException e) {
			// 정수가 아닌 문자열이 입력되어 NumberFormatException이 발생한 경우
			// -> 문자열 입력이라는 소리!
			System.out.println("###" + input + "###");
		}
	}
	
	/*
	 * throws : 메서드 내부에서 발생된 예외를
	 * 					호출한 곳으로 던짐
	 * 
	 * throw : 예외 객체를 현재 위치에서 던짐(예외 강제 발생)
	 */
	public void method4() {
		// inputString() 메서드를 이용해서
		// 문자열을 두번 입력 받아
		// 하나로 합쳐서 출력하기
		
		try {
			System.out.print("첫 번째 문자열을 입력 : ");	
			String str1 = inputString(); 
			// inputString() 호출 -> throws IOException
			// -> 호출한 곳에서 처리하겠다 -> 예외 처리 코드(try-catch, throws) 작성
			
			System.out.print("두 번째 문자열 입력 : ");
			String str2 = inputString();
			
			// System.out.println(str1 + str2); // 효율 별로....
			
			StringBuilder sb = new StringBuilder();
			sb.append(str1);
			sb.append(str2);
			
			System.out.println(sb.toString());
			
		} catch(IOException e) {
			System.out.println("IOException 잡아서 처리함");
		}
		
		
	}
	
	/* BufferedReader를 이용해서 문자열 입력 받기
	 *  @return 입력 받은 문자열
	 */
	public String inputString() throws IOException{
		
		// throws IOException :
		// 현재 메서드에서 발생할 수 있는(던져질 수 있는) IOException을
		// 현재 메서드를 호출한 곳으로 던져서
		// 상황에 맞게 별도로 처리하게 함
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		str = br.readLine();
			
		// System.in은 한 번 닫으면 재사용 불가!!!
		// br.close(); // 사용 끝난 br 객체 메모리 반환(제거)
		
		return str;
	}
	
	/*
	 * 사용자 정의 예외 사용
	 */
	public void method5() {
		
		try {
			System.out.println("[두 정수를 입력 받아 합계 출력하기]");
			
			System.out.print("정수 1 : ");
			int num1 = Integer.parseInt(inputString()) ;
			
			System.out.print("정수 2 : ");
			int num2 = Integer.parseInt(inputString()) ;
			
			int result = num1 + num2;
			
			if(result > 100) { // 100 초과한 경우가 심각한 상황이라 가정
				throw new MoreThanAHundredException();
			}
			
			System.out.println(result);

			
		} catch (IOException e) {
			System.out.println("IOException 처리");
		} catch (NumberFormatException e) {
			System.out.println("잘못 입력");
		} catch (MoreThanAHundredException e) {
			
			// e : 예외 객체 참조 변수
			
			// e.printStackTrace()
			// - print : 출력하다
			// - Stack : JVM 메모리 중 Stack 영역(메서드가 쌓여있음)
			// - Trace : 추적하다
			
			// -> 호출한 메서드 순서대러
			// 	  발생한 예외를 모두 추적해서 출력
			
			e.printStackTrace();
			
//			edu.kh.exception.pack3.model.exception.MoreThanAHundredException: 100을 초과 하였습니다.
//			at edu.kh.exception.pack3.model.service.ExceptionHandlingService3.method5(ExceptionHandlingService3.java:206)
//			at edu.kh.exception.pack3.run.ExceptionRun3.main(ExceptionRun3.java:13)
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
