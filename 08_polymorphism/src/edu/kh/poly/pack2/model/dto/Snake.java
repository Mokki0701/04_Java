package edu.kh.poly.pack2.model.dto;

public class Snake extends Animal {

	private boolean poison; // 독 유무
	
	public Snake() {}
	
	public Snake(String type, boolean poison) {
		super(type);
		this.poison = poison;
	}

	@Override
	public void eat() {
		System.out.println("뱀은 쉬익쉬익 먹는다");
	}
	
	@Override
	public void sleep() {
		System.out.println("뱀은 겨울잠을 잔다");
	}
	
	public boolean isPoison() {
		return poison;
	}

	public void setPoison(boolean poison) {
		this.poison = poison;
	}

	public String toString() {
		return super.toString()	+ " / 독 유무 : " + poison;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
