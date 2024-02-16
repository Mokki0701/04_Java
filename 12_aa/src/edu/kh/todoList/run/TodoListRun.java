package edu.kh.todoList.run;

import edu.kh.todoList.model.view.TodoListView;

public class TodoListRun {
	
	public static void main(String[] args) {
		
		// 현재 프로젝트의 흐름
		// Run <-> View <-> TodoListServiceImpl <-> TodoListDAOImpl <-> File
		// Run <-> View <-> Service <-> DAO <-> File
		
		System.out.println("---- 프로그램 실행 ----");
		
		TodoListView view = new TodoListView(); // TodoListView 객체 생성
		
		view.startView();
	}
	
}
