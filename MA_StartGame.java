import java.awt.EventQueue;
import javax.swing.JFrame;

public class MA_StartGame extends JFrame {

    public MA_StartGame() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new MA_GameBoard());
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new MA_StartGame();
            ex.setVisible(true);
        });
    }
}


