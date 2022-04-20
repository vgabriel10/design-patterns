package br.com.factory;

public class Main {

	public static void main(String[] args) {
		FormaGeometrica formaGeometrica = FormaGeometricaFactory.criarFormaGeometrica(4);
		System.out.println(formaGeometrica.nomeObjeto());

	}

}
