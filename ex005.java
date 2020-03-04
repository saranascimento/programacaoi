/*
Exercício 005
Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e
a multiplicação dos números pares entre 0 e 30.
 */

/**
 *
 * @author danilo
 */
public class ex005 {
    public static void main(String[] args) {
        int somaDosImpares = 0;
        long multiplicacaoDosPares = 1;
        for(int i = 1; i <= 30; i++){
 
            if( i % 2 == 0){
                multiplicacaoDosPares *= i;
                
            } else{
                somaDosImpares += i;
              
            }
        }
        
        System.out.println(somaDosImpares);
        System.out.println(multiplicacaoDosPares);
    }
}
