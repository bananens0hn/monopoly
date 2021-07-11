import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	public BoardInformationMenu boardMenu;
	public Board board;
	
	public GamePanel() {
		board = new Board();
		boardMenu = new BoardInformationMenu(board);
		
		this.add(board);
		this.add(boardMenu);
	}
}
