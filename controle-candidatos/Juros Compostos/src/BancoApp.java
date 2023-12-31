import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        valorFinal = valorInicial * Math.pow((1 + taxaJuros), periodo);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}