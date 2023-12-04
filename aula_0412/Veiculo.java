package aula_0412;

public class Veiculo {
    boolean ligado;
    int ano;
    String marca;
    double kmRodados;
    double consumo; // km/L
    double tanqueAtual; // L

    void ligar() {
        System.out.println("Ligando ignição...");
        ligado = true;
    }

    void desligar() {
        System.out.println("Desligando veículo...");
        ligado = false;
    }

    void viajar(double distancia) {
        double litrosGastos = distancia / consumo;
        
        // BUG FIX: A viagem não pode acontecer
        // se não houver combustível suficiente
        if (tanqueAtual - litrosGastos <= 0) {
            System.out.println("Viagem não pode ser realizada. Combustível abaixo do necessário.");
        } else {
            tanqueAtual -= litrosGastos;
            kmRodados += distancia;
        }
    }

    void revisao() {
        consumo = consumo + consumo * 0.10;
    }
}
