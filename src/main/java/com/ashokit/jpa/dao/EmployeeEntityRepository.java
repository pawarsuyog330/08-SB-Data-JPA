package com.ashokit.jpa.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ashokit.jpa.entity.EmployeeEntity;

public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntity, Integer> {
	List<EmployeeEntity> findByEmpSalGreaterThanEqual(Double sal);
	
	 @Query(value="select e.empName from EmployeeEntity e where e.empSal>:esal and e.deptno=:dno")
	 List<String> fetchEmpNamesOfDeptBySal(@Param("dno")Integer dept, @Param("esal")Double esal );
	 
	 @Query(value="select * from emp where sal in (select max(sal) from emp)", nativeQuery=true)
	 List<EmployeeEntity> fetchHighestPaidEmployee();
	 
	 @Query(value="delete from EmployeeEntity e where e.deptno=?1")
	 @Modifying
	 @Transactional
	 Integer deleteEmpOfDept(Integer deptno);
	 
	 List<EmployeeEntity> readEmpsOfDept(Integer deptno);

}
