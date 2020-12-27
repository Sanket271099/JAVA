package temp_Vehicle;
import Vehicle.Vehicle;
public class Temp_car extends Vehicle {
public String power;
public String color;
public int kitna;
public void print() {
	super.print();
	System.out.println("this is temp car");
}
public Temp_car() {
	super("power",32);
	power="12";
	color="yellow";
	System.out.println("temp_car"+power);
}

}
