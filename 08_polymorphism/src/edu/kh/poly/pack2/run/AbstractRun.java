package edu.kh.poly.pack2.run;

import edu.kh.poly.pack2.model.service.AbstractService;

public class AbstractRun {
	public static void main(String[]args) {
		
		AbstractService service = new AbstractService();
		
		service.method2();
		
		
		Solution s1 = new Solution();
		
		String s2 = s1.solution(1234);
		
		System.out.println(s2);
	}
}
