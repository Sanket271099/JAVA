package Vehicle;

public class Vehicle {
protected String color;
public int gear;
public void print() {
	System.out.println("color of vehicle is "+color);
	System.out.println("gears in vehicle is "+gear);
}
public Vehicle() {
	System.out.println("Consrutor witout any arguments");
}
public Vehicle(String x,int p) {
	color=x;
	gear=p;
	System.out.println("vehicle constrcutor  "+color+ "  gear is "+gear);

}
}
