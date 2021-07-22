package cases;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

class SpinSetupper extends Frame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int xPixel = 1920;
    static int yPixel = 20; 
     
    Image myImage, offScreenImage;
    Graphics offScreenGraphics;
     
    public SpinSetupper() {
	 
         
        try {
          myImage = Toolkit.getDefaultToolkit().getImage("H:\\documents\\pngs\\ak47_case_hardened_covert_red.png"); 
        } 
        catch(Exception e) {}
        setSize(1920,1080);
        setVisible(true);
        moveImage();
         
    }
     
    public void update(Graphics g) {
        paint(g);
    }
     
    public void paint(Graphics g) {
         
        int width  = getWidth();
        int height = getHeight();
         
        if (offScreenImage == null) {
            offScreenImage    = createImage(width, height);
            offScreenGraphics = offScreenImage.getGraphics();
        }
         
        // clear the off screen image
        offScreenGraphics.clearRect(0, 0, width + 1, height + 1);
         
        // draw your image off screen
        offScreenGraphics.drawImage(myImage, xPixel, yPixel, this);
         
        // show the off screen image
        g.drawImage(offScreenImage, 0, 0, this);
         
    }
     
    void moveImage() {
         
        for ( int i = 0 ; i < 100 ; i++ ){
             
            System.out.println("next set of Pixels " + xPixel);
            
            xPixel -=10;
            //yPixel +=1;
            repaint();
             
            // then sleep for a bit for your animation
            try { Thread.sleep(0, 1);}   /* this will pause for 50 milliseconds */
           catch (InterruptedException e) { System.err.println("sleep exception"); }
            
        }
    }
     
    public static void main(String args[]){
     
        SpinSetupper me = new SpinSetupper();
        
    }
     
}