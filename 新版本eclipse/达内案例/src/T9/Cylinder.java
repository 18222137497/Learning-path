package T9;

public class Cylinder implements C {
	private double radius;
	private double height;
	private String color;

	public Cylinder(double radius, double height, String color) {
		this.radius = radius;
		this.height = height;
		this.color = color;
	}

	public double area() {// 面积
		return height * 2 * PI * radius + 2 * PI * radius * radius;
	}

	public void setColor(String c) {// 给颜色
		this.color = c;
	}

	public void volume() {// 体积
		System.out.println(PI * radius * radius * height);
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + ", color=" + color + "]";
	}

}
