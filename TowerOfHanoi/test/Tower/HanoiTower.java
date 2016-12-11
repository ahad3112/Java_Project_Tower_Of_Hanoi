package TowerOfHanoi.test.Tower;


/**
 * Implementing the Tower of Hanoi classical algorithm
 * @author Muhammed Ahad
 * e-mail: ahad3112@yahoo.com
 */

import TowerOfHanoi.test.Plate.TowerPlate;
import java.util.*;

public class HanoiTower {
	// declare a class variable to count the number of move
	private static int moveCount = 0;
	// each tower hold a plate list. array list
	LinkedList<TowerPlate> plateList;
	// attributes 
	private String towerName; 	// hold the name of the tower
	private int noOfPlate; 		// hold the umber of plates in a tower
	private TowerCoordinate towerCoord; 
	// need another variables to hold the position of the tower for visualization
	public HanoiTower(String name, int noOfPlates){
		towerName = name;
		// setting up the coordinate of the tower
		towerCoord = new TowerCoordinate(towerName);
		
		// intial no of plate in the tower. initially left tower will have all the plates 
		this.noOfPlate = noOfPlates;
		
		// initialize the array list for each tower
		plateList = new LinkedList<TowerPlate>();
		// if left towers, it will have all the plates
		if(name.equals("left")){
			// add every plates to the tower
			initializedAndAddPlatesToLeftTower(this.noOfPlate);
		}
		
	}	
	// setter method
	public void addPlate(){ 
		this.noOfPlate++;
		// change the platePosTower
		
		// change the x and y coordinate of the plate
	}
	// updating moveCount
	public void editMoveCount(){
		moveCount++;
	}
	// removing plate
	public void removePlate(){ 
		noOfPlate --;
	}
	
	// getter method
	// create and add every plates to the left tower
	private void initializedAndAddPlatesToLeftTower(int n){
		for(int i = 0;i<n;i++){
			plateList.add(new TowerPlate());
		}
	}
	// get the plateList
	public LinkedList<TowerPlate> getPlateList(){
		return plateList;
	}
	// get the tower name
	public String getTowerName(){
		return towerName;
	}
	// get the  no of plates in a tower
	public int getNoOfPlates(){
		return noOfPlate;
	}
	// getting the coordinate of the tower	
	// getter function for the position
	public int getPosX(){
		return towerCoord.posX;
	}
	public int getPosY(){
		return towerCoord.posY;
	}
	
	// return the no of move
	public int getMoveCount(){
		return moveCount;
	}
	
	// another class to hold the x,y coordinate of the tower. inner class
	private class TowerCoordinate{
		private int posX;
		private int posY;
		
		// constructor for the TowerCoordinate
		public TowerCoordinate(String name){
			posY = 0;
			if(name.equals("left")){
				posX = 0;
			} else if(name.equals("center")){
				posX = 10;
			} else if(name.equals("right")){
				posX = 20;
			} else{
				System.out.println("Wrong tower name");
			}
		}
		
	}
	
	// toString method to get the details of a tower
	public String toString(){
		return String.format("%sTower, Coord(%d,%d), NoOfPlates: %d.", this.towerName,this.getPosX(),
				this.getPosY(),this.noOfPlate);
	}
}
