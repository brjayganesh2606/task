package net.codejava;

import javax.persistence.Entity;

@Entity
public class employee {
	private String EmpID;
	private String Ename;
	private Integer DeptID;
	private String Salary;
	private String Dname;
	private String Dlocation;

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee(String empID, String ename, Integer deptID, String salary, String dname, String dlocation) {
		super();
		EmpID = empID;
		Ename = ename;
		DeptID = deptID;
		Salary = salary;
		Dname = dname;
		Dlocation = dlocation;
	}

	public String getEmpID() {
		return EmpID;
	}

	public void setEmpID(String empID) {
		EmpID = empID;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public Integer getDeptID() {
		return DeptID;
	}

	public void setDeptID(Integer deptID) {
		DeptID = deptID;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public String getDlocation() {
		return Dlocation;
	}

	public void setDlocation(String dlocation) {
		Dlocation = dlocation;
	}

}
