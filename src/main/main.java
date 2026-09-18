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
        System.out.println("--- Datos de la Cuenta Bancaria ---");
        System.out.print("Ingrese número de cuenta: ");
        String numCuenta = scanner.nextLine();

        System.out.print("Ingrese saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese tipo de cuenta (Ahorros/Corriente): ");
        String tipoCuenta = scanner.nextLine();

        CuentaBancaria cuentaUsuario = new CuentaBancaria(numCuenta, saldo, tipoCuenta);
        CuentaBancaria cuentaDosParams = new CuentaBancaria(numCuenta, tipoCuenta); // Probar constructor de 2 parámetros

        // --- 3. Lectura e instanciación de Estudiante ---
        System.out.println("\n--- Datos del Estudiante ---");
        System.out.print("Ingrese nombre del estudiante: ");
        String nombreEst = scanner.nextLine();

        System.out.print("Ingrese edad del estudiante: ");
        int edadEst = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese curso del estudiante: ");
        String cursoEst = scanner.nextLine();
    }
}
