package introduction.sample;

public class MountainBike extends Bicycle{
	int speed;
	void changeSpeed(int value,int additional)
	{
		speed= value-additional;
	}
	void printStates(){
		System.out.println("speed"+speed);
	}
}
