/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividad2;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Actividad2_1 {

    public static void main(String[] args) {
        double area, base, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar la base del rectangulo:");
        base = teclado.nextDouble();
        System.out.println ("ingrese la altura: ");
        altura=teclado.nextDouble();
        area = base*altura;
        System.out.println("el area es igual:"+area);
    }
}
