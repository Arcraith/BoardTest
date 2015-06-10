import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BoardTest {

	private Board board;
	
	@Before
	public void initialize(){
		board = new Board();
	}
	
	@Test
	public void leeresBoard(){
		assertEquals(false, board.hasWinner());
	}
	
	@Test
	public void gueltigeMakierungSetzenKeinGewinner(){
		board.setMark("X", 1,1);
		assertEquals(false, board.hasWinner());
	}
	
	@Test
	public void gueltigeMakierungSetzenMitGewinner(){
		board.setMark("X", 0, 0);
		board.setMark("O", 1, 0);
		board.setMark("X", 0, 1);
		board.setMark("O", 1, 1);
		board.setMark("X", 0, 2);
		assertEquals(true, board.hasWinner());
	}
	
	@Test (expected = Exception.class)
	public void ungueltigeMakierungSetzen() throws Exception{
		board.setMark("X", 3, 3);
	}

}
