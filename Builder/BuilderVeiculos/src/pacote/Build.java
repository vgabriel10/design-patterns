package pacote;

abstract class Veiculo {
    private String modelo;
    private String tipo;
    
    public Veiculo(String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
    }
    protected String getModelo() {
        return modelo;
    }
    protected String getTipo() {
        return tipo;
    }
}
class Ferrari extends Veiculo {
    private String nome;
    
    public Ferrari(String modelo) {
        super(modelo, "Esportivo");
        this.nome = "Ferrari";
    }
    public String toString() {
        return "Carro: " + nome + " " + getModelo() + " " + getTipo();
    }
}

class Jeep extends Veiculo {
    private String nome;
    public Jeep(String modelo) {
        super(modelo, "Utilitario");
        this.nome = "Jeep";
    }
    public String toString() {
        return "Carro: " + nome + " " + getModelo() + " " + getTipo();
    }
}
interface MontadoraBuilder {
    void montar(char tipo, String modelo);
    Veiculo getVeiculo();
}
class MontadoraVeiculoBuilder implements MontadoraBuilder {
    private Veiculo veiculo;
    public void montar(char tipo, String modelo) {
        switch (tipo) {
            case 'F': veiculo = new Ferrari(modelo); break;
            case 'J': veiculo = new Jeep(modelo); break;
        }
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
}
class Montadora {
    private MontadoraBuilder builder = new MontadoraVeiculoBuilder();
    public Veiculo montar(char tipo, String modelo) {
        builder.montar(tipo, modelo);
        return builder.getVeiculo();
    }
}
public class Build {
    public static void main(String[] args) {
        new Build().executar();
    }
    
    public void executar() {
        Montadora montadora = new Montadora();
        Veiculo carro1 = montadora.montar('F', "Testerossa");
        Veiculo carro2 = montadora.montar('J', "Renegade");
        System.out.println(carro1);
        System.out.println(carro2);
    }
}

















