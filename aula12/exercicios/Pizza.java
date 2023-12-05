package aula12.exercicios;

import java.util.List;

public class Pizza {
    TamanhoPizza tamanho;
    List<String> sabores;
    StatusPizza status;
    boolean comBorda;

    Pizza(TamanhoPizza tamanho, List<String> sabores, boolean comBorda) {
        this.tamanho = tamanho;
        this.sabores = sabores;
        this.comBorda = comBorda;
        this.status = StatusPizza.PENDENTE;
    }

    void alterarStatusPizza(StatusPizza novoStatus) {
        status = novoStatus;
    }

    double getPreco() {
        double preco = 20;

        if (tamanho == TamanhoPizza.M) {
            preco = 40;
        } else if (tamanho == TamanhoPizza.G) {
            preco = 60;
        }

        preco += (sabores.size() - 1) * 5;

        // Extra: checar a borda
        if(comBorda) {
            preco += 1;
        }

        return preco;
    }

    public static void main(String[] args) {
        List<String> sabores = List.of("queijo", "calabresa", "pepperoni", "abacaxi");
        Pizza p1 = new Pizza(TamanhoPizza.M, sabores, true);
        p1.alterarStatusPizza(StatusPizza.EM_COZIMENTO);
        System.out.println(p1.getPreco());
    }
}
