/*
Faça um programa em Java, que calcule e mostre o valor do aumento e o novo salário
de um funcionário, sabendo-se que o salário do funcionário é de R$ 2500,00 e o
percentual de aumento foi de 10%.
 */


public class ex002 {
    public static void main(String[] agrs) {
        
        int salarioAtual = 2500;
        float aumento = salarioAtual * 0.1f;
        
        float salarioComAumento = salarioAtual + aumento;
        
        System.out.println(salarioComAumento);
    }
}
