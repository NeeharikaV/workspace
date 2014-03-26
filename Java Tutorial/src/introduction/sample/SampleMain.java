package introduction.sample;

public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Point point = new Point();
		point.setX(2);
		point.setY(4);
		circle.changeCoordinates(point);
System.out.println(point.getX());
	}

}
