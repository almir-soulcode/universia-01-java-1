package aula12.exercicios;

public class Curso {
    String titulo;
    String descricao;
    double mensalidade;
    int duracaoMeses;
    Turno turno;
    NivelCurso nivel;
    StatusCurso status;

    public Curso(String titulo, String descricao, double mensalidade, int duracaoMeses, Turno turno, NivelCurso nivel,
            StatusCurso status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.mensalidade = mensalidade;
        this.duracaoMeses = duracaoMeses;
        this.turno = turno;
        this.nivel = nivel;
        this.status = status;
    }

}
