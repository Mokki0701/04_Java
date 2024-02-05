package edu.kh.oop.practice;

import java.util.Scanner;

public class StudentService {

	Scanner sc = new Scanner(System.in);
	
	public void display() {
		
		int input = 0;
		
		Student[] students = null;
		
		do {
			
			System.out.println("""

===== 학생 관리 프로그램 =====
1. 학생 등록
2. 학생 정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. HTML 공부하기
6. Java 역량 비교하기
7. HTML 역량 비교하기
0. 프로그램 종료
					""");
			
			switch(input) {
			case 1 :
				int num = sc.nextInt();
				for(int i = 0; i < num; i++) {
					students[i] = createStudent();
				}
				break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 7 : break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
			}
			
	} while(input != 0);
	
	}
	
	
	
	private Student createStudent() {
		String str = sc.nextLine();
		
		return null;
	}
}


