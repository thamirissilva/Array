
package br.com.array;

/**
 * 
 * Estudo o Array - exemplo 4 - Preenchendo um ARRAY com o laço FOR
 *
 * @author Thamiris da Silva Souza
 * 
 */


public class Array4 {
    public static void main(String[] args) {
        int[] idades = new int [10];
        // a linha abaixo cria as variáveis que vão preencher as 10 posições ("casinhas") do array
        for (int i=0; i<10; i++){
            idades[i] = i*10;
            System.out.println("Idades [" +i+ "] = " + idades[i]);
            
        }
               
    }
    
}
