package services;

import entity.Operacion;

import java.util.Scanner;

public class OperacionService {
    Scanner read = new Scanner(System.in);

    public Operacion crearOperacion(){
        System.out.println("Ingrese el primer numero");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = read.nextInt();

        return new Operacion(num1, num2);
    }

    public int sumar(Operacion operacion){
        return operacion.getNumero1() + operacion.getNumero2();
    }

    public int restar(Operacion operacion){
        return operacion.getNumero1() - operacion.getNumero2();
    }

    public int multiplicar(Operacion operacion){
        return checkZero(operacion) ? 0 : operacion.getNumero1() * operacion.getNumero2();

    }

    public double dividir(Operacion operacion){
        return checkZero(operacion) ? 0 : operacion.getNumero1() / operacion.getNumero2();
    }

    private boolean checkZero(Operacion operacion){
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0){
            return true;
        }else{
            return false;
        }
    }


}
