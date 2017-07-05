
package br.com.array;

/**
 * Estudo Array - exemplo 3 - Instanciando um Array
 * @author Thamiris da Silva Souza
 */
public class Array3 {
    public static void main(String[] args) {
        //inciando um array com tamanho fixo de 5 variáveis
        int[] impares = new int[5];
        impares [0]=1;
        impares [1]=3;
        impares [2]=5;
        impares [3]=7;
        impares [4]=9;
        
        System.out.println("Tamanho do Array: " + impares.length);
        System.out.println("Posição 1: " + impares[1]);
        
        // a linha abaixo gera um erro pois o tamanho do array é 5
        // impares [5]=11;
        // System.out.println("Posição 5: " + impares[5]);
        
    }
    
}
