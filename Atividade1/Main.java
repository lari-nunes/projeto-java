package Atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cor cores = new Cor();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome da cor: ");
            String cor = scanner.nextLine();
            cores.adicionarCor(cor);
        }

        cores.listarCores();
    }
}

