package aula12.exercicios;

public class Sistema {
    StatusSistema status;

    Sistema() {
        status = StatusSistema.EXECUCAO;
    }

    void alterarStatusSistema(StatusSistema novoStatus) {
        status = novoStatus;
    }

    void notificar() {
        switch (status) {
            case EXECUCAO -> System.out.println("Sistema em funcionamento");
            case FALHA -> System.out.println("Sistema em falha");
            case PAUSADO -> System.out.println("Sistema pausado");
        }
    }

    public static void main(String[] args) {
        Sistema sis = new Sistema();

        sis.alterarStatusSistema(StatusSistema.FALHA);
        sis.notificar();
    }
}
