/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package array_3;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Array_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor, menor, num;
        int[] numeros;
        numeros = new int[8];
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduce un número: ");
            num = teclado.nextInt();
            numeros[i] = num;
        }
        
        Arrays.sort(numeros);
        mayor = numeros[7];
        menor = numeros[0];
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        
    }
}
