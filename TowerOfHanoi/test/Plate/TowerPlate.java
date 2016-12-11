package TowerOfHanoi.test.Plate;

/**
 * Implementing the Tower of Hanoi classical algorithm
 * @author Muhammed Ahad
 * e-mail: ahad3112@yahoo.com
 */

import TowerOfHanoi.test.TowerOfHanoi;

public class TowerPlate {
	// size of the plate
	private int plateNo; // plate no define the size of the plate. larger no, larger size.
	private int platePosX; //  platePosX is the tower x position
	private int platePosY;
	private String platePosTower;
	// a static variable to hold the total no of plate
	private static int counter = TowerOfHanoi.n;
	
	// constructor
	// default constructor
	public TowerPlate(){
		platePosX = 0; // initiaL x positon of the tower
		platePosY = counter-1; // initiaL y positon of the tower
		plateNo = TowerOfHanoi.n-platePosY; // hold the plate no
		platePosTower = "left"; // initially every plate will be in the left tower
		counter--;
	}
	
	// setter method. move a plate
	public void movePlate(String newTower, int newPosX,int newPosY){
		platePosTower = newTower;
		platePosX = newPosX;
		platePosY = newPosY;
	}
	
	// changing a plate status
	public void editPlateDetails(String newTower, int plateBeneath){
		this.platePosTower = newTower; // tower name
		// need to change coordinate of the plate
		this.platePosY = plateBeneath;
		if(newTower.equals("left")) this.platePosX = 0;
		else if(newTower.equals("center")) this.platePosX = 10;
		else this.platePosX = 20;
	}
	
	// getter method
	public int getPlateNo(){
		return plateNo;
	}
	
	public int getPlatePosX(){
		return platePosX;
	}
	
	public int getPlatePosY(){
		return platePosY;
	}
	
	public String getPlatePostTower(){
		return platePosTower;
	}
	
	// toString method to get the details of the plates
	public String toString(){
		return String.format("PlateNo:%d, PlaetPosTower: %sTower, PlateCoord(%d,%d)",this.plateNo,
				this.platePosTower,this.platePosX,this.platePosY);
	}
}
