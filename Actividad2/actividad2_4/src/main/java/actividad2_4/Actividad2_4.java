/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividad2_4;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Actividad2_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, salarioNeto, porcentajeImpuestos, deduccionesAdicionales, impuesto;
        System.out.println("Introduce el salario bruto: ");
        salarioBruto = teclado.nextDouble();
        System.out.println("Introduce el porcentaje de impuestos: ");
        porcentajeImpuestos = teclado.nextDouble();
        System.out.println("Introduce las deducciones adicionales: ");
        deduccionesAdicionales = teclado.nextDouble();
        impuesto = salarioBruto * porcentajeImpuestos / 100;
        salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;
        System.out.println("El salario neto es: " + salarioNeto);
    }
}
