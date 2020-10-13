package jdbc_LX;
/**
 * emp∂‘œÛ¿‡
 * @author 123
 *
 */

import java.util.Date;

public class Emp {
	private int id;
	private String name;
	private char gender;
	private double salary;
	private Date join_date;
	private int dept_id;
	
	public Emp() {
	}
	public Emp(int id, String name, char gender, double salary, Date join_date, int dept_id) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.join_date = join_date;
		this.dept_id = dept_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", join_date="
				+ join_date + ", dept_id=" + dept_id + "]";
	}
	
}
