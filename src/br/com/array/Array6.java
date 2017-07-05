
package br.com.array;

/**
 * Estudo Array - Exemplo 5 - Array Multidimensional
 * @author Thamiris da Silva Souza
 */


public class Array6 {
    public static void main(String[] args) {
        


        // a linha abaixo cria um array de duas dimensões
        String[][] agenda = {{"Bill","1111-1111","bill@gmail.com"},{"Linus","2222-2222","linus@tux.com"},{"Steve","3333-3333","steve@gmail.com"},{}};
        
        
        // Exemplo 1: Recuperando o e-mail do Bill
        System.out.println(agenda[0][2]);
        
        
        
        // Exemplo 2: Montando a agenda de contatos
        // O primeiro laço percorre as linhas
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("_____________________");
        
        
        
        // O segundo laço dentro do primeiro laço, percorre as colunas, montando a agenda.
            for (int j = 0; j <agenda[i].length; j++) {
                System.out.println(agenda[i][j]);
            
            
            
            
            
            }
        }
    }
}
