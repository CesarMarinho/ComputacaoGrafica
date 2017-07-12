

public class TesteBiblioteca extends Biblioteca {
	
	public static void main(String args[]){
		
		double matrizA[][] = {{1.5,2.5,3.5},{4.5,5.5,6.5}};
		double matrizB[][] = {{7.5,8.5},{9.5,10.5},{11.5,12.5}};
		Vetor vetorA = new Vetor(3.5,1.5,2.0);
		Vetor vetorB = new Vetor(1.0,2.0,1.5);
		Ponto pontoAA = new Ponto(3.5,1.5,2.0);
		Ponto pontoBB = new Ponto(1.0,2.0,1.5);
		Ponto pontoP = new Ponto(-0.25,0.75);
		Ponto pontoA = new Ponto(-1.0,1.0);
		Ponto pontoB = new Ponto(0.0,-1.0);
		Ponto pontoC = new Ponto(1.0,1.0);
		Ponto coordenada = new Ponto(0.5,0.25,0.25);
		
		double matrizR[][] = MultiplicacaoMatrizes(matrizA, matrizB);
		
		for(int i=0;i<matrizR.length;i++){
			for(int j=0;j<matrizR[0].length;j++){
				System.out.print(matrizR[i][j]+" ");
			}
			System.out.println();
		}
		
		Vetor rb = SubtracaoPontos(pontoAA, pontoBB);
		System.out.println(rb.toString());
		
		double rc = ProdutoEscalar(vetorA, vetorB);
		System.out.println(rc);
		
		Vetor rd = ProdutoVetorial(vetorA, vetorB);
		System.out.println(rd);
		
		double re = NormaVetor(vetorA);
		System.out.println(re);
		
		Vetor rf = NormalizacaoVetor(vetorA);
		System.out.println(rf);
		
		Ponto rg = CoordenadaBaricentrica(pontoA, pontoB, pontoC, pontoP);
		System.out.println(rg.toString());
		
		Ponto rh = CoordenadaCartesiana(pontoA, pontoB, pontoC, coordenada);
		System.out.println(rh.toString());
	}
	
}
