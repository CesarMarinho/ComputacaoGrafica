import java.awt.Color;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JPanel {
	
	public Main(){
		
		ArrayList<Ponto> mesh = new ArrayList<Ponto>();
		ArrayList<Ponto> coordinates = new ArrayList<Ponto>();
		ArrayList<Ponto> normCoordinates = new ArrayList<Ponto>();
		ArrayList<Ponto> indexes = new ArrayList<Ponto>();
		Ponto pt;
		int nCoordinates, nIndexes;
		double x, y, z, xMin, xMax, yMin, yMax;
		String aux, auxX, auxY, auxZ, aux1, aux2;
		
		aux1 = new String();
		aux2 = new String();
		
		try {
			FileReader arq = new FileReader("objeto.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			
			aux = lerArq.readLine();
			int d = aux.indexOf(' ');
			for(int i=0;i<d;i++) aux1 = aux1 + aux.charAt(i);
			for(int i=d+1;i<aux.length();i++) aux2 = aux2 + aux.charAt(i);
			nCoordinates = Integer.parseInt(aux1);
			nIndexes = Integer.parseInt(aux2);
			
			while (lerArq.ready()) {				
				aux = lerArq.readLine();
				int count = 0;
				
				auxX = new String();	
				auxY = new String();
				auxZ = new String();
				
				for(int i=0;i<aux.length();i++){
					if(aux.charAt(i)!=32){
						if(count == 0) {
							auxX = auxX + aux.charAt(i);
						}else if(count == 1){
							auxY = auxY + aux.charAt(i);
						}else if(count == 2){
							auxZ = auxZ + aux.charAt(i);
						}
					}	else count++;				
				}				
				
				x = Double.parseDouble(auxX);
				y = Double.parseDouble(auxY);
				z = Double.parseDouble(auxZ);
				
				pt = new Ponto(x,y,z);
				mesh.add(pt);
				
			}			
			arq.close();
			
			xMin = mesh.get(0).getX();
			yMin = mesh.get(0).getY();
			xMax = xMin;
			yMax = yMin;			
			for(int i=0;i<nCoordinates;i++){
				coordinates.add(mesh.get(i));
				normCoordinates.add(mesh.get(i));
				
				if(mesh.get(i).getX() < xMin) xMin = mesh.get(i).getX();
				else if(mesh.get(i).getX() > xMax) xMax = mesh.get(i).getX();
				
				if(mesh.get(i).getY() < yMin) yMin = mesh.get(i).getY();
				else if(mesh.get(i).getY() > yMax) yMax = mesh.get(i).getY();
			}
			for(int i=nCoordinates;i<mesh.size();i++)indexes.add(mesh.get(i));
			
			for(int i=0;i<normCoordinates.size();i++){				
				double xn = ((normCoordinates.get(i).getX()-xMin)/(xMax - xMin))*(599);
				double yn = ((normCoordinates.get(i).getY()-yMin)/(yMax - yMin))*(599);
				normCoordinates.get(i).setX(xn);				
				normCoordinates.get(i).setY(yn);
			}
//			System.out.println(coordinates.toString());	
//			System.out.println(normCoordinates.toString());
			
		}
		catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
		
		int size = 600;
        BufferedImage bi = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
        ImageIcon icon = new ImageIcon( bi );
        add( new JLabel(icon) );
        
        Color color = Color.BLACK;
        int colorValue = color.getRGB();
        for(int j=0;j<size;j++)
        {
            for (int k= 0; k < size; k++)
            {
            	  bi.setRGB(j, k, colorValue);
            }
        }
        color = Color.WHITE;
        colorValue = color.getRGB();
        for(Ponto point:normCoordinates){
        	bi.setRGB((int)point.getX(), (int)point.getY(),colorValue);
        }
    }
	
	private static void createAndShowBlackScreen()
    {
        JFrame frame = new JFrame("Objeto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new Main() );
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
            	createAndShowBlackScreen();               
            }
        });
        
    }
	
}
