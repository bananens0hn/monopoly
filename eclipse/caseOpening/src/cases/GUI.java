package cases;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class GUI  {
private JFrame mainFrame;
private JButton button;
private JPanel panel;
private Image csgoIm;
private Image caseIm;
private ImageIcon csgoIc;
private ImageIcon caseIc;
private JLabel label;
private JLayeredPane layeredPane;

private ImageIcon rare;
private JLabel label2;

public GUI() {
	mainFrame=new JFrame("CSGO Case OP");
	csgoIm=Toolkit.getDefaultToolkit().createImage("H:\\documents\\pngs\\csgo.jpg");
	caseIm=Toolkit.getDefaultToolkit().createImage("H:\\documents\\pngs\\owncase.png");
	csgoIc=new ImageIcon("H:\\documents\\pngs\\csgo.jpg");
	caseIc=new ImageIcon("H:\\documents\\pngs\\owncase.png");
	
	
	
	button=new JButton("Power case", caseIc);
	panel=new JPanel();
	label=new JLabel(csgoIc);
	layeredPane=new JLayeredPane();
	
	rare=new ImageIcon("H:\\documents\\pngs\\yellow_drop.jpg");

	
	
	  
	    //need to do absolute positioning because by default LayeredPane has null layout,
	button.setForeground(Color.cyan);
	button.setHorizontalTextPosition(SwingConstants.CENTER);
	button.setVerticalTextPosition(SwingConstants.BOTTOM);
	button.setIconTextGap(-45);
	button.setBounds(900, 100, 256, 256);
	button.setOpaque(false);
	button.setContentAreaFilled(false);
	button.setBorderPainted(false);
	button.setToolTipText("open Power case");
	
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("suces");
			button.setVisible(false);
			label2.setVisible(true);
		
		}
	});
	label.setSize(1920, 1080);
	label.add(button);
	
	
	//layeredPane.add(new AnimationPane());
	//layeredPane.add(label, 1);
	
	//mainFrame.setLayeredPane(layeredPane);
	mainFrame.add(new AnimationPane());
	layeredPane.setPreferredSize(new Dimension(1920, 1080));
	mainFrame.setSize(new Dimension(1920, 1080));
	
}

public void setVisible() {
	
	mainFrame.setVisible(true);
	layeredPane.setVisible(true);
}
}
class AnimationPane extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage boat;
    private int xPos = 0;
    private int direction = 1;

    public AnimationPane() {
        try {
            boat = ImageIO.read(new File("H:\\documents\\pngs\\yellow_drop.jpg"));
            Timer timer = new Timer(0, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    xPos += direction*2;
                    if (xPos + boat.getWidth() > getWidth()) {
                        xPos = getWidth() - boat.getWidth();
                        direction *= -1;
                    } else if (xPos < 0) {
                        xPos = 0;
                        direction *= -1;
                    }
                    repaint();
                }

            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return boat == null ? super.getPreferredSize() : new Dimension(boat.getWidth() * 4, boat.getHeight());
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int y = getHeight() - boat.getHeight();
        g.drawImage(boat, xPos, y, this);

    }

}

