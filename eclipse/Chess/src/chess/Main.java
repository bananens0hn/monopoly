package chess;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
public static void main(String args[]) throws AWTException {
	Robot robot=new Robot();
	robot.mouseMove(50, 1080);
	robot.delay(1000);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	robot.delay(1000);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	robot.keyPress(KeyEvent.VK_M);
	robot.keyRelease(KeyEvent.VK_M);
	robot.keyPress(KeyEvent.VK_D);
	robot.keyRelease(KeyEvent.VK_D);
	robot.keyPress(KeyEvent.VK_PERIOD);
	robot.keyRelease(KeyEvent.VK_PERIOD);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	robot.keyPress(KeyEvent.VK_X);
	robot.keyRelease(KeyEvent.VK_X);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	robot.delay(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	robot.delay(1000);
	
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_T);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	
	robot.delay(100);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
}
