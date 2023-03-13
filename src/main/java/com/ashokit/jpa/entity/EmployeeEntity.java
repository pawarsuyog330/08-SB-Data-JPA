package com.ashokit.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "EMP")
@NamedQueries({
				@NamedQuery(name="EmployeeEntity.readEmpsOfDept", query = "select e from EmployeeEntity e where e.deptno=?1")
})
public class EmployeeEntity {
	@Id
	@Column(name = "EMPNO")
	private Integer empId;

	@Column(name = "ENAME")
	private String empName;

	@Column(name = "SAL")
	private Double empSal;

	private Integer deptno;

}
