package T1;

public abstract class Shape {
	private String name;
	private double length;// 周长
	private double area;// 面积

	public abstract double getlength();

	public abstract double getarea();

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
