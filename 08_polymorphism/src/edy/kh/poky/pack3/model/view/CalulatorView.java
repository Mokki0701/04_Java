package edy.kh.poky.pack3.model.view;

import java.util.Scanner;

import edy.kh.poky.pack3.model.dto.JSWcalculator;

public class CalulatorView {
	
	JSWcalculator cal = new JSWcalculator();
	Scanner sc = new Scanner(System.in);
	
	public void pluss() {
		System.out.print("두개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();

		System.out.println(cal.plus(num1, num2));
	}
	
	public void minuss() {
		System.out.print("두개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();
		
		System.out.println(cal.minus(num1, num2));
	}
	
	public void multii() {
		System.out.print("두개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();
		
		System.out.println(cal.multi(num1, num2));
	}
	
	public void divv() {
		System.out.print("두개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();
		
		System.out.println(cal.div(num1, num2));
	}
	
	public void modd() {
		System.out.print("두개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();
		
		System.out.println(cal.mod(num1, num2));
	}
	
	public void areaOfCirclee() {
		System.out.print("한개의 수를 입력하세요");
		double num1 = sc.nextDouble();		
		
		System.out.println(cal.areaOfCircle(num1));
	}
	public void rangeCheckk() {
		System.out.print("한개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		
		System.out.println(cal.rangeCheck(num1));
	}
	
	public void poww() {
		System.out.print("두개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();
		
		System.out.println(cal.pow(num1, num2));
	}
	
	public void toBinarry() {
		System.out.print("한개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		
		System.out.println(cal.toBinary(num1));
	}
	
	public void toHexadecimall() {
		System.out.print("한개의 수를 입력하세요");
		int num1 = sc.nextInt();		
		
		System.out.println(cal.toHexadecimal(num1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
