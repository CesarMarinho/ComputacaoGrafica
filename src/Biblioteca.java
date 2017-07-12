

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
	
	public static Vetor SubtracaoPontos(Ponto a, Ponto b){
		double x = a.getX() - b.getX();
		double y = a.getY() - b.getY();
		double z = a.getZ() - b.getZ();
		Vetor r = new Vetor(x, y, z);
		return r;
	}
	
	public static double ProdutoEscalar(Vetor a, Vetor b){
		double r = (a.getX()*b.getX())+(a.getY()*b.getY())+(a.getZ()*b.getZ());
		return r;
	}
	
	public static Vetor ProdutoVetorial(Vetor a, Vetor b){
		double x, y, z;
		x = ( a.getY() * b.getZ() )-( a.getZ() * b.getY() );
		y = ( a.getZ() * b.getX() )-( a.getX() * b.getZ() );
		z = ( a.getX() * b.getY() )-( a.getY() * b.getX() );
		Vetor r = new Vetor(x,y,z);
		return r;
	}
	
	public static double NormaVetor(Vetor a){
		double r = java.lang.Math.sqrt((a.getX()*a.getX())+(a.getY()*a.getY())+(a.getZ()*a.getZ()));
		return r;
	}	
	
	public static Vetor NormalizacaoVetor(Vetor a){
		double n = NormaVetor(a);
		double x = a.getX()/n;
		double y = a.getY()/n;
		double z = a.getZ()/n;
		Vetor r = new Vetor(x,y,z);
		return r;
	}
	
	public static Ponto CoordenadaBaricentrica(Ponto a, Ponto b, Ponto c, Ponto p){
		double x, y, z;
		double auxa, auxb, auxc, auxd, auxe, auxf;
				
		auxa = a.getX() - c.getX();
		auxb = b.getX() - c.getX();
		auxc = a.getY() - c.getY();
		auxd = b.getY() - c.getY();
		auxe = p.getX() - c.getX();
		auxf = p.getY() - c.getY();
		
		auxa = 1 / (auxa * auxd - auxb * auxc) * auxd;
		auxb = 1 / (auxa * auxd - auxb * auxc) * (-auxb);
		auxc = 1 / (auxa * auxd - auxb * auxc) * (-auxc);
		auxd = 1 / (auxa * auxd - auxb * auxc) * auxa;
		
		x = auxa * auxe + auxb * auxf;
		y = auxc * auxe + auxd * auxf;
		z = 1 - x - y;
		
		Ponto r = new Ponto(x,y,z);
		return r;
	}
	
	public static Ponto CoordenadaCartesiana(Ponto a, Ponto b, Ponto c, Ponto v) {
		double x, y;

		x = v.getX() * a.getX() + v.getY() * b.getY() + v.getZ() * c.getX();
		y = v.getX() * a.getY() + v.getY() * b.getY() + v.getZ() * c.getY();

		Ponto r = new Ponto(x,y);
		return r;
	}
	
}
