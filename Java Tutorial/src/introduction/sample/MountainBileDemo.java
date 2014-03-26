package introduction.sample;

public class MountainBileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle newbicycle=new Bicycle();
    MountainBike mb=new MountainBike();
    newbicycle.changeSpeed(60);
    newbicycle.printStates();
   mb.changeSpeed(60,2);
    mb.printStates();
	}

}
