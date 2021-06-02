import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Develop a prey Class.
 * @author Muhammad Atiq
 * @Date 23/May/2021
 
 */
public class MA_Prey extends JPanel {
    /**
     * Constructor for objects of class Prey
     */
    
    
    Image prey;
    
    Image prey_2;
    
    int apple_x; 
    int apple_y;
    
     int apple_x_2; 
    int apple_y_2;
    
    public MA_Prey()
    {
        
        prey = new ImageIcon("resources/apple.png").getImage();
        
        prey_2 = new ImageIcon("images/smiley.png").getImage();
    
    } 
    
    public void paintComponent(Graphics g) {
        g.drawImage(prey, 50, 50, null);
        g.drawImage(prey_2, 200, 200, null);
        repaint();
               
    }
        
    
    /** 
     * Method randomPlacement
     * this method will allow user to view random placement of prey
     * 
     */
    public void randomPlacement()
    {
    
    
    }
    
    public void locateApple(int RAND_POS, int DOT_SIZE) {

        int r = (int) (Math.random() * RAND_POS);
        apple_x= ((r * DOT_SIZE));

        r = (int) (Math.random() * RAND_POS);
        apple_y = ((r * DOT_SIZE));
    }
    
    public void locateApple_2(int RAND_POS, int DOT_SIZE) {

        int r = (int) (Math.random() * RAND_POS);
        apple_x_2= ((r * DOT_SIZE));

        r = (int) (Math.random() * RAND_POS);
        apple_y_2 = ((r * DOT_SIZE));
    }
    
    public void checkApple(int x, int y , int RAND_POS, int DOT_SIZE) {

        if ((x == apple_x) && (y == apple_y)) {

            MA_GameBoard.dots++;
            locateApple(RAND_POS,DOT_SIZE);
        }
    }
    
     public void checkApple_2(int x, int y , int RAND_POS, int DOT_SIZE) {

        if ((x == apple_x_2) && (y == apple_y_2)) {

            MA_GameBoard.dots_2++;
            locateApple_2(RAND_POS,DOT_SIZE);
        }
    }
    
    
}
