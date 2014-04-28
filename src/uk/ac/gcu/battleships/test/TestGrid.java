package uk.ac.gcu.battleships.test;

import static org.junit.Assert.*;
import org.junit.Test;
import uk.ac.gcu.battleships.Grid;

/** 
 * Class for testing the Grid.
 * @author Yann Prono
 * @author Anthony Cerf
 */
public class TestGrid {
	/**
	 * Test the size and contents after the constructor.	
	 */
	@Test
	public void testConstructor() {
		// Initialisation 
		int size = 10;
		Grid g = new Grid(size);

		// TEST FOR SIZE (SQUARE)
		boolean ok = true;
		if(g.getBoard().length != size) {
			ok = false;
		}
		int badSize =size;
		int i = 0;
		while(ok && (i<g.getBoard().length)) {
			if(g.getBoard()[i].length != size) {
				badSize = g.getBoard()[i].length;
				ok = false;
			}
			i++;
		}

		// TEST FOR CONTENT OF GRID
		i = 0;
		boolean charac = true;
		char badChar = '-';
		int j  = 0;
		while(charac && (i<g.getBoard().length)) {
			while(charac && (j<g.getBoard()[i].length)) {
				if(g.getBoard()[i][j] != Grid.DEFAULT_CHAR) {
					badChar = g.getBoard()[i][j];
					charac = false;
				}
				j++;
			}
			i++;
		}

		assertEquals("the Grid should be a square",size,badSize);
		assertEquals("the Grid should contain - in each case of the Grid ",'-',badChar);
	}

	/** 
	 * Test the returnCharacter() method in normals conditions.
	 */
	@Test
	public void testReturnCharacter() {
		// Initialisation
		Grid g = new Grid(5);
		int line = 2;
		int row = 3;
		g.getBoard()[line][row] = 'X';

		// TEST
		char res = g.returnCharacter(line, row);
		char res2 = g.returnCharacter(0, 0);

		assertEquals("The Grid should contains X at ["+line+"]["+row+"]",'X',res);		
		assertEquals("The Grid should contains X at [0][0]",'-',res2);
	}

	/** 
	 * Test the returnCharacter method to throw an Exception.
	 */
	@Test
	public void testReturnCharacterException() {		
		// Initialisation
		Grid g = new Grid(5);
		int row = 3;

		// TEST
		char res = g.returnCharacter(10, row);

		assertEquals("The result should be ' ' (Exception)",' ',res);
	}

}
