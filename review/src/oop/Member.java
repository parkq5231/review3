package oop;

public abstract class Member {

	private String name;
	String id;

	public Member() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sal();

	public void print() {
		System.out.println(name);
	}

}