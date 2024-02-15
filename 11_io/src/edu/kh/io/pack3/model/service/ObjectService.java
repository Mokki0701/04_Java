package edu.kh.io.pack3.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {

	/* ObjectInputStream / ObjectOutputStream
	 * 
	 * - Java 객체(Instance == Object)를 입/출력 할 때
	 *   사용하는 바이트 기반 보조 스트림
	 * 	 (보조 스트림 단독 사용 불가능!!!)
	 * 
	 *  **** 직렬화(Serializable) ****
	 *  - 객체(Object)를 직렬(직선) 형태로 변환
	 */
	
	
	/*
	 * 객체를 외부 파일로 출력
	 */
	public void objectOutput() {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		try {
			// .dat 확장자 : data를 담고 있는 파일을 나타내는 확장자
			fos = new FileOutputStream("/io_test/20240215/Member.dat");
			
			oos = new ObjectOutputStream(fos);
			
			// Member 객체 하나 생성
			Member member = new Member("member01", "pass01!", "김회원", 30);
			
			/* ObjectOutputStream을 이용해서 Member객체 출력하기 */
			oos.writeObject(member);
			
			System.out.println("회원 출력 완료");
			
			// [직렬화가 되지 않음]
			// java.io.NotSerializableException: 
			// edu.kh.io.pack3.model.dto.Member
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	/*
	 * 외부 파일로 부터 객체 입력 받기
	 */
	public void objectInput() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			// 파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20240215/Member.dat");
			ois = new ObjectInputStream(fis);
			
			// 스트림을 이용해 파일에 작성된
			// 직렬화된 Member 객체를 읽어와
			// 역직렬화 수행하여 정상적인 Member 객체로 변경
			
			// ois.readObject() : 직렬화된 객체를 읽어와
			//										역질렬화 + Member 객체로 변경
			
			Member member = (Member)ois.readObject();
			
			// 읽어온 내용 확인
			System.out.println(member);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
//	1. 20240215에 노래 파일 만들고
//	2. 텍스트 파일 만들어서 
//	3. 리스트로 내 최애 음악들 플레이리스트 만들고
//	4. 텍스트 파일에 집어넣기
	
	public void practice() {
		
		File file = new File("/io_test/20240215/노래리스트");
		
		if(!file.exists()){
			file.mkdirs();
			System.out.println("노래 폴더 추가 성공");
		}
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		List<String> playList = new ArrayList<String>();
		
		int num = 0;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			
			while(true) {
				System.out.print("노래 이름을 입력하세요.");
				String songName = br.readLine();
				playList.add(songName);
				System.out.println("노래 추가 완료\n"
												 + "더 추가 -> 1번"
												 + "그만 추가 -> 0번");
				String input = br.readLine();
				num = Integer.parseInt(input);
				if(num == 0) break;
			}
			
			// 노래 리스트 완성
			System.out.println("----------------------------------------------");
			
			fos = new FileOutputStream("/io_test/20240215/노래리스트/노래리스트.txt");
			bos = new BufferedOutputStream(fos);
			
			for(String str : playList) {
				bos.write(str.getBytes());
				bos.write("\n".getBytes());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(bos != null)
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
