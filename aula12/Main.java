package aula12;

public class Main {
    public static void main(String[] args) {
        Turno turnoCurso = Turno.TARDE;
        DiaDaSemana hoje = DiaDaSemana.TERCA;
        NivelDesenvolvedor nivel = NivelDesenvolvedor.PLENO;

        switch (nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível atual é Júnior");
            }
            case PLENO -> {
                System.out.println("Seu nível atual é Pleno");
            }
            case SENIOR -> {
                System.out.println("Seu nível atual é Sênior");
            }
        }

        // Teste de calculadora
        Calculadora calc = new Calculadora();
        double resultado1 = calc.calcular(40.0, 3.0, OperacaoCalculadora.SUBTRAIR);
        double resultado2 = calc.calcular(resultado1, 3, OperacaoCalculadora.DIVIDIR);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);

        // Teste do desenvolvedor
        Desenvolvedor dev1 = new Desenvolvedor(
                "Gabriel Braga",
                "gabriel.braga@soulcode.com",
                4,
                5000,
                NivelDesenvolvedor.SENIOR,
                true);

        dev1.reajustarNivel();
        System.out.println("O nivel do dev1: " + dev1.nivel);
        dev1.aumentarSalario();
        System.out.println("O salário é: " + dev1.salario);
        dev1.ganharExp();
        dev1.ganharExp();
        dev1.ganharExp();
        dev1.reajustarNivel();
        System.out.println("Novo nível: " + dev1.nivel);
    }
}
