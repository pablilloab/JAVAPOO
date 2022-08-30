package services;

import entity.Rectangulo;

import java.util.Scanner;

public class RectanguloService {
    Scanner read = new Scanner(System.in);

    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo ");
        int base = read.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int altura = read.nextInt();

        return new Rectangulo(base, altura);
    }

    public int calcularSuperficie(Rectangulo rectangulo){
        return rectangulo.getBase() * rectangulo.getAltura();
    }

    public int calcularPerimetro(Rectangulo rectangulo){
        return (rectangulo.getBase() + rectangulo.getAltura()) * 2;
    }

    public void dibujarRectangulo(Rectangulo rectangulo){
        for (int i = 0; i < rectangulo.getBase(); i++){
            for (int j = 0; j < rectangulo.getAltura(); j++){
                if (i == 0 || j == 0 || i == rectangulo.getBase() - 1 || j == rectangulo.getAltura()- 1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
