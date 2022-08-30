package apoo05;

import entity.Cuenta;
import services.CuentaService;

public class apoo05 {
    public static void main(String[] args) {
        CuentaService cs = new CuentaService();
        Cuenta cuentaDePablo = cs.creaCuenta();
        cs.ingresarDinero(cuentaDePablo,1000);
        cs.retirarDinero(cuentaDePablo,1000);
        cs.retiroRapido(cuentaDePablo);
        cs.consultarSaldo(cuentaDePablo);
        cs.consultarDatos(cuentaDePablo);
    }
}
