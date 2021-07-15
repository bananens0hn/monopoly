import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	boolean deletall;
	public Player[] Spieler;
	public int[] Figuren;
	
    public Menu( Game g) {
    	game=g;
    	deletall=false;
  OGMenu();
    }
    private void OGMenu() {
   	 JButton btnExit = new JButton("Exit");
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
       	            deletall=true;
       	            removeAll();
       	            updateUI();
       	            SubMenu();
       	           

			
				
			}});
       
       //exit button
      
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
        Text.setOpaque(true);
        Text.setBackground(Color.WHITE);
        Text.setFont(new Font("Arial", Font.PLAIN, 60));
        Text.setPreferredSize(new Dimension(400, 100));
        
     
                   
        JButton btn2 = new JButton("2");
        btn2.setFont(new Font("Arial", Font.PLAIN, 40));
       //  btn2.setBackground(Color.BLUE);
        btn2.setPreferredSize(new Dimension(200, 100));
        btn2.addActionListener(new ActionListener(){
        	  public void actionPerformed(ActionEvent e){
        	              Spieleranzahl = 2;
        	              deletall=true;
        	              removeAll();
        	              NameMenu();
        	              updateUI();
        	  }});
        
       
      	  
        JButton btn3 = new JButton("3");
        btn3.setFont(new Font("Arial", Font.PLAIN, 40));
      //  btn3.setBackground(Color.RED);
        btn3.setPreferredSize(new Dimension(200, 100));
        btn3.addActionListener(new ActionListener(){
      	  public void actionPerformed(ActionEvent e){
      	              Spieleranzahl = 3;
      	            deletall=true;
  	              removeAll();
  	              NameMenu();
  	            updateUI();
      	  }});
       
        	 
        	  
        JButton btn4 = new JButton("4");
        btn4.setFont(new Font("Arial", Font.PLAIN, 40));
      //  btn4.setBackground(Color.RED);
        btn4.setPreferredSize(new Dimension(200, 100));
        btn4.addActionListener(new ActionListener(){
      	  public void actionPerformed(ActionEvent e){
      	              Spieleranzahl = 4;
      	            deletall=true;
  	              removeAll();
  	             NameMenu();
  	             updateUI();
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
    
    public void start() {
    	 game.setBoard();
    	 updateUI();
    }
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	if(deletall) {
    		g.clearRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    		deletall=false;
    	}
    }
    
    public void NameMenu() {
    
    	
     	setBackground(Color.WHITE);
     	setBorder(new EmptyBorder(10, 10, 10, 10));
         setLayout(new GridBagLayout());
         
        
 			Zug(0, true, true, true, true); 
 			
 		}
    
    
    public void Zug(int i, boolean fig1, boolean fig2, boolean fig3, boolean fig4) {
         Figuren = new int[Spieleranzahl];
    	JLabel text = new JLabel ("P" + (i + 1) + " Wählt");
         text.setPreferredSize(new Dimension(200, 100));
         text.setFont(new Font("Arial", Font.PLAIN, 40));
         text.setOpaque(true);
         text.setBackground(Color.white);
     	
     	JButton Fig1 = new JButton ("Fig1");
     	Fig1.setEnabled(fig1);
     	Fig1.setPreferredSize(new Dimension(200,200));
     	Fig1.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     				if(Spieleranzahl > i + 1) { 
     					deletall=true;
     	  	              removeAll();    	  	             
     	  	              Zug(i + 1, false, fig2, fig3 ,fig4);
     					updateUI();
     					Figuren[i] = 0;
     				}
     					
     					if(Spieleranzahl == i + 1) {
     						deletall=true;
       	  	              removeAll();  
     						start();
     						updateUI();
     					}
     					
     				
     		} } ) ;
     	JButton Fig2 = new JButton ("Fig2");
     	Fig2.setEnabled(fig2);
     	Fig2.setPreferredSize(new Dimension(200,200));
     	Fig2.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     				if(Spieleranzahl > i + 1) { 
     					  deletall=true;
     	  	              removeAll();    	  	             
     	  	              Zug(i + 1, fig1, false, fig3 ,fig4);
     					updateUI();
     					Figuren[i] = 1;
     				}
     					if(Spieleranzahl == i + 1) {
     						deletall=true;
         	  	              removeAll();  
       						start();
       						updateUI();
     					}
     					
     				
     		} } ) ;
     	JButton Fig3 = new JButton ("Fig3");
     	Fig3.setEnabled(fig3);
     	Fig3.setPreferredSize(new Dimension(200,200));
     	Fig3.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     				if(Spieleranzahl > i + 1) { 
     					  deletall=true;
     	  	              removeAll();    	  	             
     	  	              Zug(i + 1, fig1, fig2, false ,fig4);
     					updateUI();
     					Figuren[i] = 2;
     				}
     					if(Spieleranzahl == i + 1) {
     						deletall=true;
         	  	              removeAll();  
       						start();
       						updateUI();
     					}
     					
     				
     		} } ) ;
     	JButton Fig4 = new JButton ("Fig4");
     	Fig4.setEnabled(fig4);
     	Fig4.setPreferredSize(new Dimension(200,200));
     	Fig4.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     				if(Spieleranzahl > i + 1) { 
     					  deletall=true;
     	  	              removeAll();    	  	             
     	  	              Zug(i + 1, fig1, fig2, fig3 ,false);
     					updateUI();
     					Figuren[i] = 3;
     				}
     					if(Spieleranzahl == i + 1) {
     						deletall=true;
         	  	              removeAll();  
       						start();
       						updateUI();
     					}
     				
     		} } ) ;
     	
     	JButton btnExit = new JButton ("Exit");
     	  btnExit.addActionListener(new ActionListener(){
          	  public void actionPerformed(ActionEvent e){
          	              System.exit(ERROR);         	              
          	  } } ) ;
     	  JButton Back = new JButton ("Zurück");
     	   Back.addActionListener(new ActionListener() {
     		   public void actionPerformed(ActionEvent e) {
     			  deletall=true;
  	            removeAll();
  	            updateUI();
  	            SubMenu();
     			   		
     		   }  } );

         GridBagConstraints gbc = new GridBagConstraints();
        
         JPanel buttons = new JPanel(new GridLayout());
         buttons.setLayout(new GridLayout(2, 2));
         JPanel Buttons2 = new JPanel(new GridBagLayout());
      // Buttons2.setLayout(new BoxLayout(Buttons2, BoxLayout.X_AXIS));
         JPanel TextPanel = new JPanel (new GridBagLayout());
        
         
         gbc.gridwidth = GridBagConstraints.REMAINDER;
         gbc.anchor = GridBagConstraints.NORTH;

        

         gbc.anchor = GridBagConstraints.CENTER;
         gbc.fill = GridBagConstraints.HORIZONTAL; 
         
       
               
   TextPanel.add(text, gbc);
   TextPanel.setBackground(Color.white);
   buttons.add(Fig1,gbc);
   buttons.add(Fig2,gbc);
   buttons.add(Fig3,gbc);
   buttons.add(Fig4,gbc);
   Buttons2.add(Back, gbc);
   Buttons2.add(btnExit, gbc);  
   Buttons2.setBackground(Color.white);
         gbc.weighty = 1;
         add(TextPanel, gbc);
         add(buttons, gbc);
         add(Buttons2, gbc);
    }
}    