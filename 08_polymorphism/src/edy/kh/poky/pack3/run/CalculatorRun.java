package edy.kh.poky.pack3.run;

import java.util.Scanner;

import edy.kh.poky.pack3.model.dto.Calculator;
import edy.kh.poky.pack3.model.dto.JSWcalculator;
import edy.kh.poky.pack3.model.dto.JSWcalculator2;
import edy.kh.poky.pack3.model.dto.Machine;
import edy.kh.poky.pack3.model.view.CalulatorView;

public class CalculatorRun {
	public static void main(String[]args) {
		
		// 인터페이스 장점 :
		// 상속 받은 클래스들의 형태가 똑같거나 비슷하기 때문에
		// 코드 유지 보수 시
		// 참조하는 객체만 변경하면 유지보수가 완료된다!!
		
		Calculator cal = new JSWcalculator2();
		CalulatorView view = new CalulatorView();
		 
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.println("\n----- 계산기 -----");
			System.out.println("1. plus");
			System.out.println("2. minus");
			System.out.println("3. multi");
			System.out.println("4. div"); // 동명이인 X
			System.out.println("5. mod");
			System.out.println("6. areaOfCircle");
			System.out.println("7. rangeCheck");
			System.out.println("8. pow");
			System.out.println("9. toBinary");
			System.out.println("10. toHexadecimal");
			System.out.println("0. 종료");
			
			System.out.println("메뉴를 고르세요 =>");

			num = sc.nextInt();
			
			switch(num) {
			case 1: view.pluss(); break;
			case 2: view.minuss();; break;
			case 3: view.multii();; break;
			case 4: view.divv();; break;
			case 5: view.modd();; break;
			case 6: view.areaOfCirclee();; break;
			case 7: view.rangeCheckk();; break;
			case 8: view.poww();; break;
			case 9: view.toBinarry();; break;
			case 10: view.toHexadecimall();; break;
			case 0: 
				System.out.println("프로그램 종료");
				break;
			default: System.out.println("[잘못 입력]");
			
			}
			
		} while(num != 0);
		
		System.out.println(cal.plus(1, 2));
		System.out.println(cal.minus(1, 2));
		System.out.println(cal.multi(1, 2));
		System.out.println(cal.div(5, 2));
		System.out.println(cal.div(1, 0));
		System.out.println(cal.mod(7, 2));
		System.out.println(cal.areaOfCircle(2));
		System.out.println(cal.rangeCheck(2));
		System.out.println(cal.pow(8, 5));
		System.out.println(cal.toBinary(5));
		System.out.println(cal.toHexadecimal(7));
		
		Machine machine = (Machine)cal;
		machine.powerOn();
		machine.powerOff();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
