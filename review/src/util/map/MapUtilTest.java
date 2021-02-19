package util.map;

import util.Emp;

public class MapUtilTest {
	public static void main(String[] args) {

		MapUtil map = new MapUtil();
		map.addEmp(new Emp(1, "홍길동", "인사"));
		map.addEmp(new Emp(2, "김김김", "기획"));
		map.addEmp(new Emp(3, "이이이", "개발"));

		// 2번 사번의 이름을 출력
		String name = map.getName(2);
		System.out.println("2번 사번의 이름은 :" + name);
		//사원 수정
		map.updEmp(new Emp(1,"김밥","만두"));
		// 2번 사번 삭제
//		map.delEmp(2);
		// 전체 사원 이름 출력
		map.getNames();
		// 전체출력
		System.out.println(map.getMap());

	}// end of main
}// end of class
