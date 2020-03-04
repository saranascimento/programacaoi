import java.util.Scanner;
/*
Exercício 006
Desenvolva um programa em java que leia o nome e a idade de 3 pessoas e mostre o
nome da pessoa mais velha e o nome da pessoa mais nova.

 */

/**
 *
 * @author danilo
 */
public class ex006 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        String nomeP1, nomeP2, nomeP3;
        int idadeP1, idadeP2, idadeP3;
        
        System.out.println("Digite o nome da primeira pessoa: ");
        nomeP1 = entrada.next();
        
        System.out.println("Digite a idade da primeira pessoa: ");
        idadeP1 = entrada.nextInt();
        
        System.out.println("Digite o nome da segunda pessoa: ");
        nomeP2 = entrada.next();
        
        System.out.println("Digite a idade da segunda pessoa: ");
        idadeP2 = entrada.nextInt();
        
        System.out.println("Digite o nome da terceira pessoa: ");
        nomeP3 = entrada.next();
        
        System.out.println("Digite a idade da terceira pessoa: ");
        idadeP3 = entrada.nextInt();
        
        
        if(idadeP1 > idadeP2 && idadeP1 > idadeP3){
            System.out.println(nomeP1 +" é a pessoa mais velha.");
        
        } else if(idadeP2 > idadeP1 && idadeP2 > idadeP3){
            System.out.println(nomeP2 +" é a pessoa mais velha.");
        
        }else if(idadeP3 > idadeP1 && idadeP3 > idadeP2) {
            System.out.println(nomeP3 +" é a pessoa mais velha.");
        
        }
        
        if(idadeP1 < idadeP2 && idadeP1 < idadeP3){
            System.out.println(nomeP1 +" é a pessoa mais nova.");
        
        } else if(idadeP2 < idadeP1 && idadeP2 < idadeP3){
            System.out.println(nomeP2 +" é a pessoa mais nova.");
        
        }else if(idadeP3 < idadeP1 && idadeP3 < idadeP2) {
            System.out.println(nomeP3 +" é a pessoa mais nova.");
        }
        
    }
}
