package T1;

/**
 * т╡пн
 * 
 * @author 123
 *
 */
public class Circle extends Shape {
	private double Circle_radius;
	private String name = "т╡пн";

	public Circle(double circle_radius) {
		Circle_radius = circle_radius;
		super.setLength(this.getlength());
		super.setArea(this.getarea());
		super.setName(this.name);
	}

	public double getlength() {
		return 2 * Math.PI * Circle_radius;
	}

	public double getarea() {
		return Math.PI * Circle_radius * Circle_radius;
	}

	public double getCircle_radius() {
		return Circle_radius;
	}

	public void setCircle_radius(double circle_radius) {
		Circle_radius = circle_radius;
	}

}
