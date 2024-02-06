package edu.kh.inheritance.run;

import edu.kh.inheritance.model.dto.Child1;
import edu.kh.inheritance.model.dto.Parent;

public class TestRun {
	
	public static void main(String[]args) {
		
		// 부모 객체 Parent 생성
		Parent p1 = new Parent(); // 기본 생성자
		Parent p2 = new Parent("김", "서울시 어딘가", 2000, "G80");
		
		Child1 c1 = new Child1(); // 자식 기본 생성자
		
		// Child1 자식의 기능
		c1.setComputer("삼성 갤릭시 북4");
		c1.setCar("모닝");
		
		// Child1 내부에 생성된 Parent의 기능
		String str1 = c1.inform();
		System.out.println("str1 : " + str1);
		
		// Child1 자식의 기능
		String str2 = c1.informChild1();
		System.out.println("str2 : " + str2);
		
		System.out.println("------------------------------------------");
		
		// Child1 매개 변수 생성자를 이용해서 객체 생성
		Child1 c2 = new Child1("2024 LG GRAM");
		String str3 = c2.informChild1();
		System.out.println("str3 : " + str3
				);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
