package main;

import java.util.Scanner;
import Libro.Libro;
import CuentaBancaria.CuentaBancaria;
import Estudiante.Estudiante;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== INGRESO DE DATOS POR CONSOLA ===");

        // --- 1. Lectura e instanciación de Libro ---
        System.out.println("--- Datos del Libro ---");
        System.out.print("Ingrese título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        Libro libroUsuario = new Libro(titulo, autor, paginas);
        Libro libroDefecto = new Libro(); // Probar constructor por defecto

        // --- 2. Lectura e instanciación de CuentaBancaria ---
        System.out.println("\n--- Datos de la Cuenta Bancaria ---");
        System.out.print("Ingrese número de cuenta: ");
        String numCuenta = scanner.nextLine();
    }
}
