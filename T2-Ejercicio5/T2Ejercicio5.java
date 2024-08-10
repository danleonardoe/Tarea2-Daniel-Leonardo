/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2.ejercicio5;
import java.util.Scanner;
public class T2Ejercicio5 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el numero del mes (1-12): ");
            int numeroMes = scanner.nextInt();

            String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                              "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

            if (numeroMes >= 1 && numeroMes <= 12) {
                System.out.println("El mes es: " + meses[numeroMes - 1]);
            } else {
                System.out.println("Numero de mes inválido");
            }
        }
    }
}