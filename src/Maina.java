import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Maina {
	
	public static void main(String args[]){

		ArrayList<Ponto> ptList = new ArrayList<Ponto>();	
		Ponto pt;
		int n1, n2;
		double x, y, z;
		String aux, auxX, auxY, auxZ;
		boolean flag = true;
		Scanner ler = new Scanner(System.in);
		
		try {
			FileReader arq = new FileReader("seila.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			
			//char linha = new String();			
			lerArq.readLine();
			while (lerArq.ready()) {				
				//linha = (char)lerArq.read();
				//lerArq.readLine();
				//if(linha == 50) break;
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
				//System.out.print("X: "+auxX+" ");
				//System.out.print("Y: "+auxY+" ");
				//System.out.println("Z: "+auxZ+" ");
				//System.out.println(aux);
				
				x = Double.parseDouble(auxX);
				y = Double.parseDouble(auxY);
				z = Double.parseDouble(auxZ);
				
				pt = new Ponto(x,y,z);
				ptList.add(pt);
				
			}			
			arq.close();
			System.out.println(ptList.toString());
			
		}
		catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}


	}		
	
}
