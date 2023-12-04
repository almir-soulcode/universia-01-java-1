package aula_0412;

public class Celular {
    String marca;
    String modelo;
    String ano;
    double porcentagemBateria;

    void tirarFoto() {
        porcentagemBateria -= 10;
    }

    void recarregar() {
        porcentagemBateria = 100;
    }

    void rodarAplicativo(String app) {
        // Obs: Aqui coloquei uma forma de variar o gasto da bateria
        if (app.equals("whatsapp")) {
            porcentagemBateria -= 45;
        } else {
            // Para qualquer outro app
            porcentagemBateria -= 5;
        }
    }
}
