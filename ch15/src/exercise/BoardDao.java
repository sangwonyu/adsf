package exercise;
import java.util.*;
public class BoardDao {

	public List<Board> getBoardList() {
		
			List<Board> board = new ArrayList<Board>();
			board.add(new Board("제목1","내용1"));
			board.add(new Board("제목2","내용2"));
			board.add(new Board("제목3","내용3"));
			return board;
		
		
	};
	
}
