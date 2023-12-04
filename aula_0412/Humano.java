package aula_0412;

import java.time.LocalDate;

public class Humano {
    String nome;
    String sobrenome;
    LocalDate dataNascimento;
    double altura;
    double peso;

    void seApresentar() {
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
    }

    void mostrarImc() {
        // IMC = ÍNDICE DE MASSA CORPORAL (PESO / ALTURA * ALTURA)
        double imc = peso / (altura * altura);
        System.out.println("Meu IMC é " + imc);
    }

    String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    double calculoImc() {
        double imc = peso / (altura * altura);
        return imc;
    }

    void fazerExercicio() {
        System.out.println("Estou me exercitando");
        peso -= 0.5; // peso = peso - 0.5
    }

    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        peso += 0.5; // peso = peso + 0.5
    }
}
