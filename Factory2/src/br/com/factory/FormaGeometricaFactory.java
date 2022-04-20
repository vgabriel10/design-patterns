package br.com.factory;

// Escolhe Qual Objeto vai ser criado

public class FormaGeometricaFactory {

	public static FormaGeometrica criarFormaGeometrica(int quantLados) {
		
		if (quantLados == 3) {
			return new Triangulo();
		}else if (quantLados == 4) {
			return new Quadrado();
		}
		return null;
	}
}
