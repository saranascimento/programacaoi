/*
Exercício 004
Crie uma classe java que contenha um método que receba um número inteiro e
imprima, em ordem decrescente, o valor do número até 0.
 */

/**
 *
 * @author danilo
 */
public class ex004 {
    public static void main(String[] args) {
        int numero = 10;
        
        for(int i = numero; i >= 0; i--){
            System.out.println(i);
        }
        
    }
}
