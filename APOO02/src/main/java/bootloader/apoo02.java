package bootloader;

import entities.Circunferencia;

import java.util.Scanner;

public class apoo02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Circunferencia circ1 = new Circunferencia();
        System.out.println("Ingrese el radio");
        circ1.crearCircunferencia(read.nextDouble());
        System.out.println("Area " + circ1.area());
        System.out.println("Perimetro " + circ1.perimetro());
    }
}
