package pacotepadrão;

public class GerenciadorImpressao {
	
	// Criar uma variavel estatica do tipo da classe
	private static GerenciadorImpressao gerenciadorimpressao;
	
	// Construtor Privado
	private GerenciadorImpressao() {
		
		
	}
	
	// Metodo publico que vai retornar a variavel privada gerenciadorimpressao
	public static GerenciadorImpressao getInstace() {
		
		// atribuir um valor na variavel
		if(gerenciadorimpressao == null) {
			gerenciadorimpressao = new GerenciadorImpressao();
		}
		return gerenciadorimpressao;
		
	}

}
