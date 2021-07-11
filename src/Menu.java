import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Game game;
	Board board;
	
    public Menu( Game g) {
    	game = g;
    	
    	setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        JPanel buttons = new JPanel(new GridBagLayout());
        
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

       

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        
        //start button
        JButton btnStart = new JButton("Start");
        btnStart.setBackground(Color.RED);
        btnStart.setPreferredSize(new Dimension(200, 200));
        
        btnStart.addActionListener(new ActionListener(){
        	  public void actionPerformed(ActionEvent e){
        	            buttons.setVisible(false);
        	            game.setBoard();
        	  }});
        
        //exit button
        JButton btnExit = new JButton("Exit");
        btnExit.setBackground(Color.BLUE);
        btnExit.setPreferredSize(new Dimension(200, 200));
        
        btnExit.addActionListener(new ActionListener(){
      	  public void actionPerformed(ActionEvent e){
      	              System.exit(ERROR);
      	  }});
        
  
        buttons.add(btnStart, gbc);
        buttons.add(btnExit, gbc);
        

        gbc.weighty = 1;
        add(buttons, gbc);
    }
}