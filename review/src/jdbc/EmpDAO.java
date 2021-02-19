package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	// 전체조회 select * from employees
	public ArrayList<EmpVO> selectList() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT "//
					+ "EMPLOYEE_ID, "//
					+ "FIRST_NAME, "//
					+ "LAST_NAME, "//
					+ "EMAIL, "//
					+ "PHONE_NUMBER, "//
					+ "HIRE_DATE, "//
					+ "JOB_ID, "//
					+ "SALARY, "//
					+ "COMMISSION_PCT, "//
					+ "MANAGER_ID, "//
					+ "DEPARTMENT_ID "//
					+ "FROM EMPLOYEES "//
					+ "ORDER BY EMPLOYEE_ID";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getString(1));
//				vo.setEmployee_id(rs.getString("employee_id"));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setEmail(rs.getString(4));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			JdbcUtil.disconnect(conn);
		}

		return list;
	}

	// 단건조회 select * from employees where employee_id = ?;
	public EmpVO selectOne(String id) {
		EmpVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT "//
					+ "EMPLOYEE_ID, "//
					+ "FIRST_NAME, "//
					+ "LAST_NAME, "//
					+ "EMAIL, "//
					+ "PHONE_NUMBER, "//
					+ "HIRE_DATE, "//
					+ "JOB_ID, "//
					+ "SALARY, "//
					+ "COMMISSION_PCT, "//
					+ "MANAGER_ID, "//
					+ "DEPARTMENT_ID "//
					+ "FROM EMPLOYEES "//
					+ "WHERE EMPLOYEE_ID = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			if (rs.next()) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getString(1));
//				vo.setEmployee_id(rs.getString("employee_id"));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setEmail(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			JdbcUtil.disconnect(conn);
		}
		return vo;
	}

	// insert
	public void insert(EmpVO vo) {
		try {
			// 1.connect
			JdbcUtil.connect();
			// 2. statement(sql구문)
			String sql = "INSERT INTO EMPLOYEES "//
					+ "EMPLOYEE_ID, " //
					+ "LAST_NAME, "//
					+ "EMAIL, "//
					+ "HIRE_DATE, "//
					+ "JOB_ID "//
					+ "VALUES(?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			// 3.execute
			psmt.setString(1, vo.getEmployee_id());
			psmt.setString(2, vo.getLast_name());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getHire_date());
			psmt.setString(5, vo.getJob_id());
			int r = psmt.executeUpdate();
			System.out.println(r + "건이 등록됨.");
			// 4.resultset(select = 조회결과)
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5.close
			JdbcUtil.disconnect(conn);
		}
	} // end of insert

	// update
	public void update(EmpVO vo) {
		try {
			// 1.connect
			JdbcUtil.connect();
			// 2.psmt(sql구문)

			// 3.execute

			// 4.resultset(select = 조회결과)
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5.close
			JdbcUtil.disconnect(conn);
		}

	} // end of update

} // end of class