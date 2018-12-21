import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Point point1 = new Point(in.nextInt(),in.nextInt());
		Point point2 = new Point(in.nextInt(),in.nextInt());

		System.out.println(point1.distanceTo(point1, point2));
		System.out.println(point1.midPoint(point1, point2));
		System.out.println("Point " + point1 + ": " + point1.quadrant(point1));
		System.out.println("Point 1: "+ point1.getPoint());
		System.out.println("Point 2: "+ point2.getPoint());
	}
}
