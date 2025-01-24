/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package array_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Array_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int[] numeros;
        numeros = new int[8];
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduce un número: ");
            num = teclado.nextInt();
            numeros[i] = num;
        }

        int [] invertido = new int[numeros.length];
        for (int k = 0; k < numeros.length; k++) {
            invertido[k] = numeros[numeros.length -1 -k];
        }
        System.out.println("Array Invertido: "+ Arrays.toString(invertido));
    }
}
