package util.map;

import java.util.HashMap;
import java.util.Set;

import util.Emp;

public class MapUtil {
	HashMap<Integer, Emp> map;

	public MapUtil() {
		map = new HashMap<>();
	}

	// 추가
	public void addEmp(Emp emp) {
		map.put(emp.id, emp);
	}

	// 수정
	public void updEmp(Emp emp) {
		map.put(emp.id, emp);
	}

	// 삭제
	public void delEmp(Integer id) {
		map.remove(id);
	}

	// 사번으로 이름 조회
	public String getName(Integer id) {
		String name = "";
		name = map.get(id).name;
		return name;
	}

	// 맵 리턴
	public HashMap<Integer, Emp> getMap() {
		return map;
	}

	//전체이름조회
	public void getNames() {
		for(Integer keys : map.keySet()) {
			System.out.println(map.get(keys).name);
		}
		
	}
	
	// 전체이름만조회 map.keySet() --> Iterator ->for
	// 하다 말았음
	public HashMap<Integer, Emp> getList() {
		Set<Integer> id = map.keySet();
		id.iterator();

		return map;
	}
}
