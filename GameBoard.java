import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameBoard extends JPanel {    
    int xcells = 30;   
    int ycells = 30;
    int szcell = 10;       
       
        setPreferredSize(new Dimension(xcells * szcell, ycells * szcell));        
        setBackground(Color.black);
        setFocusable(true);        
    }

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    public void drawGameBoard(){
    
        }//Method is public because we need to use it in MA_SnakeGame
    private void createBorder(){
    
        }//Method is private because we need to use it in GameBoard
    public void startGame(){
    
        }//Method is public because we need to use it in MA_SnakeGame
    public void eatPrey(){
    
        }//Method is public because we need to use it in MA_SnakeGame
    public void snakeCollideWithBorder(){
    
        }//Method is public because we need to use it in MA_SnakeGame
    public void snakeCollideWithItSelf(){
    
        }//Method is public because we need to use it in MA_SnakeGame
    private void endGame(){
    
        }//Method is private because we need to use it in GameBoard
    private void calculateScore(){
    
        }//Method is private because we need to use it in GameBoard
}
