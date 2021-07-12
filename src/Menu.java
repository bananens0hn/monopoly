import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Game game;
	Board board;
	public int Spieleranzahl;
	
    public Menu( Game g) {
    	game = g;
    	setBackground(Color.WHITE);
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
        btnStart.setFont(new Font("Arial", Font.PLAIN, 40));
      //  btnStart.setBackground(Color.RED);
        btnStart.setPreferredSize(new Dimension(200, 100));
        btnStart.addActionListener(new ActionListener(){
        	  public void actionPerformed(ActionEvent e){
        	            buttons.setVisible(false);
        	            SubMenu();
        	  

			
				
			}});
        
        //exit button
        JButton btnExit = new JButton("Exit");
        btnExit.setFont(new Font("Arial", Font.PLAIN, 40));
       //  btnExit.setBackground(Color.BLUE);
        btnExit.setPreferredSize(new Dimension(200, 100));
        
        btnExit.addActionListener(new ActionListener(){
      	  public void actionPerformed(ActionEvent e){
      	              System.exit(ERROR);
      	  }});
        
  
        buttons.add(btnStart, gbc);
        buttons.add(btnExit, gbc);
        

        gbc.weighty = 1;
        add(buttons, gbc);
    }
    public void SubMenu()
    {
    	setBackground(Color.WHITE);
    	setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        JPanel buttons = new JPanel(new GridBagLayout());
        
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

       

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        
        //start button
        JLabel Text = new JLabel("Spieleranzahl");
        Text.setFont(new Font("Arial", Font.PLAIN, 60));
        Text.setPreferredSize(new Dimension(400, 100));
        
       /* JButton btnAnzahl =new JButton("Spieleranzahl");
        btnAnzahl.setFont(new Font("Arial", Font.PLAIN, 60));
        btnAnzahl.setPreferredSize(new Dimension(400, 100));
        btnAnzahl.setEnabled(false);
        */
                   
        JButton btn2 = new JButton("2");
        btn2.setFont(new Font("Arial", Font.PLAIN, 40));
       //  btn2.setBackground(Color.BLUE);
        btn2.setPreferredSize(new Dimension(200, 100));
        btn2.addActionListener(new ActionListener(){
        	  public void actionPerformed(ActionEvent e){
        	              Spieleranzahl = 2;
        	              game.setBoard();
        	              buttons.setVisible(false);
        	  }});
        
       
      	  
        JButton btn3 = new JButton("3");
        btn3.setFont(new Font("Arial", Font.PLAIN, 40));
      //  btn3.setBackground(Color.RED);
        btn3.setPreferredSize(new Dimension(200, 100));
        btn3.addActionListener(new ActionListener(){
      	  public void actionPerformed(ActionEvent e){
      	              Spieleranzahl = 3;
      	            game.setBoard();
  	              buttons.setVisible(false);
      	  }});
       
        	 
        	  
        JButton btn4 = new JButton("4");
        btn4.setFont(new Font("Arial", Font.PLAIN, 40));
      //  btn4.setBackground(Color.RED);
        btn4.setPreferredSize(new Dimension(200, 100));
        btn4.addActionListener(new ActionListener(){
      	  public void actionPerformed(ActionEvent e){
      	              Spieleranzahl = 4;
      	            game.setBoard();
  	              buttons.setVisible(false);
      	  }});
        
        JButton btnBack = new JButton("Zurück");
        btnBack.setFont(new Font("Arial", Font.PLAIN, 40));
          btnBack.setPreferredSize(new Dimension(200, 100));
          btnBack.addActionListener(new ActionListener(){
          	  public void actionPerformed(ActionEvent e){
          	      buttons.setVisible(false);       
          		  OGMenu();
          	             
          	  }});
        
        	 
        	 
        
        buttons.add(Text, gbc);
        buttons.add(btn2, gbc);
        buttons.add(btn3, gbc);
        buttons.add(btn4, gbc);
        buttons.add(btnBack, gbc);

        gbc.weighty = 1;
        add(buttons, gbc);
    }
    private void OGMenu() {
    	
    	setBackground(Color.WHITE);
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
        btnStart.setFont(new Font("Arial", Font.PLAIN, 40));
      //  btnStart.setBackground(Color.RED);
        btnStart.setPreferredSize(new Dimension(200, 100));
        btnStart.addActionListener(new ActionListener(){
        	  public void actionPerformed(ActionEvent e){
        	            buttons.setVisible(false);
        	            SubMenu();
        	  

			
				
			}});
        
        //exit button
        JButton btnExit = new JButton("Exit");
        btnExit.setFont(new Font("Arial", Font.PLAIN, 40));
       //  btnExit.setBackground(Color.BLUE);
        btnExit.setPreferredSize(new Dimension(200, 100));
        
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