/**
 *
 * @author diogo_leite
 * URI - (Accepted) #11692146
 */
public class URI1020 {
    private static final int[] VALORES = {365, 30, 1};
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int dias = input.nextInt();
        int[] dados = new int[3];
        for(int i = 0; i < dados.length; i++){
            dados[i] = dias / VALORES[i];
            dias %= VALORES[i];
        }
        System.out.println(String.format("%d ano(s)", dados[0]));
        System.out.println(String.format("%d mes(es)", dados[1]));
        System.out.println(String.format("%d dia(s)", dados[2]));

        
    }
}
