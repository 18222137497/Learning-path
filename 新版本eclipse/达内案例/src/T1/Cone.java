package T1;

/**
 * Χ¶Με
 * 
 * @author 123
 *
 */
public class Cone extends Shape {
	private Shape bottom;
	private double height;
	private String name = "Χ¶Με";

	public Cone(Shape bottom, double height) {
		this.bottom = bottom;
		this.height = height;
		super.setLength(this.getlength());
		super.setArea(this.getarea());
		super.setName(this.name);
	}

	@is3d
	public double getlength() {
		return this.bottom.getArea() * height / 3;
	}

	public double getarea() {
		return this.bottom.getLength() / 2 * height + this.bottom.getArea();
	}

	public Shape getBottom() {
		return bottom;
	}

	public void setBottom(Shape bottom) {
		this.bottom = bottom;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
