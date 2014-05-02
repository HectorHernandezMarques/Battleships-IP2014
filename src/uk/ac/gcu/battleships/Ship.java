package uk.ac.gcu.battleships;

public class Ship {
	int shipSize;					//Size of the ship 2, 3 or 4
	int shipPosition_x;			//Ship start position on board; x, y
	int shipPosition_y;
	int shipOrientation;			//0 = horizontal; >0 = vertical
	int[] shipHealth;				//Ship health. bow, rear, stern
	
	public boolean isHit(int x_coord, int y_coord){
		if(this.shipPosition_x == x_coord && this.shipPosition_y == y_coord)
			return true;
		else
			return false;
	}
	
	void setPosition(int x, int y) {
		this.shipPosition_x = x;
		this.shipPosition_y = y;
	}
	
	void setShipSize(int size) {
		this.shipSize = size;
	}
	
	void setShipOrientation (char orientation) {
		
		if (orientation == 'h' || orientation == 'H'){
			this.shipOrientation = 0;
		} 
		else if (orientation == 'v' || orientation == 'V'){
			this.shipOrientation = this.shipSize - 1;
		} 
		else
			this.shipOrientation = 0;
			/*This is to prevent crashing in pre-alpha stage.
			 * Remember to check for the user input char orientation somewhere.
			 */
	}
}
