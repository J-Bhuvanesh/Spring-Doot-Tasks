package com.example.CKP.entity;

import java.io.Serializable;


import lombok.EqualsAndHashCode;
@EqualsAndHashCode

public class EmployeeCPKId implements Serializable{

	    private int employeeId;
	    private int deptId;
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		public EmployeeCPKId() {}
		public EmployeeCPKId(int employeeId, int deptId) {
			super();
			this.employeeId = employeeId;
			this.deptId = deptId;
		}
	    
}
