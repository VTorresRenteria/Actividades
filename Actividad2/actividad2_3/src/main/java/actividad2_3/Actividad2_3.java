/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividad2_3;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Actividad2_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, masa, altura;
        System.out.println("Introduce tu peso en kg: ");
        peso = teclado.nextDouble();
        System.out.println("Introduce tu altura en metros: ");
        altura = teclado.nextDouble();
        masa = peso / (altura * altura);
        System.out.println("Tu índice de masa corporal es: " + masa);
    }
}
