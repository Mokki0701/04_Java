package edy.kh.poky.pack3.model.dto;

// Inerterface : 접점 (클래스간의 접점을 만드는 용도)

public interface Machine {
	// 인터페이스는 상수형 필드(public static final)만 작성 가능!
	// -> 작성하는 모든 필드가 pulblic static final
	// -> public static finame 구문을 명시적으로 작성하지 않아도
	// public static final로 안삭돤더!
	
	// public static final int VOLT = 200;
	int VOLT = 220;
	
	// 인터페이스는 추상 메서드(public abstract)만 작성 가능
	// -> public abstract 생략 가능
	public abstract void powerOn();
	void powerOff();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
