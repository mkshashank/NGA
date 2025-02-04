/*3. Polymorphism:Question:
Implement a class hierarchy for Vehicles with a base class Vehicle that contains a method startEngine(). Derive two classes: Car and Motorcycle, both overriding the startEngine() method
to print different messages indicating how their engines are started. Create a method vehicleTestDrive(Vehicle vehicle) that accepts any object of type Vehicle and calls its startEngine()
method. Demonstrate polymorphism by passing different vehicle objects to this method.*/
class Vehicle
{
	public void startEngine()
	{
		System.out.println("Vehicle's engine started");
	}
}

class Car extends Vehicle
{
	public void startEngine()
	{
		System.out.println("Car's engine started");
	}
}

class MotorCycle extends Vehicle
{
	public void startEngine()
	{
		System.out.println("MotorCycle's engine started");
	}
}

public class TestVehicle
{
	public static void vehicleTestDrive(Vehicle vehicle)
	{
		vehicle.startEngine();
	}

	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		MotorCycle m1 = new MotorCycle();
		vehicleTestDrive(v1);
		vehicleTestDrive(c1);
		vehicleTestDrive(m1);
	}
}