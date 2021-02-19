package oop;

//교수
public class Prof extends Member {

	String dept;

	@Override // implement method redefine
	public void sal() {
		System.out.println("교수의 급여입니다.");
	}

	@Override
	public void print() {
		super.print();
		System.out.println("김교수");
	}

} // end of class