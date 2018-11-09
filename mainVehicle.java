import java.util.Scanner;
public class mainVehicle {
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		String lPlateNum;
		String colour;
		String numOfDoors;
		String Speed;
		String maxSpeed;
		double accelerate;
		double brake;
		
		System.out.println("Enter the Licence Plate Number you would like: ");
		lPlateNum = userInput.nextLine();
		System.out.println("Enter the Colour of car you would like: ");
		colour = userInput.nextLine();
		System.out.println("Enter the number of doors you would like your car to have: ");
		numOfDoors = userInput.nextLine();
		
		Vehicle obj = new Vehicle(lPlateNum, colour, numOfDoors);
		
		String lPlatePrint = obj.lPlateNum();
		String colourPrint = obj.colour();
		String numOfDoorsPrint = obj.numOfDoors();
		
		System.out.println("The licience plate num is " + lPlatePrint + " and the colour of the car is " + colourPrint + " and the num of doors is " +  numOfDoorsPrint );
	}

}
