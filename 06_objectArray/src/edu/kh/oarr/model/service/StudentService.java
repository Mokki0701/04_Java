package edu.kh.oarr.model.service;

import java.util.Random;

import edu.kh.oarr.model.dto.Student;

// Service 클래스 : 기능 제공 클래스
// -> 입력, 출력 빼고 나머지
// ex) 로직(if, for)을 이용한 데이터 가공, 저장

public class StudentService {
	
	// 필드
	private Student[] students = new Student[10];
	// 학생 객체 참조 변수 10개 묶음인 Student[] 생성(할당)
	// 그 주소를 students 참조 변수에 대입
	
	// 기본 생성자
	public StudentService() {
		
		// 학생 객체 배열 (students)에 샘플 학생 3명 추가
		// students의 자료형 : Student[]
		// students[0]의 자료형 : Student
		students[0] = new Student("24001", "최미영", 'F');
		students[1] = new Student("1234", "짱구", 'M');
		students[2] = new Student("5555", "흰둥이", 'M');
		
		// students[3~9] == null
		
		// 자바에서 제공하는 나수 생성 객체
		Random random = new Random();
		
		// 샘플 학생 점수 초기화
		for(int i = 0; i < students.length; i++) { // 10바퀴
			
			// i번째 인덱스에 참조하는 학생이 없으면 반복 종료
			if(students[i] == null) {
				break;
			}
			
			// random.nextInt(101) : 0이상 100 미만 정수형 난수 생성
			students[i].setHtml(random.nextInt(101));
			students[i].setCss(random.nextInt(101));
			students[i].setJs(random.nextInt(101));
			students[i].setJava(random.nextInt(101));
			
		}
	}
	
	/*
	 * 전달 받은 학생 객체(주소)
	 * students 객체 배열에서
	 * 빈칸(null인 칸)에 대입
	 * 
	 * @param newStd : 전달 받은 학생
	 * 
	 * @return : 대입 성공 시 true, 실패 시(== 꽉 찼을 때) false
	 */
	public boolean addStudent(Student newStd) {
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = newStd;
				return true;
			}
		}
		
		return false;
	}
	
	/** 학생 객체 배열(students) 참조 주소 반환
	 * @return students (주소)
	 */
	public Student[] getStudents() {
		return students;
	}
	
	/** 학생 1명 정보 조회(index 검색) 
	 * @param index
	 * @return 조회된 학생 또는 null
	 */
	public Student selectIndex(int num) {
		
		if(num < 0 || num >= students.length ) return null;
		
		return students[num];
	}
	
	public Student checkName(String name) {
		
		/* 향상된 for문 */
		
		// for(변수 : 배열 || 컬렉션)
		
		// - 배열 || 컬렉션의 요소를 처음 부터 끝까지
		//	 순차 접근하는 for문
		
		// - 매 반복 마다 배열 || 컬렉션 요소를
		//	 하나씩 꺼나와 변수에 저장
		for(Student s : students) { // 저장된 학생이 없을 경우
			if(s == null) break;
		
		// 현재 접근한 학생의 이름이 name과 같은지 확인
			if(s.getName().equals(name)) return s;
		}
		
		return null;
	}
	
	public String serveyPoint(int num) {
		int num2 = students[num].getHtml() + students[num].getJava() + students[num].getJs() + students[num].getCss();
		
		
		return String.format("HTML(%d) CSS(%d) JS(%d) Java(%d)\n"
													+ "합계 : %d\n"
													+ "평균 : %.1f",
													students[num].getHtml(), students[num].getCss(), students[num].getJs(), students[num].getJava(), num2 ,severage(students[num]));
	}
	
	
	
	
	/** 평균 최고점/최저점 구하기
	 * @return 최고점 : 홍길동(98.3)
	 * 				 최저점 : 신짱구(45.7)
	 */
	public String selectMaxMin() {
		
		Student maxStudent = null;
		Student minStudent = null;
		
		double maxAvg = 0.0;
		double minAvg = 0.0;
		
		// 향상된 for문
		for(Student s : students) {
			
			if(s == null) break;
			
			int sum = s.getHtml() + s.getCss() + s.getJava() + s.getJs();
			double avg = sum/ 4.0;
			
			if(maxAvg == 0.0) { // 첫 번째 바퀴인 경우
				maxStudent = s;
				minStudent = s;
				maxAvg = avg;
				minAvg = avg;
				continue;
			}
			
			if(maxAvg < avg) { // 기존 최대값보다 현재 평균이 더 큰 경우
				maxAvg = avg;
				maxStudent = s;
			}
			
			if(minAvg > avg) { // 기존 최소값보다 현재 평균이 더 작은 경우
				minAvg = avg;
				minStudent = s;
			}
			
		}
		
		return String.format("최고점 : %s(%.1f)\n"
											 + "최저점 : %s(%.1f)\n", 
											 	  maxStudent.getName(), maxAvg, minStudent.getName(), minAvg);
		
	}
	
	
	public float severage(Student s) {
		float num = (s.getHtml() + s.getJava() + s.getJs() + s.getCss())/4.0f;
		return num;
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

//run -> view -> service -> dto
