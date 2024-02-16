package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterService {

	/* 문자 기반 스트림
	 * 
	 * - 2byte 문자(char) 단위로 입/출력 하는 스트림
	 * 
	 * - Reader(입력), Writer(출력) 최상위 인터페이스
	 * 
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 데이터 전달
	 */
	
	
	/*
	 * 문자 기반 파일 입력(파일 읽어오기)
	 *  + 보조 스트림 Buffered 사용하기
	 */
	public void fileInput() {
		
		FileReader fr = null; // 문자 기반 파일 입력 스트림
		BufferedReader br = null; // 문자 기반 보조 ㅅ ㅡ트림
		
		try{
			// 문자 기반 스트림 생성
			fr = new FileReader("/io_test/노래가사2.txt");
			br = new BufferedReader(fr);
			// 보조 스트림 생성
//			br = new BufferedReader(fr);
			
			String line = null; // 한 줄을 읽어와 저장할 변수
			
			while(true) {
				
				line = br.readLine();
				
				if(line == null){ // 더 이상 읽어올 내용이 없을 때
					break; // 반복문 종료
				}
				System.out.println(line);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 사용 완료된 스트림 객체 메모리 반환(제거, 닫기)
			
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	
	/**
	 * 문자 기반 파일 출력
	 *  + 보조 스트림 Buffered 이용
	 */
	public void fileOutput() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("오늘은 2월 16일 금요일 입니다.\n");
		sb.append("벌써 금요일\n");
		sb.append("화이팅\n");
		
		String content = sb.toString();
		
		// content에 저장된 문자열을
		
		// /io_test/출력테스트.text
		
		// 파일로 출력하기
		
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("/io_test/출력테스트.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(content);
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			if(bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
