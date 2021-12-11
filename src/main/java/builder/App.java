package builder;

import builder.servicio.ServicioComputador;

public class App {

    public static void main(String[] args) {

        var computador = ServicioComputador
                .comprarComputador("AMD");
        System.out.println(computador);
    }
}
