package aula_0412;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Humano h1 = new Humano();
        h1.nome = "José";
        h1.sobrenome = "Almir";
        h1.altura = 1.93;
        h1.peso = 85.5;
        h1.dataNascimento = LocalDate.of(1990, 2, 23);
        /**
         * h1.seApresentar();
         * h1.mostrarImc();
         * String nomeComp = h1.nomeCompleto();
         * System.out.println("O retorno é: " + nomeComp);
         */
        // System.out.println("Antes: " + h1.peso);
        // h1.comer("Abacaxi");
        // h1.comer("Kiwi");
        // h1.comer("Pizza");
        // System.out.println(h1.peso);
        // h1.mostrarImc();
        // h1.fazerExercicio();
        // h1.fazerExercicio();
        // h1.fazerExercicio();
        // h1.fazerExercicio();
        // System.out.println("Depois do exercício: " + h1.peso);
        // h1.mostrarImc();

        Veiculo v1 = new Veiculo();
        v1.ano = 2023;
        v1.marca = "Fiat";
        v1.kmRodados = 0;
        v1.consumo = 20;
        v1.tanqueAtual = 90;
        v1.ligar();
        v1.revisao();
        v1.viajar(100);

        System.out.println(v1.kmRodados);
        System.out.println(v1.tanqueAtual);
    }
}
