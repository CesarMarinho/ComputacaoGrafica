
public class TesteBiblioteca extends Biblioteca {
	
	public static void main(String args[]){
		
		Vetor a = new Vetor(1,2,3);
		Vetor b = new Vetor(3,4,5);
		Vetor d = new Vetor(1,2);
		Vetor e = new Vetor(3,4);
		
		double matrizA[][] = {{1.0,2.0,3.0,4.0},{5.0,6.0,7.0,8.0},{9.0,10.0,11.0,12.0}};
		double matrizB[][] = {{1.0,2.0},{2.0,3.0},{3.0,4.0},{4.0,5.0}};
		double matrizR[][];
		matrizR = MultiplicacaoMatrizes(matrizA, matrizB);
		
		for(int i = 0;i<matrizR.length;i++){
			for(int j=0; j<matrizR[0].length;j++){
				System.out.print(matrizR[i][j]+" ");
			}
			System.out.println();
		}
		
				
		//Vetor c = SubtracaoVetores(a,b); //-ok
		//int c = ProdutoEscalarVetores(a,b);//-ok
		//double c = ProdutoVetorialVetores(d,e);
		
		//System.out.println(c);		
		
		
	}
	
}
