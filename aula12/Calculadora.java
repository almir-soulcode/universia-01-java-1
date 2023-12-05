package aula12;

public class Calculadora {
    double calcular(double a, double b, OperacaoCalculadora op) {
        switch(op) {
            case SOMAR -> {
                return a + b;
            }
            case SUBTRAIR -> {
                return a - b;
            }
            case MULTIPLICAR -> {
                return a * b;
            }
            case DIVIDIR -> {
                return a / b;
            }
            default -> {
                System.out.println("Operador inválido");
                return 0;
            }
        }
    }
}
