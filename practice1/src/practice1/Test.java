package practice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> nameList = new ArrayList<String>();
		
		try {
				while(true) {
					System.err.println("추가 이름 입력");
					String name = br.readLine();
					
					if(name.equals("clear")) {
						System.out.println("모든 이름 초기화");
						nameList.clear();
						continue;
					}
					
					if(name.equals("exit")) {
						System.out.println("종료");
						break;
					}
					
					if(nameList.contains(name)) System.out.println("이미 존재하는 이름");
					else {
						System.out.println(name + "추가 완료");
						nameList.add(name);
					}
				}
				
				for(String name : nameList) System.out.println(name);
		
		} catch(Exception e) {
				e.printStackTrace();
		}
	}
}
