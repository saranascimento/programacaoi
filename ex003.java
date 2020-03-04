import java.util.Scanner;
/*
Exercício 003
 Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Converta esse valor para Real
- Mostre o resultado
 */

/**
 *
 * @author danilo
 */
public class ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float valorDolar;
        float cotacaoDolar;
        float valorReal;
        
        System.out.println("Insira a cotação do dólar: ");
        cotacaoDolar = entrada.nextFloat();
        System.out.println("Insira o valor em dólar: ");
        valorDolar = entrada.nextFloat();
        valorReal = valorDolar * cotacaoDolar;
        System.out.println("A valor do dólar convertido para real é de: " + valorReal);
        
    }
}
