package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--Car--");
		Car car=new Car();
		car.openSunRoof();
		car.turnOnAC();
		car.applyBreak();
		car.soundHorn();

		System.out.println("--BMW--");
		BMW bmw=new BMW();
		bmw.openSunRoof();
		bmw.turnOnAC();
		bmw.applyBreak();
		bmw.soundHorn();
		bmw.autoPark();

		System.out.println("--AUDI--");

		Audi audi=new Audi();
		audi.openSunRoof();
		audi.turnOnAC();
		audi.applyBreak();
		audi.soundHorn();
		audi.hybridFuel();

		System.out.println("--Auto--");
		Auto auto=new Auto();
		auto.applyBreak();
		auto.soundHorn();
		auto.handStarter();

		System.out.println("--Bajaj--");
		Bajaj baj=new Bajaj();
		baj.applyBreak();
		baj.soundHorn();
		baj.handStarter();
		baj.electriMeter();

	}
}

