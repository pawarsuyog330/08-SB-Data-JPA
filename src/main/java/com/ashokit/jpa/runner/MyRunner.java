package com.ashokit.jpa.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jpa.dao.EmployeeEntityRepository;
import com.ashokit.jpa.entity.EmployeeEntity;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	EmployeeEntityRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * EmployeeEntity entity=new EmployeeEntity(); entity.setEmpId(7001);
		 * entity.setEmpName("Rajesh Pawar"); entity.setEmpSal(65000.0);
		 * entity.setDeptno(70); repo.save(entity); System.out.println(entity);
		 * 
		 * 
		 * Optional<EmployeeEntity> opt=repo.findById(7001); if(opt.isPresent()) {
		 * EmployeeEntity e=opt.get(); System.out.println(e.getEmpId()+" "+
		 * e.getEmpName()+" "+ e.getEmpSal()+" " + e.getDeptno()); }
		 * 
		 * 
		 * List<EmployeeEntity> list=repo.findAll(); list.forEach(System.out::println);
		 * 
		 * 
		 * repo.deleteById(7001);
		 * 
		 * 
		 * List<EmployeeEntity> employeeList=repo.findByEmpSalGreaterThanEqual(20000.0);
		 * employeeList.forEach(System.out::println);
		 * 
		 * 
		 * List<String> listNames=repo.fetchEmpNamesOfDeptBySal(60, 25000.0);
		 * listNames.forEach(System.out::println);
		 * 
		 * 
		 * List<EmployeeEntity> listEmp=repo.fetchHighestPaidEmployee();
		 * listEmp.forEach(System.out::println);
		 * 
		 * 
		 * Integer i=repo.deleteEmpOfDept(60); System.out.println(i+" rows deleted");
		 */
		
		List<EmployeeEntity> listEmps=repo.readEmpsOfDept(50);
		listEmps.forEach(System.out::println);

	}

}
