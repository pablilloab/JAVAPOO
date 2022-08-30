package entities;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia(){

    }
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia (double radio){
        this.setRadio(radio);
    }

    public double area(){
        return (3.14 * (this.radio * this.radio));
    }

    public double perimetro(){
        return 2 * 3.14 * this.radio;
    }
}
