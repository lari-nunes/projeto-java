package Atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> carros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do carro " + (i+1) + ": ");
            String carro = scanner.nextLine();
            carros.add(carro);
        }

        System.out.println("\nLista de carros adicionados:");
        for (String carro : carros) {
            System.out.println(carro);
        }

        System.out.println("\n-----------------\n");
        System.out.print("Digite o nome do carro a ser removido: ");
        String carroRemover = scanner.nextLine();
        if (carros.remove(carroRemover)) {
            System.out.println("\nCarro removido com sucesso!");
        }

        System.out.println("\nLista atualizada de carros:");
        for (String carro : carros) {
            System.out.println(carro);
        }
    }
}