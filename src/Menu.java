import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Menu {

    public static void main(String[] args) {
        new Menu();
    }

    public Menu() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Test");
                frame.add(new MenuPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    public class MenuPane extends JPanel {

        public MenuPane() {
            setBorder(new EmptyBorder(10, 10, 10, 10));
            setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.anchor = GridBagConstraints.NORTH;

           

            gbc.anchor = GridBagConstraints.CENTER;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JButton btnStart = new JButton("Start");
            btnStart.setBackground(Color.RED);
            btnStart.setPreferredSize(new Dimension(200, 200));
            
            JButton btnExit = new JButton("Exit");
            btnExit.setBackground(Color.BLUE);
            btnExit.setPreferredSize(new Dimension(200, 200));
            btnExit.addActionListener(new ActionListener(){
          	  public void actionPerformed(ActionEvent e){
          	              System.out.println("Exit");
          	              System.exit(ERROR);
          	  }});
            JPanel buttons = new JPanel(new GridBagLayout());
            buttons.add(btnStart, gbc);
            buttons.add(btnExit, gbc);
            

            gbc.weighty = 1;
            add(buttons, gbc);
        }

    }
        }
