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
    }
}
