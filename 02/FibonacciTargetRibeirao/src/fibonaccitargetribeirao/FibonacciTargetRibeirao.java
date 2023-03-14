/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccitargetribeirao;

import java.util.Scanner;
        
/**
 *
 * @author joaob
 */
public class FibonacciTargetRibeirao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num; // informado pelo usuário
        
        // coletar o número
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inteiro nao-negativo: ");
        num = sc.nextInt();
        
        if ( num < 0 )
        {
            System.out.println("O numero informado deve ser nao-negativo!");
            System.out.println("Voce informou: " + num);
            return;
        }
        
        // construir a sequência de Fibonacci
        int a;
        int b;
        int soma;
        boolean encontrado;
        
        a = 0;
        b = 1;
        soma = 0;
        encontrado = false;
        
        while ( soma <= num ) {
            if ( soma == num ) {
                encontrado = true;
                break;
            }
            soma = a + b;
            a = b;
            b = soma;
        }

        // saídas
        if ( encontrado ) {
            System.out.println("O numero '" + num + "' pertence a sequencia de Fibonacci.");
        }
        else {
            System.out.println("O numero '" + num + "' nao pertence a sequencia de Fibonacci.");
        }
        
    } // main
        
} // classe
