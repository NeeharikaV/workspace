package introduction.sample;

public class Bicycle {
int speed=1;
int gear=1;
void changeGear(int newvalue){
	gear=newvalue;
}
void changeSpeed(int newvalue){
	speed=speed+newvalue;

}
void printStates(){
	System.out.println("speed"+speed);
	System.out.println("gear"+gear);
}
}
