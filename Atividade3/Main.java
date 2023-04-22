package Atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int x = 1; x <= 4; x++) {
            System.out.print("Digite o nome da pessoa " + x + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CPF da pessoa: ");
            String cpf = scanner.nextLine();
            Pessoa pessoa = new Pessoa(nome, cpf);
            pessoas.add(pessoa);
        }

        System.out.println("\n-----Pessoas cadastradas------");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", CPF: " + pessoa.getCpf());
        }
    }
}
