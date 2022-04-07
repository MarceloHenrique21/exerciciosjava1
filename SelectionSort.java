import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Scanner ler = new Scanner(System.in);
        int cont = 0;


        for(int y=0; y<10; y++){
            System.out.println("insira os valores: ");
            vetor[y] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            int i_menor = i;
            for (int j = i + 1; j < 10; j++){
           
                if (vetor[j] < vetor[i_menor]) {
                    i_menor = j;
                }
            }

            if(i_menor != i){
            int aux = vetor[i];

            vetor[i] = vetor[i_menor];
            vetor[i_menor] = aux;
            cont++;
        }
        
       }

         System.out.println("trocas feitas: " + cont);
        
          for(int g=0; g<10; g++){

            System.out.print(" "+vetor[g]);
        }
    }
}
