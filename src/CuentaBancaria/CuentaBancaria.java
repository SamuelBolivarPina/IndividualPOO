package CuentaBancaria;

public class CuentaBancaria {
    // Atributos de la clase
    public String numeroCuenta;
    public double saldo;
    public String tipoCuenta;

    // 2. Constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta)
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo inicial por defecto
        this.tipoCuenta = tipoCuenta;
        // 3. Constructor sobrecargado con tres parámetros (numeroCuenta, saldo y tipoCuenta)
    }
    // 3. Constructor sobrecargado con tres parámetros (numeroCuenta, saldo y tipoCuenta)
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    // Getters y Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    // Metodo para mostrar Detalles de la Cuenta Bancaria
    public void mostrarDetalles() {
        System.out.println("--- Detalles de la Cuenta Bancaria ---");
        System.out.println("Número de Cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: $" + this.saldo);
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);
    }
}
