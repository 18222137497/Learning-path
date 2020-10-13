package Spring_JDBC;

public class Emp {
	public int id;
	public String name;
	public double balance;
	
	public Emp() {
	}
	public Emp(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", balance=" + balance + "]";
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
