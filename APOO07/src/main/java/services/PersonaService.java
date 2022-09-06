package services;

import entity.Persona;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonaService {
    Scanner read = new Scanner(System.in);

    public Persona crearPersonas(){
        System.out.printf("Ingrese el nombre de la persona");
        String nombre = read.nextLine();
        System.out.println("Ingrese la edad");
        int edad = read.nextInt();

        //Valido sexo
        String sexo = "";
        do {
            System.out.println("Ingrese el sexo (H, M, O)");
            sexo = read.nextLine();
        }while (!sexo.equals("M") && !sexo.equals("H") && !sexo.equals("O"));

        System.out.println("Ingrese el peso de la persona (Kg)");
        double peso = read.nextDouble();

        System.out.println("Ingrese la altura de la persona (m)");
        double altura = read.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

   // public int calcularIMC(Persona persona) {
    //    double imc = 0;
    //    imc = persona.getPeso()/(Math.pow(persona.getAltura(),2));
    //    if (imc )
    //}
}
