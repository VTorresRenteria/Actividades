/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package array_2;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Array_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros;
        numeros = new int[5];
        int suma=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número: ");
            numeros[i] = teclado.nextInt();
            suma = suma+numeros[i];
        }
        System.out.println("La suma de los números es: " + suma);
        
    }
}
