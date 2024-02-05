package edu.kh.oarr.view;

import java.util.Scanner;

import edu.kh.oarr.model.dto.Student;
import edu.kh.oarr.model.service.StudentService;

// 입력, 출력을 담당하는 클래스(객체의 속성, 기능 정의)
public class StudentView {
	
	// 필드( 객체의 속성)
	
	// static이 붙은 필드 == 클래스 변수
	// static이 없는 필드 == 인스턴스 변수
	private Scanner sc = new Scanner(System.in);
	private StudentService service = new StudentService();
	
	/*
	 * 메뉴 표시 기능
	 */
	public void displayMenu() {
		int input = 0; // 메뉴 번호를 입력 받을 변수
		do {
			System.out.println("\n----- 학생 관리 프로그램 -----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 이름으로 조회"); // 동명이인 X
			System.out.println("5. 학생 정보 수정(인덱스)");
			System.out.println("6. 학생 1명 점수 조회(점수, 합계, 평균)");
			System.out.println("7. 평균 최고점, 최저점 학생");
			System.out.println("8. 학생 성적 추가");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1: addStudent(); break;
			case 2: checkStudents(); break;
			case 3: checkStudent(); break;
			case 4: checkName(); break;
			case 5: convertStudent(); break;
			case 6: serveyPoint(); break;
			case 7: selectMaxMin(); break;
			case 0: 
				System.out.println("프로그램 종료");
				break;
			default: System.out.println("[잘못 입력]");
			}
		} while(input != 0);
	}
	
	/*
	 * 학생 추가 화면
	 * 
	 * 학번, 이름, 성별을 입력 받아
	 * StudentService의 students 배열에 추가
	 */
	private void addStudent() {
		System.out.println("\n ------ 학생 추가 ------");
		
		System.out.print("학번 : ");
		String studentNumber = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성별(M/F) : "); // m
		char gender= sc.next().toUpperCase().charAt(0);
		// 문자열.toUpperCase() : 영어 대문자로 변경
		
		// 학생 추가 Service 메서드 호출 후 결과 반환 받기
		boolean result = service.addStudent(new Student(studentNumber, name, gender));
		
		if(result) {
			System.out.println(name + "학생이 추가 되었습니다.");
		}else {
			System.out.println("학생을 더 이상 추가할 수 없습니다.");
		}
	}
	
	private void checkStudents() {
		System.out.println("\n---- 전체 학생 명단 ----");
		
		
		Student[] studentList = service.getStudents();
		
		for(int i=0 ; i<studentList.length ; i++) {
			 
			 // 학생이 없는 인덱스인 경우 반복 종료
			 if(studentList[i] == null) break;
			 
			 System.out.println(i + "번째 인덱스\n" + studentList[i].toString());
			 System.out.println();
			 
		 }
	}
	
	private void checkStudent() {
		System.out.print("조회할 학생 번호를 입력하세요.");
		int num = sc.nextInt();
		
		Student std = service.selectIndex(num);
		
		if(std == null) System.out.println("해당 인덱스에 학생이 존재하지 않습니다.");
		else  studentPrint(std);
	}
	
	private void checkName() {
		System.out.print("조회하실 학생 이름을 입력하세요.");
		String str = sc.next();
		
		Student std = service.checkName(str);
		
		if(std == null) System.out.println("조회하신 이름은 없습니다.");
		else studentPrint(std);
		
	} // 왜 조회가 안되지? 계쏙 이름이 없다고 뜨지? 왜 계속 student는 null값만 반환하지???  -> 기본 자료형외에 것들을 비교할때는 .equal(변수)를 이용해서 비교한다 멍청아
	
	/*
	 * 인덱스를 먼저 입력 받아
	 * 해당 인덱스에 학생이 존재하면
	 * 
	 * HTML, CSS, JS, Java 점수를 입력 받아
	 * 해당 학생에게 세팅(set)
	 */
	private void convertStudent() {
		System.out.print("정보를 수정할 학생의 인덱스 번호를 입력 : ");
		int num = sc.nextInt();
		
		Student std = service.selectIndex(num);
		
		if(std == null) {
			System.out.println("해당 인덱스에 학생이 존재하지 않습니다.");
			return;
		}
		
		// HTML, CSS, JS, Java 점수 입력 받아 바로 std에 세팅0
		System.out.print("HTML, CSS, JS, Java 순서로 입력 : ");
		std.setHtml(sc.nextInt());
		std.setCss (sc.nextInt());
		std.setJs  (sc.nextInt());
		std.setJava(sc.nextInt());
		
		System.out.println("수정 완료");
		
	}
	
	/*
	 * 학생 점수 조회 (각각의 점수, 합계, 평균)
	 * 
	 * 1) 인덱스를 입력 받아 해당 학생이 존재하는 확인
	 * 
	 * 2) 있을 경우
	 * 		serviec.selectScore(인덱스)를 호출한 후
	 *  	HTML(50) CSS(80) JS(100) Java(30)
	 *  	합계 : 280
	 *  	평균 : 70.0
	 *  	
	 *  	형태의 문자열로 반환 받아와서 출력
	 */
	private void serveyPoint() {
		System.out.print("점수를 조회하실 학생 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		Student std = service.selectIndex(num);
		if(std == null) {
			System.out.println("해당 인덱스에 학생이 존재하지 않습니다.");
			return;
		}
		
		String str = service.serveyPoint(num);
		System.out.println(str);
		
	}
	
	/**
	 * 평균 최고점, 최저점 학생 조회 하기
	 */
	private void selectMaxMin() {
		
			System.out.println("\n----- 평균 최고점, 최저점 학생 조회 하기 -----");
			
			String result  = service.selectMaxMin();
			
			System.out.println(result);
	}

	
	
	// 학생 정보 출력하는 함수
	private void studentPrint(Student s) {
		System.out.println("학번 : " + s.getStudentNumber());
		
		String temp = null;
		if(s.getGender() == 'F' ) temp = "여성";
		else											  temp = "남성";
		
		System.out.println("성별 : " + temp);
		
		System.out.println("이름 : " + s.getName());
		
		System.out.println("----- 점수 -----");
		System.out.println("HTML : " + s.getHtml());
		System.out.println("CSS  : " + s.getCss());
		System.out.println("Js   : " + s.getJs());
		System.out.println("Java : " + s.getJava());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
