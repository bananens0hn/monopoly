import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.bcel.internal.generic.NEW;





public class Menu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Game game;
	Board board;
	public int Spieleranzahl;
	boolean deletall;
	
	int random;
	
	private String figuren[];
	private String names[];
	
	boolean gameCanStart;
	
	
	boolean start;
	
	Menu singleton=this;
    public Menu(Game g) {
    	
    	
    	game = g;
    	deletall = false;
    	start=true;
    	random=new Random().nextInt(11);
    	
    	gameCanStart=false;
    	
    	OGMenu();
    }
    
    public void SubMenu() {
    	
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel buttons = new JPanel(new GridBagLayout());
        
        gbc.gridwidth = GridBagConstraints.REMAINDER;
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
          	    start=true;
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
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        
        //start button
        JButton btnStart = new JButton("Start");
        
        btnStart.setFont(new Font("Arial", Font.PLAIN, 40));
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
        JButton btnExit = new JButton("Exit");
        
        btnExit.setFont(new Font("Arial", Font.PLAIN, 40));
        btnExit.setPreferredSize(new Dimension(200, 100));
        
        btnExit.addActionListener(new ActionListener(){
      	  public void actionPerformed(ActionEvent e){
      	              System.exit(ERROR);
      	  }});
        
  
        buttons.add(btnStart, gbc);
        buttons.add(btnExit, gbc);
        
        add(buttons, gbc);
    }
    
    public void NameMenu() {
    	
    	String[] figureString = {"Schiff", "Flugzeug", "Hut", "Auto"};
    	JLabel[] playerLabel = new JLabel[Spieleranzahl];
    	JTextField[] playerName = new JTextField[Spieleranzahl];
    	JComboBox[] playerFigure = new JComboBox[Spieleranzahl];
    	figuren = new String[Spieleranzahl];
    	names = new String[Spieleranzahl];
    	
    	 GridBagLayout layout = new GridBagLayout();
    	 GridBagConstraints gbc = new GridBagConstraints();
    	 
    	 
    	 JPanel buttons = new JPanel(new GridBagLayout());
    	 buttons.setBackground(Color.WHITE);
    	 
    	 gbc.gridwidth = GridBagConstraints.REMAINDER;
         gbc.anchor = GridBagConstraints.CENTER;
         gbc.fill = GridBagConstraints.VERTICAL;
         
       
         
         for(int i = 0; i < Spieleranzahl; i++) {
        	 playerLabel[i] = new JLabel("Player " + (i + 1) + ": ", JLabel.TRAILING);
        	 playerName[i] = new JTextField(30);
        	 
        	 playerFigure[i] = new JComboBox(figureString);
        	 playerFigure[i].setSelectedIndex(3);
        	 playerFigure[i].addActionListener(playerFigure[i]);
        	 
        	 //irgendwie den decided option bei den anderen rausnehmen???
        	 
        	
        	 
        	 buttons.add(playerLabel[i]);
        	 buttons.add(playerName[i]);
        	 buttons.add(playerFigure[i], gbc);
        	 
        	 
        	 
        	
         }
         
      
         
         
         
         JButton btnBack = new JButton("Zurück");
         btnBack.setFont(new Font("Arial", Font.PLAIN, 20));
         btnBack.setPreferredSize(new Dimension(100, 50));
         btnBack.addActionListener(new ActionListener(){
           	  public void actionPerformed(ActionEvent e){
           	      buttons.setVisible(false); 
           	      start=false;
           		  SubMenu();          	             
           	  }
         });
         
         JButton btnStart = new JButton("Start");
         btnStart.setFont(new Font("Arial", Font.PLAIN, 20));
         btnStart.setPreferredSize(new Dimension(100, 50));
         btnStart.addActionListener(new ActionListener(){
           	  public void actionPerformed(ActionEvent e){
           		//set figuren array
           		  String combined=null;
           		  for(int i = 0; i < Spieleranzahl; i++) {
           			  figuren[i] = (String) playerFigure[i].getSelectedItem();
           			  names[i] = (String) playerName[i].getText();
           			  combined=combined+figuren[i];
           			  }
           		 switch (Spieleranzahl) {
				case 2:
					if(!figuren[0].contentEquals(figuren[1])) {
						gameCanStart=true;
					}
					break;
				case 3:
					if(figuren[0].contentEquals(figuren[1])||figuren[0].contentEquals(figuren[1])||figuren[0].contentEquals(figuren[2])||figuren[1].contentEquals(figuren[2])) {
						
					}else {
						gameCanStart=true;
					}
				case 4:
					if(combined.contains("Hut")&&combined.contains("Schiff")&&combined.contains("Flugzeug")&&combined.contains("Auto")) {
						gameCanStart=true;
					}
				default:
					break;
				}
           		
           		 if(gameCanStart) {
           		buttons.setVisible(false);
	            deletall=true;
	            removeAll();
	       //   System.out.println(figuren[0]+ figuren[1]+figuren[2]+figuren[3]);
	            game.setBoard(Spieleranzahl, figuren,singleton, names);       
           		 }else {
					System.out.println("geht nicht");
				}
           	  } 
         });
         
         buttons.add(btnStart, gbc);
         buttons.add(btnBack, gbc);
         
         this.add(buttons, gbc);
         
    }
    private String conv(int i) {
    	switch (i) {
		case 0:
			return "Schiff";
		
		case 1: 
			return "Flugzeug";
		case 2:
			return "Hut";
		case 3:
			return "Auto";
		default:
			break;
		}
    	return null;
    }
   
   public void paintComponent(Graphics g) {
   	super.paintComponent(g);
   	
   	if(start) {
   	try {
		g.drawImage(ImageIO.read(new File("src/Assets/wyldes_wallpaper.jpg")), 0,0, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height, null);
		//just a test
		
   	}
		catch (Exception e) {
			// TODO: handle exception
		}
   	}
   	try {
		
	 
   	if(random==0) {
   		g.drawImage(ImageIO.read(new File("src/Assets/Monopoly_logo.png")), game.windowWidth / 2 +300, 0, 1212 / 4 * 3, 324 / 4 * 3, null);
   	}else if(random==1||random==2) {
   		g.drawImage(ImageIO.read(new File("src/Assets/monypolo.png")), game.windowWidth / 2 +250, 50, 1212 / 4 * 3, 324 / 4 * 3, null);
   	}else if(random==3||random==4) {
   		g.drawImage(ImageIO.read(new File("src/Assets/moonoply.png")), game.windowWidth / 2 +250, 50, 1212 / 4 * 3, 324 / 4 * 3, null);
   	}else if(random==5||random==6) {
   		g.drawImage(ImageIO.read(new File("src/Assets/mopolyno.png")), game.windowWidth / 2 +250, 50, 1212 / 4 * 3, 324 / 4 * 3, null);
   	}else if(random==7||random==8) {
   		g.drawImage(ImageIO.read(new File("src/Assets/moponoly.png")), game.windowWidth / 2 +250, 50, 1212 / 4 * 3, 324 / 4 * 3, null);
   	}else if(random==9||random==10) {
   		g.drawImage(ImageIO.read(new File("src/Assets/pomonoly.png")), game.windowWidth / 2 +250, 50, 1212 / 4 * 3, 324 / 4 * 3, null);
   	}
   	}
   	catch (Exception e) {
		// TODO: handle exception
	}
 
   	if(deletall) {
   		g.clearRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
   		deletall=false;
   	}
   }
}
     	  
    

    