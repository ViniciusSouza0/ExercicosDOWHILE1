package com.mycompany.exerciciosdowhile1;
import static java.time.Clock.system;
import java.util.Scanner;
public class ExerciciosDOWHILE1 {
public static void main(String[] args) {
     
//15-03 EXERCÍCIOS DE DO-WHILE
//1. Exiba todos os números pares até um limite fornecido pelo usuário.
//2. Solicite um número inteiro positivo ao usuário e exiba a soma de todos os números inteiros positivos até esse número.
//3. Solicite um número inteiro ao usuário e exiba a tabuada desse número.
//4. Exiba todos os números primos até um limite fornecido pelo usuário.
//Dica: Use com IF-ELSE
 
Scanner teclado = new Scanner(System.in);
    System.out.println(" Digite um número limite: ");
    int limite = teclado.nextInt();
    int numero = 2;
    
    do{ 
        System.out.println(numero);
        numero += 2;
        
    } while (numero <= limite);
    teclado.close();
}
}
    

    // Apenas print na tela com número definido
    //int limite = 20;
    //int numero = 0;
    
    //do{ 
    //    numero += 2;
        
   // } while (numero <= limite);
   // teclado.close();
//}
//}