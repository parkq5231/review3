package oop;

import java.util.ArrayList;

public class OOPTest {

	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<>();

		Member member; // 부모타입의 참조 변수(다형성)

		member = new Prof();
		member.setName("김유신");
		list.add(member);

		member = new Emp();
		member.setName("홍길동");
		list.add(member);

		// for 사용하여 sal print method 호출

		for (Member m : list) {
			m.print();
			m.sal();
			if (m instanceof Emp) { // 참조하는 대상이 Emp라면 이라는 의미

				// class끼리의 형변환은 부모 자식간에만 가능
				((Emp) m).meth(); // down casting(형변환)
			}
		}

	}// end of main
}// end of class
