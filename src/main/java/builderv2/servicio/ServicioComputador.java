package builderv2.servicio;

import builderv2.modelo.Computador;
import builderv2.modelo.ConstructorComputador;

public class ServicioComputador {

    public static Computador construirComputadorEjemplo(){

        return ConstructorComputador
                .computador()
                .agregarMarca("AMD")
                .agregarProcesador("Ryzen 5")
                .agregarRam(16)
                .construir();
    }

    public static void mostrarComputadorEjemplo(){

        var computador = construirComputadorEjemplo();
        System.out.println(computador);
    }
}
