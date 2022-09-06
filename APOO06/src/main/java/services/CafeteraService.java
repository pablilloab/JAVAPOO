package services;

import entity.Cafetera;

import java.util.Scanner;

public class CafeteraService {
    Scanner read = new Scanner(System.in);

    public void llenarCafetera (Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Cafetera llena");
    }

    public void servirTaza (Cafetera cafetera){
        System.out.println("Ingrese el tamaño del a taza");
        int tamanoTaza = read.nextInt();

        if (tamanoTaza > cafetera.getCantidadActual()){
            System.out.println("No hay cafe suficiente para llenar la taza");
            System.out.println("Falta llenar " + (tamanoTaza - cafetera.getCantidadActual()));
            this.vaciarCafetera(cafetera);
        }else{
            System.out.println("Taza llena");
            cafetera.setCantidadActual((cafetera.getCantidadActual())-tamanoTaza);
        }
    }

    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera){
        System.out.println("Ingrese cantidad a agregar");
        int cantidadAgregar = read.nextInt();
        if (cafetera.getCantidadActual() + cantidadAgregar > cafetera.getCapacidadMaxima()){
            System.out.println("La cafetera se llenó");
            System.out.println("Te sobra " + (cafetera.getCapacidadMaxima() - cafetera.getCantidadActual()));
            this.llenarCafetera(cafetera);
        }else{
            System.out.println("Cafe agregado");
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadAgregar);
            System.out.println("La cafetera quedo con " + cafetera.getCantidadActual());
        }
    }
}
