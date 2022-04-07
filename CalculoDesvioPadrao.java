import java.util.Scanner;

public class CalculoDesvioPadrao {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in); 
       float[] vetor = new float[10];
        float media=0;
        float mediaD=0;
        float mediaDo=0;
        float mediaDoi=0;
        float mediaDois=0;
        
        for(int i=0;i<10;i++){
            System.out.println("Numero "+(i+1)+" : ");
            vetor[i] = leitor.nextFloat();
        }
        for(int i=0;i<10;i++){
            media += vetor[i];
        }
        mediaDois = media/10;
        System.out.println("Media: "+media);
        for(int i=0;i<10;i++){
            mediaD  = (vetor[i] - mediaDois);
            mediaDo += mediaD*mediaD;
        }

        mediaDoi = mediaDo/9;
        

        System.out.println("Desvio Padrao: "+Math.sqrt(mediaDoi));
    }

}
