package T9;

public class Test {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(1, 1, "绿色");
		System.out.println("圆柱面积	" + c.area());
		c.setColor("红色");
		c.volume();
		System.out.println(c);
	}
}
