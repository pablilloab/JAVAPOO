package apoo04;

import entity.Rectangulo;
import services.RectanguloService;

public class Apoo04 {
    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        Rectangulo miRectangulo = rs.crearRectangulo();

        rs.dibujarRectangulo(miRectangulo);
        System.out.println(rs.calcularPerimetro(miRectangulo));
        System.out.println(rs.calcularSuperficie(miRectangulo));
    }
}
