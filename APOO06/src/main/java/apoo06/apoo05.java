package apoo06;

import entity.Cafetera;
import services.CafeteraService;

public class apoo05 {
    public static void main(String[] args) {
        Cafetera miCafetera = new Cafetera(1000,1000);
        CafeteraService cs = new CafeteraService();
        cs.llenarCafetera(miCafetera);

        cs.servirTaza(miCafetera);

        cs.agregarCafe(miCafetera);


    }
}
