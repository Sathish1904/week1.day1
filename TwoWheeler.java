package week1.day1;

public class TwoWheeler {

	int noOfWheels =2;
	short noOfMirrors =2;
	long chassisNumber =123123123;
	boolean isPuntured =false;
	String bikeName ="Yahama";
	double runningKM =4321;
	

//Create object for TwoWheeler and call all the variables inside main method and print the values.

public static void main(String [] args) {
	
	TwoWheeler Bike = new TwoWheeler ();
	
	System.out.println ("My Bike");
	System.out.println ("No Of Wheeles =" + Bike.noOfWheels);
	System.out.println ("No Of Mirroes = " + Bike.noOfMirrors);
	System.out.println ("Chassis Number = " + Bike.chassisNumber);
	System.out.println ("Is Punctured =" + Bike.isPuntured);
	System.out.println ("Bike = " + Bike.bikeName);
	System.out.println ("Kilometer Driven = " + Bike.runningKM);
}	
}
