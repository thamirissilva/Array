package br.com.array;

/*
 * Estudo Array - exemplo 1 - Array simples
 *
 * @author Thamiris da Silva Souza
 *
 * O que determina o array são os "[]" 
 * Ele cria um índice
 *
 */


public class Array1 {
    public static void main(String[] args) {
        // Sem array
        // String - Cria uma variável, aceita uma cadeia de caracteres, vários caracteres.
        
        System.out.println("Array simples");
        System.out.println("1. Sem array");
        String time1 = "Palmeiras";
        String time2 = "Corinthians";
        String time3 = "São Paulo";        
        String time4 = "Santos";  
        System.out.println("Time: "+time2);
        System.out.println("Com array");
        // a linha abaixo cria um array simples de tamanho 4
        String[] times = {"Palmeiras","Corinthians","São Paulo","Santos"};
        // a linha abaixo exibe o conteúdo do array na posição [1]
        //[0][1][2][3]
        System.out.println("Time: " + times[1]);
        // na linha abaixo o .length exibe o tamanho do array
        System.out.println("Tamanho do Array " + times.length);
        // a linha abaixo altera o conteúdo de um array
        times[1] = "Flamengo";
        System.out.println("Time: " + times[1]);
       
    }
    
}
