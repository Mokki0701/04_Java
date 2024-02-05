package edu.kh.oop.method;

import java.util.Scanner;

// 기능 제공 클래스
public class StudentService {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	/*
	 * 메인 메뉴 화면
	 */
	public void displayMenu() {
		int input = 0; // scanner로 입력받은 메뉴 번호를 저장할 변수
		
		// 학생 객체를 참조할 참조형 변수 2개 선언;
		// (null : 참조하는 객체가 없음)
		Student std1 = new Student("홍길동", "112233", '남'); // 테스트용 객체 생성
		Student std2 = null;
		
		// do ~ while : 최소 1회 이상 반복
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
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			
			case 1:
				System.out.println("학생을 등록할 변수를 선택(1:std1 / 2:std2) : ");
				int select = sc.nextInt();
				if(select == 1) std1 = createStudent();
				else std2 = createStudent();
				break;
			case 2:
				System.out.println("정보를 조회할 학생선택 선택(1:std1 / 2:std2) : ");
				String text = null; // 학생 정보가 담긴 문자열을 저장할 변수
				if(sc.nextInt() == 1) text = studentInform(std1);
				else text = studentInform(std2);
				System.out.print(text);
				break;
			case 3:
				System.out.print("이름을 수정할 학생선택 선택(1:std1 / 2:std2) : ");
				if(sc.nextInt() == 1) transformName(std1);
				else transformName(std2);
				break;
			case 4:
				System.out.println("Java 공부할 학생을 선택(1:std1 / 2:std2) : ");
				if(sc.nextInt() == 1) javaGame(std1);
				else javaGame(std2);
				break;
			case 5:
				System.out.println("Java 공부할 학생을 선택(1:std1 / 2:std2) : ");
				if(sc.nextInt() == 1) htmlGame(std1);
				else htmlGame(std2);
				break;
			case 6:
				String str = javaBattle(std1,std2);
				System.out.println(str);
				break;
			case 7:
				String str2 = "";
				str2 = htmlBattle(std1,std2);
				System.out.println(str2);
				break;
			case 0: System.out.println("===== 프로그램 종료 ====="); break;
			default :
			
			}
			
	}while(input != 0); // input이 0이 아닐 때 반복
	
	}
	
	/* 학생 정보를 입력받아 생성된 Student 객체를 반환
	 *  @return 생성된 Student 객체 주소
	 */
	private Student createStudent() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학번 : ");
		String studentNumber = sc.next();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		// sc.next()로 입력 받은 문자열 중 
		// 0번째 인덱스 번째 문자 하나를 반환 받아 gender 변수에 저장
		
		// Student 객체를 생성한 후, 그 주소를 호출한 곳으로 반환
		return new Student(name,studentNumber,gender);
	}
	
	/** 매개 변수로 전달 받은 학생의 정보를 문자열로 만들어서 반환
	 * @param s : std1 또는 std2 (학생 객체 참조 주소)
	 * @return 학생 정보가 작성된 문자열
	 */
	private String studentInform(Student s) {
		
		// String.format("패턴", 변수)
		// - 패턴 모양의 문자열을 반환하는 String 메서드
		
		// KH대학교/ 123123/ 남 / 홍길동 / 0 / 0
		return String.format("%s / %s / %c / %s / %d / %d,",
				Student.schoolName, s.getStudentNumber(), s.getGender(), s.getName(), s.getJava(), s.getHtml());
	}
	
	private void transformName(Student s) {
		System.out.print("수정하실 이름을 입력해주세요");
		String name = sc.next();
		
		String beforeName = s.getName();
		
		s.setName(name);
		System.out.println("학생 이름이 수정 되었습니다.");
		System.out.printf("%s -> %s \n", beforeName, s.getName());
	}
	

	/** Java 역량이 얼마나 증가 또는 감소했는지 정수로 입력 받고
	 * 학생의 Java 역량을 수정
	 * 단, 수정된 Java 역량은 최대값, 최소값 범위를 넘어가지 못하게함
	 * 
	 * ex) Java 역량이 120인 경우  100(최대값)
	 *     Java 역량이 -30인 경우    0(최소값)
	 * 
	 * @param  s : std1 또는 std2 (학생 객체 주소)
	 */
	
	private void javaGame(Student s) {
		System.out.print("증가 또는 감소한 Java 역량 입력(정수) : ");
		int num = sc.nextInt();
		int num2 = s.getJava();
		s.setJava(num2+num);
		
		if(s.getJava() > Student.MAX_VALUE) s.setJava(Student.MAX_VALUE);
		else if(s.getJava() <Student.MIN_VALUE) s.setJava(Student.MIN_VALUE);
		
		System.out.println("Java 역량 수정 완료");
		
		System.out.printf("%d -> %d  (%d)",num2, s.getJava(), num );
		
		// s = new Student(); // 얕은 복사로 std1의 주소값을 변경이 아닌 임시의 s의 주소값만 변경
		// s.setJava(num);
	}
	
	// [결과 출력 예시]
	// Java 역량 수정 완료 
	// 70 -> 80  (10)
	
	// [결과 출력 예시]
	// Java 역량 수정 완료 
	// 70 -> 30  (-40)
	
	// [결과 출력 예시]
	// Java 역량 수정 완료 
	// 50 -> 100  (100)        // 최대 값 범위 초과 X
	
	// [결과 출력 예시]
	// Java 역량 수정 완료 
	// 50 -> 0  (-100)         // 최소 값 범위 초과 X
	
	private void htmlGame(Student s) {
		System.out.print("증가 또는 감소한 HTML 역량 입력(정수) : ");
		int num = sc.nextInt();
		int num2 = s.getHtml();
		s.setHtml(num2+num);
		if(s.getHtml() >= Student.MAX_VALUE) s.setHtml(Student.MAX_VALUE);
		else if(s.getHtml() <=Student.MIN_VALUE) s.setHtml(Student.MIN_VALUE);
		
		System.out.println("Java 역량 수정 완료");
		
		System.out.printf("%d -> %d  (%d)",num2, s.getHtml(), num );
	}
	
	/** 매개 변수로 전달 받은 두 Student의 Java 점수 비교
	 * @param s1
	 * @param s2
	 * @return 결과 문자열
	 */
	private String javaBattle(Student s1, Student s2) {
		
		if(s1 == null) {
			return "첫 번째 학생이 등록되지 않았습니다.";
		}
		if(s2 == null) {
			return "두 번째 학생이 등록되지 않았습니다.";
		}
		
		String result = String.format("%s : %d / %s : %d \n", 
				s1.getName(), s1.getJava(), 
				s2.getName(), s2.getJava());
		
		// 두 학생의 점수 비교
		if(s1.getJava() > s2.getJava()) {
			int a = s1.getJava() - s2.getJava();
			return result + s1.getName() + "의 점수가" + a + "점 더 높습니다.";
		}
		if(s2.getJava() > s1.getJava()) {
			int a = s2.getJava() - s1.getJava();
			return result + s2.getName() + "의 점수가 " + a + "점 더 높습니다";
		}
		
		return result + "점수가 같습니다";
	}
	
	private String htmlBattle(Student s1, Student s2) {
		
		if(s1 == null) {
			return "첫 번째 학생이 등록되지 않았습니다.";
		}
		if(s2 == null) {
			return "두 번째 학생이 등록되지 않았습니다.";
		}
		
		String result = String.format("%s : %d / %s : %d \n", 
				s1.getName(), s1.getHtml(), 
				s2.getName(), s2.getHtml());
		
		// 두 학생의 점수 비교
		if(s1.getHtml() > s2.getHtml()) {
			int a = s1.getHtml() - s2.getHtml();
			return result + s1.getName() + "의 점수가" + a + "점 더 높습니다.";
		}
		if(s2.getHtml() > s1.getHtml()) {
			int a = s2.getHtml() - s1.getHtml();
			return result + s2.getName() + "의 점수가 " + a + "점 더 높습니다";
		}
		
		return result + "점수가 같습니다";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}