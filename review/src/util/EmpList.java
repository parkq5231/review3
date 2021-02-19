package util;

import java.util.ArrayList;

public class EmpList {
	ArrayList<Emp> list;

	public EmpList() {
		list = new ArrayList<>();
	}

	// 추가
	public void addEmp(Emp emp) {
		// to do
		list.add(emp);
	}

	// 해당사원 이름조회
	public String getName(int index) {
		String name = "";
		// to do
		name = list.get(index).name;
		return name;
	}

	// 삭제
	public void delEmp(int index) {
		// to do
		list.remove(0);

	}

	// 전체 이름 조회
	public void getNames() {
//		for (int i = 0; i < list.size(); i++) {
//			String name = "";
//			name = list.get(i).name;
//			System.out.println(name);
//		}
		for (Emp emp : list) {
			System.out.println(emp.name);
		}
	}
	//수정해야됨
	// 전체 이름만 리턴
	public void getNameStr() {
		String names = "";
		for (Emp emp : list) {
			names = emp.name;
			System.out.println(names);
		}
	}

	// list 조회
	public ArrayList<Emp> getList() {
		return list;
	}
}
