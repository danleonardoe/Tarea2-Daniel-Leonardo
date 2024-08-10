/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t2.ejercicio6;
import java.util.Scanner;
/**
 *
 * @author DANIE
 */
public class T2Ejercicio6 {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa un anio: ");
            int anio = scanner.nextInt();

            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El anio " + anio + " es bisiesto.");
            } else {
                System.out.println("El anio " + anio + " no es bisiesto.");
            }
        }
    }
}