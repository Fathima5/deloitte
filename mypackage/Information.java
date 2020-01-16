package mypackage;

public class Information {
	int eid;
	int age;
	String ename;
	public Information() {}
	public Information(int eid, int age,String ename) {
		super();
		this.eid = eid;
		this.age = age;
		this.ename = ename;
	}
	public int getEid() {
		if(eid<100 || eid>1000)
			return -1;
		else
			return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getAge() {
		if(age<21 || age>60)
			return -1;
		else
			return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEname() {
		if(ename.matches("^[A-Z].*"))
			return ename;
		else
			return null;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
