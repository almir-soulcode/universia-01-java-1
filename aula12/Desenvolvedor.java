package aula12;

public class Desenvolvedor {
    String nome;
    String email;
    int anosExp;
    double salario;
    NivelDesenvolvedor nivel;
    boolean estaEmpregado;

    Desenvolvedor(
            String nome,
            String email,
            int anosExp,
            double salario,
            NivelDesenvolvedor nivel,
            boolean estaEmpregado) {
        this.nome = nome;
        this.email = email;
        this.anosExp = anosExp;
        this.salario = salario;
        this.nivel = nivel;
        this.estaEmpregado = estaEmpregado;
    }

    void ganharExp() {
        anosExp++;
    }

    void reajustarNivel() {
        if(anosExp <= 2) {
            nivel = NivelDesenvolvedor.JUNIOR;
        } else if(anosExp <= 5) {
            nivel = NivelDesenvolvedor.PLENO;
        } else {
            nivel = NivelDesenvolvedor.SENIOR;
        }
    }

    void aumentarSalario() {
        switch(nivel) {
            case JUNIOR -> {
                salario += 150;
            }
            case PLENO -> {
                salario += 250;
            }
            case SENIOR -> {
                salario += 500;
            }
        }
    }
}
