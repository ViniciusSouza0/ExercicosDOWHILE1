package com.mycompany.exerciciosdowhile;
import java.util.Scanner;
public class ExerciciosDOWHILE {
public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Digite um número para fazer a contagem regressiva:");
        int contador = teclado.nextInt();
        
        do { System.out.println(contador);
        contador --;
        }while (contador >=1);
        System.out.println("Final da contagem ");
    }
}
