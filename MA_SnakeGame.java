import java.awt.EventQueue;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * @author Muhammad Atiq
 * @Date 23/May/2021
 */

public class MA_SnakeGame extends JFrame implements ActionListener {
    private JLabel snakegamelabel;
    private JLabel gameoverlabel;
    private JButton clicktoplaylabel;
    private JLabel toplayersscorelabel;   
    private JLabel currentplayerscorelabel;
    private JLabel snakeimagelabel;
    private JLabel namelabel;
    private JButton quitlabel;
    private Graphics g;
    
     public MA_SnakeGame(String SnakeGame) {  
        super(SnakeGame);
        //setTitle(SnakeGameTille);
        //setResizable(true);
        //setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack();    

        snakegamelabel = new JLabel("My Snake Game©");       
        gameoverlabel = new JLabel("GAME OVER");
        clicktoplaylabel = new JButton("CLICK TO PLAY");
        toplayersscorelabel = new JLabel("TOP LAYER'S SCORE");   
        currentplayerscorelabel = new JLabel("CURRENT PLAYER SCORE"); 
        snakeimagelabel = new JLabel();
        namelabel = new JLabel("PROG5001:2021 Muhammad Atiq");
        quitlabel = new JButton("QUIT");
        
        JPanel mytopPanel = new JPanel(new GridBagLayout());
        mytopPanel.setBackground(Color.blue);
        mytopPanel.setBounds(10,10,1366,50);
        
        GridBagConstraints mytopPanelConstraint = new GridBagConstraints();
        mytopPanelConstraint.anchor = GridBagConstraints.NORTH;
        mytopPanelConstraint.insets = new Insets(10, 10, 10, 10);
        
        snakegamelabel.setForeground(Color.white);
        mytopPanel.add(snakegamelabel,mytopPanelConstraint);
        add(mytopPanel);

        JPanel myleftPanel = new JPanel(new GridBagLayout());
        myleftPanel.setBackground(Color.black);
        myleftPanel.setBounds(10,10,550,700);
        
        GridBagConstraints myLeftConstraints = new GridBagConstraints();
        myLeftConstraints.anchor = GridBagConstraints.WEST;
        myLeftConstraints.insets = new Insets(10, 10, 10, 10);
        
        myLeftConstraints.gridx = 0;
        myLeftConstraints.gridy = 0;     
        gameoverlabel.setForeground(Color.white);
        myleftPanel.add(gameoverlabel,myLeftConstraints);
        
        myLeftConstraints.gridx = 0;
        myLeftConstraints.gridy = 1;
        clicktoplaylabel.setForeground(Color.white);
        clicktoplaylabel.setBackground(Color.black);
        clicktoplaylabel.addActionListener(this);
        myleftPanel.add(clicktoplaylabel, myLeftConstraints);
        add(myleftPanel);
                
        JPanel myrightPanel = new JPanel(new GridBagLayout());
        GridBagConstraints myrightconstraint = new GridBagConstraints();
        myrightconstraint.anchor = GridBagConstraints.EAST;
        myrightconstraint.insets = new Insets(10, 10, 10, 10);
        
        myrightconstraint.gridx = 0;
        myrightconstraint.gridy = 0; 
        toplayersscorelabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        myrightPanel.add(toplayersscorelabel, myrightconstraint);
        
        myrightconstraint.gridx = 0;  
        myrightconstraint.gridy = 1;
        currentplayerscorelabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        myrightPanel.add(currentplayerscorelabel, myrightconstraint);
        
        myrightconstraint.gridx = 0;  
        myrightconstraint.gridy = 2;
        snakeimagelabel.setIcon(new ImageIcon("images/snake_image.png"));
        myrightPanel.add(snakeimagelabel, myrightconstraint);
                
        myrightconstraint.gridx = 0;  
        myrightconstraint.gridy = 3;
        namelabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        myrightPanel.add(namelabel, myrightconstraint);
        
        myrightconstraint.gridx = 0;  
        myrightconstraint.gridy = 4;
        myrightPanel.add(quitlabel, myrightconstraint);
        
        myleftPanel.setBounds(10,10,550,700);
        myrightPanel.setBackground(Color.white);
        add(myrightPanel);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
          
        this.setVisible(false);
        MA_StartGame my_game = new MA_StartGame();
        my_game.setVisible(true);

    }
    
    public static void main(String[] args) {        
        EventQueue.invokeLater(() -> {
            //create the game with a game title as follow: The Snake Game (C) Your_Name
            JFrame MA_game = new MA_SnakeGame("My Snake Game");
            MA_game.setVisible(true);
            MA_game.setSize(800,800);
        });
    }
  
}

