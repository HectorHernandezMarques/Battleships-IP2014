package uk.ac.gcu.battleships;

/**
 * Class representing the game board.
 * A Grid will contain information about the state of the game,
 * including position of ships, hits and misses.
 * There is one Grid for one player.
 * @author Yann Prono
 * @author Anthony Cerf
 */
public class Grid {
	/** Two-dimensional array which represents the grid. */
	private char[][] board;

	/** Default character used in the Grid. */
	public static final char DEFAULT_CHAR = '-';


	/**
	 * Constructor which creates the square array which represents the game board.
	 * @param size Array's size.
	 */
	public Grid(int size) {
		this.board = new char[size][size];

		for(int i = 0; i<size;i++){
			for(int j = 0;j<size;j++) {
				this.board[i][j] = Grid.DEFAULT_CHAR;
			}
		}
	}

	/**
	 * Method returning the character at a specified position.
	 * @param line Integer corresponding at the number of the line.
	 * @param row Integer corresponding at the number of the row.
	 * @return the character at the specified position.
	 */
	public char returnCharacter(int line, int row) {
		char res = 0;
		try {
			res = this.board[line][row];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("***** POSITION UNDEFINIED *****");
		}
		return res;
	}

	/**
	 * Method displaying the grid into the console.
	 */
	public String toString(){
		// Format
		String format = "%-4s";

		String res = new String(String.format(format,""));;
		char row = 'A';
		int line = 1;

		//loop to display row letter
		for(int i = 0; i<this.board.length;i++){
			res += String.format(format,row);
			row++;
		}

		//loop to display line number and each character
		for(int i = 0; i<this.board.length;i++){
			res+= System.getProperty("line.separator");
			res += String.format(format,line);

			for(int j = 0; j<this.board[i].length;j++){
				res += String.format(format,this.board[i][j]);
			}

			line++;
		}

		// Word wrap
		res+= System.getProperty("line.separator");

		return res;
	}
	
	/**
	 * Getter for the Two-dimensional array
	 * @return The array which represents the Grid. 
	 */
	public char[][] getBoard() {
		return this.board;
	} 
}
