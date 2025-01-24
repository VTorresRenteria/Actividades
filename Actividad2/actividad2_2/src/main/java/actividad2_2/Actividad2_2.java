/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividad2_2;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Actividad2_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma=0, promedio;
        
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            suma = suma + numero;
            }

            promedio = suma / 3;
            System.out.println("El promedio de los 3 numeros es: " + promedio);
        }

    }


