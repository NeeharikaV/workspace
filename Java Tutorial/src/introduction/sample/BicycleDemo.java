package introduction.sample;

public class BicycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bicycle bicycle1=new Bicycle();
  Bicycle bicycle2=new Bicycle();
  bicycle1.changeSpeed(50);
  bicycle1.changeGear(2);
  bicycle2.changeGear(3);
  bicycle2.changeSpeed(90);
  bicycle1.printStates();
  bicycle2.printStates();
	}

}
