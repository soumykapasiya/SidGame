package snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author soyam
 */
public class GamePanel extends JPanel implements ActionListener
{
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 50;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int dotsEaten;
    int dotX;
    int dotY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    
    GamePanel()
    {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame()
    {
        newDot();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
    public void draw(Graphics g)
    {
        for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++)
        {
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }
    }
    public void newDot()
    {
        
    }
    public void move()
    {
        
    }
    public void checkDot()
    {
        
    }
    public void checkCollection()
    {
        
    }
    public void gameOver(Graphics g)
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
    
    public class MyKeyAdapter extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            
        }
    }
    
}
