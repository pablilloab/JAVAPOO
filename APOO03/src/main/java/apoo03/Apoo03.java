package apoo03;

import entity.Operacion;
import services.OperacionService;

public class Apoo03 {
    public static void main(String[] args) {
        Operacion calculadora = new Operacion();
        OperacionService calcular = new OperacionService();

        calculadora = calcular.crearOperacion();

        System.out.println(calcular.sumar(calculadora));
        System.out.println(calcular.restar(calculadora));
        System.out.println(calcular.multiplicar(calculadora));
        System.out.println(calcular.dividir(calculadora));
    }
}
