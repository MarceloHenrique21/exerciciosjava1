import java.util.Scanner;

public class bubbleSort {
    public static void main(String args[]){
        int[] chaves = new int[10];
        int aux = 0;
        Scanner tmp = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + i + "º" + " número:");
            chaves[i] = tmp.nextInt();
        }
        System.out.println("Vetor desordenado: ");
        for(int i = 0; i<10; i++){
            System.out.println(chaves[i]);
        }
        System.out.println(" ");
        for(int i = 0; i<10; i++){
            for(int j = 0; j<9; j++){
                if(chaves[j] > chaves[j + 1]){
                    aux = chaves[j];
                    chaves[j] = chaves[j+1];
                    chaves[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(int i = 0; i<10; i++){
            System.out.println(chaves[i]);
        }
    }
}
