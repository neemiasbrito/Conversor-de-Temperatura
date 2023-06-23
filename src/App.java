import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //variaveis
        double c, f;
        // objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatados = new DecimalFormat("#0.0");
        
        // entrada
        System.out.println("Conversor de temperatura");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        f = teclado.nextDouble();
        // processamento
        c = (5*(f-32))/9;
        //saida
        System.out.println("Temperatura em celsius: " + formatados.format(c) + " ºc");
        teclado.close();
    }
}
