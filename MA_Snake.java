import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @author Muhammad Atiq
 * @Date 23/May/2021
 */
public class MA_Snake extends JPanel
{
    
    Image head;
    Image tail;
    
    Image head_2;
    Image tail_2;

    /**
     * Constructor for objects of class Snake
     */
    public MA_Snake() {
        // initialise instance variables   
        head = new ImageIcon("resources/head.png").getImage();
        tail = new ImageIcon("resources/dot.png").getImage();
        
        head_2 = new ImageIcon("images/head.png").getImage();
        tail_2 = new ImageIcon("images/tail.png").getImage();

    }
    
    /**
     * Method eatPrey
     * the snake will eat the prey
     */
    public void eatPrey()
    {
    
    }
    
    /**
     * Method changeDirection
     * the snake will change it direction through arrow keys
     */
    public void changeDirection()
    {
    
    }
    
    /**
     * Method growLonger
     * the snake will grow longer when it will eat prey
     */
    public void growLonger()
    {
    
    }
    
    /**
     * Method changeSpeed
     * the snake will increase speed when it will eat prey
     */
    public void changeSpeed()
    {
    
    }

}
