import java.util.Scanner;

public class buscaSequencial {
    public static void main(String[] args) {
        int[] chaves = new int[10];
        int resultado, qtdt;
        Scanner tmp = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + i + "º" + " número:");
            chaves[i] = tmp.nextInt();
        }

        System.out.println("Digite uma chave a ser pesquisada:");
        int busca = tmp.nextInt();
        
        boolean achou = false;
        qtdt = 0;
        resultado = 0;
        for (int i = 0; i < 10; i++) {
            if (busca == chaves[i])
            {
                resultado = i;
                achou = true;
            }
              qtdt++;
        }
        System.out.println("BUSCA SEQUENCIAL");
        if (achou == true) {
            System.out.println("Indice retornado: "+resultado);
            System.out.println("Numero de tentativas: "+qtdt);
        } else {
            System.out.println("Nenhuma informação encontrada!");
        }
    }

}
