package entity;

public class Cuenta {
    private static int numeroCuenta;
    private String dni;
    private double saldo;

    public Cuenta(){

    }

    public Cuenta(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        Cuenta.numeroCuenta++;
    }

    public static int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "dni='" + dni + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
