import java.awt.EventQueue;
import javax.swing.JFrame; 
 
public class MA_SnakeGame extends JFrame {
public MA_SnakeGame()
{

}
    public MA_SnakeGame(String gameTille) {        
        setTitle(gameTille);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();        
    }
    
    public static void main(String[] args) {        
        EventQueue.invokeLater(() -> {
            //create the game with a game title as follow: The Snake Game (C) Your_Name
            JFrame sgame = new MA_SnakeGame("The Snake Game");
            sgame.setVisible(true);
           JFrame login=new  LoginForm();
           
           
           
        });
    }
}
