package util;

public class EmpListTest {
	public static void main(String[] args) {
		EmpList emplist = new EmpList();
		emplist.addEmp(new Emp(1, "홍길동", "인사"));
		emplist.addEmp(new Emp(2, "김김", "기획"));
		emplist.addEmp(new Emp(3, "이이", "개발"));
		// 첫번째 사원의 이름은?
		System.out.println("첫번째 사원의 이름: " + emplist.getName(0));
		// 첫번째 사원 삭제
		// emplist.delEmp(0);
		// 사원의 이름만 출력
//		emplist.getNames();
		// 사원 이름 출력
		emplist.getNameStr();
		// 전체 리스트 출력
		System.out.println(emplist.getList());

	}// end of main
}// end of class
