import java.awt.Color;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teste extends JPanel
{
    public Teste()
    {
        int size = 600;
        BufferedImage bi = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
        ImageIcon icon = new ImageIcon( bi );
        add( new JLabel(icon) );
        
        Color color = Color.BLACK;
        int colorValue = color.getRGB();
        //for (int y = 0; y < size; y += 5)
        for(int y=0;y<size;y++)
        {
            for (int x = 0; x < size; x++)
            {
//                Color color = (y % 2 == 0) ? Color.WHITE : Color.BLACK;
//                int colorValue = color.getRGB();
//                bi.setRGB(x, y, colorValue);
//                bi.setRGB(x, y + 1, colorValue);
//                bi.setRGB(x, y + 2, colorValue);
//                bi.setRGB(x, y + 3, colorValue);
//                bi.setRGB(x, y + 4, colorValue);
            	  bi.setRGB(x, y, colorValue);
            }
        }
    }

    private static void createAndShowGUI()
    {    	
        JFrame frame = new JFrame("SSCCE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new Teste() );
        frame.setLocationByPlatform( true );
        frame.pack();
        frame.setVisible( true );        
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}