/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Arrays;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class array_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pares = 0, impares = 0, num;
        int [] numeros;
        numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un número: ");
            num = teclado.nextInt();
            numeros[i] = num;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                pares=pares+1;
            }else{
                impares=impares+1;
            }
        }
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
    }
}
