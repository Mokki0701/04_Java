package edu.kh.poly.pack1.model.dto;

import java.util.Scanner;

public class Test2 {

	public void test(){
		Scanner sc= new Scanner(System.in);

		String[] memberArr = {"홍길동", "김성훈", "윤웅식", "윤성우", "남궁인"};

		System.out.print("검색할 회원 이름을 입력하세여 : ");

		String searchName = sc.next(); // 여기서 searchName은 String형이기 때문에 스캐너는 next로 받아야 한다.

		boolean result = false;

		for(int i = 0; i < memberArr.length; i++) {
			// for 반복문에서 체크하는것이 memberArr의 배열 인덱스이기 때문에 평소것에서 -1을 해주던지
			// 아니면 0부터 검사할 수 있도록 수정해 주어야 한다.

			if(memberArr[i].equals(searchName)){ // String형은 기본 자료형이 아니기 때문에 == 등위 연산자 대신 .equal 을 써줘서 비교해야 한다.
				result = true;
				break;
			}
		}

		if(result){
			System.out.println("회원이 존재합니다."); // 여기서 result값이 true면 회원이 존재하고 false면 존재하지 않기 때문에 if의 print구문을 else 구문과 바꿔줘야 한다.
		}else {
			System.out.println("회원이 존재하지 않습니다.");
		}
	}
	
}
