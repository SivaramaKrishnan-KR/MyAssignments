package week1.day2;

public class TwoWheeler {
	//Assigning values
	int noOfWheels =2;
	short noOfMirrors=2;
	long chassisNumber=32654789L;
	boolean isPunctured = false;
	String bikeName = "Yamaha FZ";
	double runningKM = 2563.365;

	public static void main(String[] args) {
		// Object Creation
		TwoWheeler TW = new TwoWheeler();

		//Print all the values
		System.out.println("Manufacturer" +": " + TW.bikeName);
		System.out.println("ChassisNumber" +": " + TW.chassisNumber);
		System.out.println("Running Kilometer" +": " + TW.runningKM);
		System.out.println("Puncher Status" +": " + TW.isPunctured);
		System.out.println("Number of Wheel" +": " + TW.noOfWheels);
		System.out.println("No of Mirror" +": " + TW.noOfMirrors);
	}

}
