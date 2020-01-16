package com.deloitte.firstmvn.hibsecond.entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="type")
//public class Employee {
public abstract class Employee {
	@Id
	int empid;
	String ename;
	public Employee() {
		super();
	}
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.ename = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
