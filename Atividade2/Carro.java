package Atividade2;

import java.util.ArrayList;

public class Carro {
    private ArrayList<String> carros = new ArrayList<>();


    public void adicionarCarro(String carro) {
        this.carros.add(carro);
        System.out.println("Carro " + carro + " adicionado com sucesso!");
    }

    public void removerCarro(String carro) {
        if (this.carros.remove(carro)) {
            System.out.println("Carro " + carro + " removido com sucesso!");
        }
    }


    public void listarCarros() {
        System.out.println("\n----------------\n");
        System.out.println("Carros cadastrados: ");
        for (String carro : this.carros) {
            System.out.println(carro);
        }
    }
}