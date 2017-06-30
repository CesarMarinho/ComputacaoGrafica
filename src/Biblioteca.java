import java.lang.Math;


abstract class Biblioteca {
	
	public static double[][] MultiplicacaoMatrizes(double[][] ma, double[][] mb ){
		double[][] r = new double[ma.length][mb[0].length];				
		
		for(int i=0;i<ma.length;i++){ //percorre todas as linhas de A
			for(int j=0;j<mb[0].length;j++){//percorre as colunas de B
				double aux = 0.0;
				for(int k=0;k<ma[0].length;k++){//percorre as colunas de A e linhas de B
					aux = aux + ma[i][k]*mb[k][j];
				}
				r[i][j] = aux;
			}
			
		}		
		return r;
	}
	
	public static void testeMatriz(double[][] matriz){
		System.out.println(matriz[0].length);//printa numero de colunas
		System.out.println(matriz.length);//printa numero de linhas		
	}
	
	public static Vetor SubtracaoVetores(Vetor a, Vetor b){
		double x = a.getx() - b.getx();
		double y = a.gety() - b.gety();
		double z = a.getz() - b.getz();
		Vetor r = new Vetor(x, y, z);
		return r;
	}
	
	public static double ProdutoEscalarVetores(Vetor a, Vetor b){
		double r = (a.getx()*b.getx())+(a.gety()*b.gety())+(a.getz()*b.getz());
		return r;
	}
	
	public static double NormaVetor(Vetor a){
		double r = java.lang.Math.sqrt((a.getx()*a.getx())+(a.gety()*a.gety())+(a.getz()*a.getz()));
		return r;
	}	
	

//	public static double ProdutoVetorialVetores(Vetor a, Vetor b){
//		
//	}
	
}
