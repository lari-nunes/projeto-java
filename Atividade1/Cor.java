package Atividade1;

public class Cor {
    private String[] cores;
    private int contador;

    public Cor() {
        this.cores = new String[4];
        this.contador = 0;
    }

    public void adicionarCor(String cor) {
        if (this.contador < this.cores.length) {
            this.cores[this.contador] = cor;
            this.contador++;
            System.out.println("Cor " + cor + " adicionada com sucesso!");
        }
    }


    public void listarCores() {
        System.out.println("\n-----------------------\n");
        System.out.println("Cores cadastradas:");
        for (String cor : this.cores) {
            if (cor != null) {
                System.out.println(cor);
            }
        }
    }
}
