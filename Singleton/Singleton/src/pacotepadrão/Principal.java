package pacotepadrão;

public class Principal {

	public static void main(String[] args) {
		
		GerenciadorImpressao g1 = GerenciadorImpressao.getInstace();
		GerenciadorImpressao g2 = GerenciadorImpressao.getInstace();
		GerenciadorImpressao g3 = GerenciadorImpressao.getInstace();
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		
			
	}

}

