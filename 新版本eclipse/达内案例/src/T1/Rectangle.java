package T1;

/**
 * ¾ØÐÎ
 * 
 * @author 123
 *
 */
public class Rectangle extends Shape {
	private double Rectangle_long;
	private double Rectangle_wide;
	private String name = "¾ØÐÎ";

	public Rectangle(double rectangle_long, double rectangle_wide) {
		Rectangle_long = rectangle_long;
		Rectangle_wide = rectangle_wide;
		super.setLength(this.getlength());
		super.setArea(this.getarea());
		super.setName(this.name);
	}

	public double getlength() {
		return 2 * (Rectangle_long + Rectangle_wide);
	}

	public double getarea() {
		return Rectangle_wide * Rectangle_long;
	}

	public double getRectangle_long() {
		return Rectangle_long;
	}

	public void setRectangle_long(double rectangle_long) {
		Rectangle_long = rectangle_long;
	}

	public double getRectangle_wide() {
		return Rectangle_wide;
	}

	public void setRectangle_wide(double rectangle_wide) {
		Rectangle_wide = rectangle_wide;
	}

}
