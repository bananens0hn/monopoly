import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public BoardInformationMenu boardMenu;
	public Board board;
	
	public GamePanel(int SA, String[] Figuren) {
		board = new Board(SA, Figuren);
		boardMenu = new BoardInformationMenu(board);
		
		this.add(board);
		this.add(boardMenu);
	}
}
