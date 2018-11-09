
public class Vehicle {

	private static String _lPlateNum;
	private static String _colour;
	private static String _numOfDoors;

	
	public Vehicle ( 
						String lPlateNum,
						String colour,
						String numOfDoors){
		
		this._lPlateNum = lPlateNum;
		this._colour = colour;
		this._numOfDoors = numOfDoors;
		
	}
	
	public String lPlateNum(){
		return _lPlateNum;
	}
	public String colour(){
		return _colour;
	}
	public String numOfDoors(){
		return _numOfDoors;
	}
}
