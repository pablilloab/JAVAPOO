package services;

import entity.Cuenta;

import java.util.Scanner;

public class CuentaService {
    Scanner read = new Scanner(System.in);

    public Cuenta creaCuenta(){
        System.out.println("Ingrese el DNI del cliente");
        String dni = read.nextLine();
        System.out.println("Ingrese el saldo del cliente");
        double saldo = read.nextDouble();
        return new Cuenta (dni, saldo);
    }

    public void ingresarDinero(Cuenta cuenta, double ingreso) {
        cuenta.setSaldo(cuenta.getSaldo() + ingreso);
        System.out.println("Operacion finalizada correctamente");
    }

    public void retirarDinero (Cuenta cuenta, double retiro){
        if(cuenta.getSaldo() < retiro) {
            cuenta.setSaldo(0);
        }else{
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
        }
        System.out.println("Operacion finalizada correctamente");
    }

    public void retiroRapido(Cuenta cuenta){
        this.retirarDinero(cuenta, (cuenta.getSaldo() * 0.2));
    }

    public void consultarSaldo(Cuenta cuenta){
        System.out.println("El saldo disponible es " + cuenta.getSaldo());
    }

    public void consultarDatos(Cuenta cuenta){
        System.out.println("Datos de la cuenta ");
        System.out.println(cuenta.toString());
    }
}
