package uk.ac.gcu.battleships;

public class Guess {
	private byte x_coord, y_coord;
	
	//CONSTRUCTORS
	
	public Guess(byte x, byte y){
		x_coord=x;
		y_coord=y;
	}
	//METHODS
	public byte get_X(){
		return x_coord;
	}
	
	public byte get_Y(){
		return y_coord;
	}
}
