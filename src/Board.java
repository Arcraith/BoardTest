public class Board {

	private String[][] board;

	public Board() {
		board = new String[3][3];
	}

	public void setMark(String mark, int x, int y)
			throws InvalidPositionException {
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			throw new InvalidPositionException("invalid coordinaates");
		}

		if (board[x][y] == null) {
			board[x][y] = mark;
		} else if (board[x][y].equals("X") || board[x][y].equals("O")) {
			throw new InvalidPositionException("there is a mark already");
		}

	}

	public boolean hasWinner() {
			if (
					board[0][0] != null && board[0][1] != null &&
					board[0][0].equals(board[0][1])
					&& board[0][1].equals(board[0][2]) 
					
					|| board[0][0] != null && board[1][0] != null && 
					board[0][0].equals(board[1][0])
					&& board[1][0].equals(board[2][0])
					
					|| board[0][0] != null && board[1][1] != null &&
					board[0][0].equals(board[1][1])
					&& board[1][1].equals(board[2][2])
					
					|| board[0][1] != null && board[1][1] != null &&
					board[0][1].equals(board[1][1])
					&& board[1][1].equals(board[2][1])
					
					|| board[0][2] != null && board[1][2] != null &&
					board[0][2].equals(board[1][2])
					&& board[1][2].equals(board[2][2])
					
					|| board[0][2] != null && board[1][1] != null &&
					board[0][2].equals(board[1][1])
					&& board[1][1].equals(board[2][0])
					
					|| board[1][0] != null && board[1][1] != null &&
					board[1][0].equals(board[1][1])
					&& board[1][1].equals(board[1][2])
					
					|| board[2][0] != null && board[2][1] != null &&
					board[2][0].equals(board[2][1])
					&& board[2][1].equals(board[2][2])

			) {
				return true;
			}
		return false;
	}
	
	
}
