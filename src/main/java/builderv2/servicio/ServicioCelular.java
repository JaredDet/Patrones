package builderv2.servicio;

import builderv2.modelo.celular.Celular;
import builderv2.modelo.celular.ConstructorCelular;

public class ServicioCelular {

    public static Celular construirCelularEjemplo(){

        return ConstructorCelular
                .celular()
                .agregarPantalla("SuperAmoled")
                .agregarParlante("Sony x3")
                .agregarBateria(90)
                .isTouch()
                .construir();
    }

    public static void mostrarCelularEjemplo(){

        var celular = construirCelularEjemplo();
        System.out.println(celular);
    }

}
