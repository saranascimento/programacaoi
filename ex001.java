import java.util.Scanner;

/* Exercício 001
 *Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
 *antecessor e seu sucessor.
 */

public class ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int antecessor;
        int sucessor;
        
        
        System.out.println("Digite um número para saber o seu antecessor e o seu sucessor: ");
        
        numero = entrada.nextInt();
        
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        System.out.println("O número digitado foi " + numero + ", seu antecessor é " + antecessor + " e seu sucessor é "+ sucessor);
    }
}
