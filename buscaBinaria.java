import java.util.Scanner;

public class buscaBinaria {
    public static void main(String[] args) {
        int[] chaves = new int[10];
        Scanner tmp = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + i + "º" + " número:");
            chaves[i] = tmp.nextInt();
        }
        System.out.println("Digite uma chave a ser pesquisada:");
        int busca = tmp.nextInt();

        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = 9;
        int meio;
        int indice = 0;
        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            contador++;
            if (chaves[meio] == busca) {
                achou = true;
                indice = meio;
                break;
            } else if (chaves[meio] < busca) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("BUSCA BINÁRIA");
        if (achou == true) {
            System.out.println("Indice retornado: "+indice);
            System.out.println("Numero de tentativas: "+contador);
        } else {
            System.out.println("Nenhuma informação encontrada!");
        }
    }
}
