/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2.ejercicio2;

/**
 *
 * @author DANIE
 */
import java.util.Scanner;
public class T2Ejercicio2 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero entero: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer numero entero: ");
        int num3 = scanner.nextInt();

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);

        scanner.close();
    }
}